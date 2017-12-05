// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculateArea.proto

package com.example.server.area;

/**
 * Protobuf enum {@code com.example.server.area.AreaFor}
 */
public enum AreaFor
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CIRCLE = 0;</code>
   */
  CIRCLE(0),
  /**
   * <code>RECTANGLE = 1;</code>
   */
  RECTANGLE(1),
  /**
   * <code>SQUARE = 2;</code>
   */
  SQUARE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CIRCLE = 0;</code>
   */
  public static final int CIRCLE_VALUE = 0;
  /**
   * <code>RECTANGLE = 1;</code>
   */
  public static final int RECTANGLE_VALUE = 1;
  /**
   * <code>SQUARE = 2;</code>
   */
  public static final int SQUARE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AreaFor valueOf(int value) {
    return forNumber(value);
  }

  public static AreaFor forNumber(int value) {
    switch (value) {
      case 0: return CIRCLE;
      case 1: return RECTANGLE;
      case 2: return SQUARE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AreaFor>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AreaFor> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AreaFor>() {
          public AreaFor findValueByNumber(int number) {
            return AreaFor.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.server.area.CalculateArea.getDescriptor().getEnumTypes().get(0);
  }

  private static final AreaFor[] VALUES = values();

  public static AreaFor valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AreaFor(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.example.server.area.AreaFor)
}
