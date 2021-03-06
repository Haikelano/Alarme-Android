package haykel.talalarmo.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import haykel.jedux.Action;
import haykel.talalarmo.Actions;
import haykel.talalarmo.App;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (App.getState().alarm().on()) {
            App.dispatch(new Action<>(Actions.Alarm.RESTART_ALARM));
        }
    }
}
