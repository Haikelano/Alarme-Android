package haykel.talalarmo.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import haykel.talalarmo.Actions;
import haykel.talalarmo.App;
import trikita.jedux.Action;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        App.dispatch(new Action<>(Actions.Alarm.WAKEUP));
    }
}
