/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public enum WMResourcePlanStatus implements org.apache.thrift.TEnum {
  ACTIVE(1),
  ENABLED(2),
  DISABLED(3);

  private final int value;

  private WMResourcePlanStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static WMResourcePlanStatus findByValue(int value) { 
    switch (value) {
      case 1:
        return ACTIVE;
      case 2:
        return ENABLED;
      case 3:
        return DISABLED;
      default:
        return null;
    }
  }
}
