package haykel.talalarmo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link State.Alarm}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAlarm.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "State.Alarm"})
public final class ImmutableAlarm extends State.Alarm {
  private final boolean on;
  private final int minutes;
  private final int hours;
  private final boolean am;

  private ImmutableAlarm(boolean on, int minutes, int hours, boolean am) {
    this.on = on;
    this.minutes = minutes;
    this.hours = hours;
    this.am = am;
  }

  /**
   * @return The value of the {@code on} attribute
   */
  @Override
  public boolean on() {
    return on;
  }

  /**
   * @return The value of the {@code minutes} attribute
   */
  @Override
  public int minutes() {
    return minutes;
  }

  /**
   * @return The value of the {@code hours} attribute
   */
  @Override
  public int hours() {
    return hours;
  }

  /**
   * @return The value of the {@code am} attribute
   */
  @Override
  public boolean am() {
    return am;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Alarm#on() on} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for on
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlarm withOn(boolean value) {
    if (this.on == value) return this;
    return new ImmutableAlarm(value, this.minutes, this.hours, this.am);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Alarm#minutes() minutes} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for minutes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlarm withMinutes(int value) {
    if (this.minutes == value) return this;
    return new ImmutableAlarm(this.on, value, this.hours, this.am);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Alarm#hours() hours} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hours
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlarm withHours(int value) {
    if (this.hours == value) return this;
    return new ImmutableAlarm(this.on, this.minutes, value, this.am);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Alarm#am() am} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for am
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAlarm withAm(boolean value) {
    if (this.am == value) return this;
    return new ImmutableAlarm(this.on, this.minutes, this.hours, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAlarm} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAlarm
        && equalTo((ImmutableAlarm) another);
  }

  private boolean equalTo(ImmutableAlarm another) {
    return on == another.on
        && minutes == another.minutes
        && hours == another.hours
        && am == another.am;
  }

  /**
   * Computes a hash code from attributes: {@code on}, {@code minutes}, {@code hours}, {@code am}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + (on ? 1231 : 1237);
    h = h * 17 + minutes;
    h = h * 17 + hours;
    h = h * 17 + (am ? 1231 : 1237);
    return h;
  }

  /**
   * Prints the immutable value {@code Alarm...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Alarm{"
        + "on=" + on
        + ", minutes=" + minutes
        + ", hours=" + hours
        + ", am=" + am
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link State.Alarm} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Alarm instance
   */
  public static ImmutableAlarm copyOf(State.Alarm instance) {
    if (instance instanceof ImmutableAlarm) {
      return (ImmutableAlarm) instance;
    }
    return ImmutableAlarm.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAlarm ImmutableAlarm}.
   * @return A new ImmutableAlarm builder
   */
  public static ImmutableAlarm.Builder builder() {
    return new ImmutableAlarm.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAlarm ImmutableAlarm}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ON = 0x1L;
    private static final long INIT_BIT_MINUTES = 0x2L;
    private static final long INIT_BIT_HOURS = 0x4L;
    private static final long INIT_BIT_AM = 0x8L;
    private long initBits = 0xf;

    private boolean on;
    private int minutes;
    private int hours;
    private boolean am;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Alarm} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(State.Alarm instance) {
      ImmutableAlarm.requireNonNull(instance, "instance");
      on(instance.on());
      minutes(instance.minutes());
      hours(instance.hours());
      am(instance.am());
      return this;
    }

    /**
     * Initializes the value for the {@link State.Alarm#on() on} attribute.
     * @param on The value for on 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder on(boolean on) {
      this.on = on;
      initBits &= ~INIT_BIT_ON;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Alarm#minutes() minutes} attribute.
     * @param minutes The value for minutes 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder minutes(int minutes) {
      this.minutes = minutes;
      initBits &= ~INIT_BIT_MINUTES;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Alarm#hours() hours} attribute.
     * @param hours The value for hours 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder hours(int hours) {
      this.hours = hours;
      initBits &= ~INIT_BIT_HOURS;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Alarm#am() am} attribute.
     * @param am The value for am 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder am(boolean am) {
      this.am = am;
      initBits &= ~INIT_BIT_AM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAlarm ImmutableAlarm}.
     * @return An immutable instance of Alarm
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAlarm build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAlarm(on, minutes, hours, am);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ON) != 0) attributes.add("on");
      if ((initBits & INIT_BIT_MINUTES) != 0) attributes.add("minutes");
      if ((initBits & INIT_BIT_HOURS) != 0) attributes.add("hours");
      if ((initBits & INIT_BIT_AM) != 0) attributes.add("am");
      return "Cannot build Alarm, some of required attributes are not set " + attributes;
    }
  }

  private static <T> T requireNonNull(T object, String message) {
    if (object == null) throw new NullPointerException(message);
    return object;
  }
}
