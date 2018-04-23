package haykel.talalarmo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link State}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableState.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "State"})
public final class ImmutableState implements State {
  private final State.Settings settings;
  private final State.Alarm alarm;

  private ImmutableState(State.Settings settings, State.Alarm alarm) {
    this.settings = settings;
    this.alarm = alarm;
  }

  /**
   * @return The value of the {@code settings} attribute
   */
  @Override
  public State.Settings settings() {
    return settings;
  }

  /**
   * @return The value of the {@code alarm} attribute
   */
  @Override
  public State.Alarm alarm() {
    return alarm;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State#settings() settings} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for settings
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableState withSettings(State.Settings value) {
    if (this.settings == value) return this;
    return new ImmutableState(ImmutableState.requireNonNull(value, "settings"), this.alarm);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State#alarm() alarm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for alarm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableState withAlarm(State.Alarm value) {
    if (this.alarm == value) return this;
    return new ImmutableState(this.settings, ImmutableState.requireNonNull(value, "alarm"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableState
        && equalTo((ImmutableState) another);
  }

  private boolean equalTo(ImmutableState another) {
    return settings.equals(another.settings)
        && alarm.equals(another.alarm);
  }

  /**
   * Computes a hash code from attributes: {@code settings}, {@code alarm}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + settings.hashCode();
    h = h * 17 + alarm.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code State...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "State{"
        + "settings=" + settings
        + ", alarm=" + alarm
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link State} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable State instance
   */
  public static ImmutableState copyOf(State instance) {
    if (instance instanceof ImmutableState) {
      return (ImmutableState) instance;
    }
    return ImmutableState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableState ImmutableState}.
   * @return A new ImmutableState builder
   */
  public static ImmutableState.Builder builder() {
    return new ImmutableState.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableState ImmutableState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SETTINGS = 0x1L;
    private static final long INIT_BIT_ALARM = 0x2L;
    private long initBits = 0x3;

    private State.Settings settings;
    private State.Alarm alarm;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code State} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(State instance) {
      ImmutableState.requireNonNull(instance, "instance");
      settings(instance.settings());
      alarm(instance.alarm());
      return this;
    }

    /**
     * Initializes the value for the {@link State#settings() settings} attribute.
     * @param settings The value for settings 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder settings(State.Settings settings) {
      this.settings = ImmutableState.requireNonNull(settings, "settings");
      initBits &= ~INIT_BIT_SETTINGS;
      return this;
    }

    /**
     * Initializes the value for the {@link State#alarm() alarm} attribute.
     * @param alarm The value for alarm 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder alarm(State.Alarm alarm) {
      this.alarm = ImmutableState.requireNonNull(alarm, "alarm");
      initBits &= ~INIT_BIT_ALARM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableState ImmutableState}.
     * @return An immutable instance of State
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableState(settings, alarm);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SETTINGS) != 0) attributes.add("settings");
      if ((initBits & INIT_BIT_ALARM) != 0) attributes.add("alarm");
      return "Cannot build State, some of required attributes are not set " + attributes;
    }
  }

  private static <T> T requireNonNull(T object, String message) {
    if (object == null) throw new NullPointerException(message);
    return object;
  }
}
