package haykel.talalarmo;

import android.app.Application;

import haykel.anvil.Anvil;
import haykel.jedux.Action;
import haykel.jedux.Logger;
import haykel.jedux.Store;
import haykel.talalarmo.alarm.AlarmController;
import haykel.talalarmo.alarm.PersistanceController;

public class App extends Application {

    private static App instance;

    private Store<Action, State> store;

    public static State dispatch(Action action) {
        return instance.store.dispatch(action);
    }

    public static State getState() {
        return instance.store.getState();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        App.instance = this;

        PersistanceController persistanceController = new PersistanceController(this);
        State initialState = persistanceController.getSavedState();
        if (initialState == null) {
            initialState = State.Default.build();
        }

        this.store = new Store<>(new State.Reducer(),
                initialState,
                new Logger<>("Talalarmo"),
                persistanceController,
                new AlarmController(this));

        this.store.subscribe(Anvil::render);
    }
}
