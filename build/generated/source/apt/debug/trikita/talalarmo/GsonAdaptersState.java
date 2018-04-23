package haykel.talalarmo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code State}.
 * @see ImmutableAlarm
 * @see ImmutableSettings
 * @see ImmutableState
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "haykel.talalarmo.State"})
public final class GsonAdaptersState implements TypeAdapterFactory {
  @SuppressWarnings("unchecked") // safe unchecked, type is verified by type token equality
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (AlarmTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new AlarmTypeAdapter(gson);
    }
    if (SettingsTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new SettingsTypeAdapter(gson);
    }
    if (StateTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new StateTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersState(Alarm, Settings, State)";
  }

  private static class AlarmTypeAdapter extends TypeAdapter<State.Alarm> {
    private static final TypeToken<State.Alarm> ALARM_ABSTRACT = TypeToken.get(State.Alarm.class);
    private static final TypeToken<ImmutableAlarm> ALARM_IMMUTABLE = TypeToken.get(ImmutableAlarm.class);

    AlarmTypeAdapter(Gson gson) {
    } 

    static boolean adapts(TypeToken<?> type) {
      return ALARM_ABSTRACT.equals(type)
          || ALARM_IMMUTABLE.equals(type);
    }

    @Override
    public void write(JsonWriter out, State.Alarm value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeAlarm(out, value);
      }
    }

    @Override
    public State.Alarm read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readAlarm(in);
    }

    private void writeAlarm(JsonWriter out, State.Alarm instance)
        throws IOException {
      out.beginObject();
      out.name("on");
      out.value(instance.on());
      out.name("minutes");
      out.value(instance.minutes());
      out.name("hours");
      out.value(instance.hours());
      out.name("am");
      out.value(instance.am());
      out.endObject();
    }

    private State.Alarm readAlarm(JsonReader in)
        throws IOException {
      ImmutableAlarm.Builder builder = ImmutableAlarm.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableAlarm.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 'o':
        if ("on".equals(attributeName)) {
          readInOn(in, builder);
          return;
        }
        break;
      case 'm':
        if ("minutes".equals(attributeName)) {
          readInMinutes(in, builder);
          return;
        }
        break;
      case 'h':
        if ("hours".equals(attributeName)) {
          readInHours(in, builder);
          return;
        }
        break;
      case 'a':
        if ("am".equals(attributeName)) {
          readInAm(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInOn(JsonReader in, ImmutableAlarm.Builder builder)
        throws IOException {
      builder.on(in.nextBoolean());
    }

    private void readInMinutes(JsonReader in, ImmutableAlarm.Builder builder)
        throws IOException {
      builder.minutes(in.nextInt());
    }

    private void readInHours(JsonReader in, ImmutableAlarm.Builder builder)
        throws IOException {
      builder.hours(in.nextInt());
    }

    private void readInAm(JsonReader in, ImmutableAlarm.Builder builder)
        throws IOException {
      builder.am(in.nextBoolean());
    }
  }

  private static class SettingsTypeAdapter extends TypeAdapter<State.Settings> {
    private static final TypeToken<State.Settings> SETTINGS_ABSTRACT = TypeToken.get(State.Settings.class);
    private static final TypeToken<ImmutableSettings> SETTINGS_IMMUTABLE = TypeToken.get(ImmutableSettings.class);

    SettingsTypeAdapter(Gson gson) {
    } 

    static boolean adapts(TypeToken<?> type) {
      return SETTINGS_ABSTRACT.equals(type)
          || SETTINGS_IMMUTABLE.equals(type);
    }

    @Override
    public void write(JsonWriter out, State.Settings value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeSettings(out, value);
      }
    }

    @Override
    public State.Settings read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readSettings(in);
    }

    private void writeSettings(JsonWriter out, State.Settings instance)
        throws IOException {
      out.beginObject();
      out.name("vibrate");
      out.value(instance.vibrate());
      out.name("snap");
      out.value(instance.snap());
      out.name("ramping");
      out.value(instance.ramping());
      out.name("ringtone");
      out.value(instance.ringtone());
      out.name("theme");
      out.value(instance.theme());
      out.endObject();
    }

    private State.Settings readSettings(JsonReader in)
        throws IOException {
      ImmutableSettings.Builder builder = ImmutableSettings.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 'v':
        if ("vibrate".equals(attributeName)) {
          readInVibrate(in, builder);
          return;
        }
        break;
      case 's':
        if ("snap".equals(attributeName)) {
          readInSnap(in, builder);
          return;
        }
        break;
      case 'r':
        if ("ramping".equals(attributeName)) {
          readInRamping(in, builder);
          return;
        }
        if ("ringtone".equals(attributeName)) {
          readInRingtone(in, builder);
          return;
        }
        break;
      case 't':
        if ("theme".equals(attributeName)) {
          readInTheme(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInVibrate(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
      builder.vibrate(in.nextBoolean());
    }

    private void readInSnap(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
      builder.snap(in.nextBoolean());
    }

    private void readInRamping(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
      builder.ramping(in.nextBoolean());
    }

    private void readInRingtone(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
        builder.ringtone(in.nextString());
    }

    private void readInTheme(JsonReader in, ImmutableSettings.Builder builder)
        throws IOException {
      builder.theme(in.nextInt());
    }
  }

  private static class StateTypeAdapter extends TypeAdapter<State> {
    private static final TypeToken<State> STATE_ABSTRACT = TypeToken.get(State.class);
    private static final TypeToken<ImmutableState> STATE_IMMUTABLE = TypeToken.get(ImmutableState.class);
    private static final TypeToken<State.Settings> SETTINGS_TYPE_TOKEN = TypeToken.get(State.Settings.class);
    private static final TypeToken<State.Alarm> ALARM_TYPE_TOKEN = TypeToken.get(State.Alarm.class);
    private final TypeAdapter<State.Settings> settingsTypeAdapter;
    private final TypeAdapter<State.Alarm> alarmTypeAdapter;

    StateTypeAdapter(Gson gson) {
      this.settingsTypeAdapter = gson.getAdapter(SETTINGS_TYPE_TOKEN);
      this.alarmTypeAdapter = gson.getAdapter(ALARM_TYPE_TOKEN);
    } 

    static boolean adapts(TypeToken<?> type) {
      return STATE_ABSTRACT.equals(type)
          || STATE_IMMUTABLE.equals(type);
    }

    @Override
    public void write(JsonWriter out, State value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeState(out, value);
      }
    }

    @Override
    public State read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readState(in);
    }

    private void writeState(JsonWriter out, State instance)
        throws IOException {
      out.beginObject();
      out.name("settings");
      settingsTypeAdapter.write(out, instance.settings());
      out.name("alarm");
      alarmTypeAdapter.write(out, instance.alarm());
      out.endObject();
    }

    private State readState(JsonReader in)
        throws IOException {
      ImmutableState.Builder builder = ImmutableState.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableState.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      switch (attributeName.charAt(0)) {
      case 's':
        if ("settings".equals(attributeName)) {
          readInSettings(in, builder);
          return;
        }
        break;
      case 'a':
        if ("alarm".equals(attributeName)) {
          readInAlarm(in, builder);
          return;
        }
        break;
      default:
      }
      in.skipValue();
    }

    private void readInSettings(JsonReader in, ImmutableState.Builder builder)
        throws IOException {
      State.Settings value = settingsTypeAdapter.read(in);
      builder.settings(value);
    }

    private void readInAlarm(JsonReader in, ImmutableState.Builder builder)
        throws IOException {
      State.Alarm value = alarmTypeAdapter.read(in);
      builder.alarm(value);
    }
  }
}
