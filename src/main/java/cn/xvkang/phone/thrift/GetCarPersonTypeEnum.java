/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;


public enum GetCarPersonTypeEnum implements org.apache.thrift.TEnum {
  PHOTO(1),
  CPH(2);

  private final int value;

  private GetCarPersonTypeEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static GetCarPersonTypeEnum findByValue(int value) { 
    switch (value) {
      case 1:
        return PHOTO;
      case 2:
        return CPH;
      default:
        return null;
    }
  }
}
