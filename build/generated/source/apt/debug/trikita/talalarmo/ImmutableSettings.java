package haykel.talalarmo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link State.Settings}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSettings.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "State.Settings"})
public final class ImmutableSettings implements State.Settings {
  private final boolean vibrate;
  private final boolean snap;
  private final boolean ramping;
  private final String ringtone;
  private final int theme;

  private ImmutableSettings(boolean vibrate, boolean snap, boolean ramping, String ringtone, int theme) {
    this.vibrate = vibrate;
    this.snap = snap;
    this.ramping = ramping;
    this.ringtone = ringtone;
    this.theme = theme;
  }

  /**
   * @return The value of the {@code vibrate} attribute
   */
  @Override
  public boolean vibrate() {
    return vibrate;
  }

  /**
   * @return The value of the {@code snap} attribute
   */
  @Override
  public boolean snap() {
    return snap;
  }

  /**
   * @return The value of the {@code ramping} attribute
   */
  @Override
  public boolean ramping() {
    return ramping;
  }

  /**
   * @return The value of the {@code ringtone} attribute
   */
  @Override
  public String ringtone() {
    return ringtone;
  }

  /**
   * @return The value of the {@code theme} attribute
   */
  @Override
  public int theme() {
    return theme;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Settings#vibrate() vibrate} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vibrate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSettings withVibrate(boolean value) {
    if (this.vibrate == value) return this;
    return new ImmutableSettings(value, this.snap, this.ramping, this.ringtone, this.theme);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Settings#snap() snap} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for snap
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSettings withSnap(boolean value) {
    if (this.snap == value) return this;
    return new ImmutableSettings(this.vibrate, value, this.ramping, this.ringtone, this.theme);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Settings#ramping() ramping} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ramping
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSettings withRamping(boolean value) {
    if (this.ramping == value) return this;
    return new ImmutableSettings(this.vibrate, this.snap, value, this.ringtone, this.theme);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Settings#ringtone() ringtone} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ringtone
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSettings withRingtone(String value) {
    if (this.ringtone.equals(value)) return this;
    return new ImmutableSettings(
        this.vibrate,
        this.snap,
        this.ramping,
        ImmutableSettings.requireNonNull(value, "ringtone"),
        this.theme);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link State.Settings#theme() theme} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for theme
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSettings withTheme(int value) {
    if (this.theme == value) return this;
    return new ImmutableSettings(this.vibrate, this.snap, this.ramping, this.ringtone, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSettings} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSettings
        && equalTo((ImmutableSettings) another);
  }

  private boolean equalTo(ImmutableSettings another) {
    return vibrate == another.vibrate
        && snap == another.snap
        && ramping == another.ramping
        && ringtone.equals(another.ringtone)
        && theme == another.theme;
  }

  /**
   * Computes a hash code from attributes: {@code vibrate}, {@code snap}, {@code ramping}, {@code ringtone}, {@code theme}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + (vibrate ? 1231 : 1237);
    h = h * 17 + (snap ? 1231 : 1237);
    h = h * 17 + (ramping ? 1231 : 1237);
    h = h * 17 + ringtone.hashCode();
    h = h * 17 + theme;
    return h;
  }

  /**
   * Prints the immutable value {@code Settings...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Settings{"
        + "vibrate=" + vibrate
        + ", snap=" + snap
        + ", ramping=" + ramping
        + ", ringtone=" + ringtone
        + ", theme=" + theme
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link State.Settings} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Settings instance
   */
  public static ImmutableSettings copyOf(State.Settings instance) {
    if (instance instanceof ImmutableSettings) {
      return (ImmutableSettings) instance;
    }
    return ImmutableSettings.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSettings ImmutableSettings}.
   * @return A new ImmutableSettings builder
   */
  public static ImmutableSettings.Builder builder() {
    return new ImmutableSettings.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSettings ImmutableSettings}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_VIBRATE = 0x1L;
    private static final long INIT_BIT_SNAP = 0x2L;
    private static final long INIT_BIT_RAMPING = 0x4L;
    private static final long INIT_BIT_RINGTONE = 0x8L;
    private static final long INIT_BIT_THEME = 0x10L;
    private long initBits = 0x1f;

    private boolean vibrate;
    private boolean snap;
    private boolean ramping;
    private String ringtone;
    private int theme;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Settings} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(State.Settings instance) {
      ImmutableSettings.requireNonNull(instance, "instance");
      vibrate(instance.vibrate());
      snap(instance.snap());
      ramping(instance.ramping());
      ringtone(instance.ringtone());
      theme(instance.theme());
      return this;
    }

    /**
     * Initializes the value for the {@link State.Settings#vibrate() vibrate} attribute.
     * @param vibrate The value for vibrate 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder vibrate(boolean vibrate) {
      this.vibrate = vibrate;
      initBits &= ~INIT_BIT_VIBRATE;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Settings#snap() snap} attribute.
     * @param snap The value for snap 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder snap(boolean snap) {
      this.snap = snap;
      initBits &= ~INIT_BIT_SNAP;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Settings#ramping() ramping} attribute.
     * @param ramping The value for ramping 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ramping(boolean ramping) {
      this.ramping = ramping;
      initBits &= ~INIT_BIT_RAMPING;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Settings#ringtone() ringtone} attribute.
     * @param ringtone The value for ringtone 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ringtone(String ringtone) {
      this.ringtone = ImmutableSettings.requireNonNull(ringtone, "ringtone");
      initBits &= ~INIT_BIT_RINGTONE;
      return this;
    }

    /**
     * Initializes the value for the {@link State.Settings#theme() theme} attribute.
     * @param theme The value for theme 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder theme(int theme) {
      this.theme = theme;
      initBits &= ~INIT_BIT_THEME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSettings ImmutableSettings}.
     * @return An immutable instance of Settings
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSettings build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSettings(vibrate, snap, ramping, ringtone, theme);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_VIBRATE) != 0) attributes.add("vibrate");
      if ((initBits & INIT_BIT_SNAP) != 0) attributes.add("snap");
      if ((initBits & INIT_BIT_RAMPING) != 0) attributes.add("ramping");
      if ((initBits & INIT_BIT_RINGTONE) != 0) attributes.add("ringtone");
      if ((initBits & INIT_BIT_THEME) != 0) attributes.add("theme");
      return "Cannot build Settings, some of required attributes are not set " + attributes;
    }
  }

  private static <T> T requireNonNull(T object, String message) {
    if (object == null) throw new NullPointerException(message);
    return object;
  }
}
