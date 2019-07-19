/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-18")
public class SendPhotoResponseData implements org.apache.thrift.TBase<SendPhotoResponseData, SendPhotoResponseData._Fields>, java.io.Serializable, Cloneable, Comparable<SendPhotoResponseData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SendPhotoResponseData");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UPLOAD_PHOTO_RESULT_ENUM_FIELD_DESC = new org.apache.thrift.protocol.TField("uploadPhotoResultEnum", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SendPhotoResponseDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SendPhotoResponseDataTupleSchemeFactory();

  /**
   * 
   * @see Result_Code
   */
  public @org.apache.thrift.annotation.Nullable Result_Code code; // optional
  /**
   * 
   * @see UploadPhotoResultEnum
   */
  public @org.apache.thrift.annotation.Nullable UploadPhotoResultEnum uploadPhotoResultEnum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see Result_Code
     */
    CODE((short)1, "code"),
    /**
     * 
     * @see UploadPhotoResultEnum
     */
    UPLOAD_PHOTO_RESULT_ENUM((short)2, "uploadPhotoResultEnum");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODE
          return CODE;
        case 2: // UPLOAD_PHOTO_RESULT_ENUM
          return UPLOAD_PHOTO_RESULT_ENUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CODE,_Fields.UPLOAD_PHOTO_RESULT_ENUM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Result_Code.class)));
    tmpMap.put(_Fields.UPLOAD_PHOTO_RESULT_ENUM, new org.apache.thrift.meta_data.FieldMetaData("uploadPhotoResultEnum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, UploadPhotoResultEnum.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SendPhotoResponseData.class, metaDataMap);
  }

  public SendPhotoResponseData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SendPhotoResponseData(SendPhotoResponseData other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetUploadPhotoResultEnum()) {
      this.uploadPhotoResultEnum = other.uploadPhotoResultEnum;
    }
  }

  public SendPhotoResponseData deepCopy() {
    return new SendPhotoResponseData(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.uploadPhotoResultEnum = null;
  }

  /**
   * 
   * @see Result_Code
   */
  @org.apache.thrift.annotation.Nullable
  public Result_Code getCode() {
    return this.code;
  }

  /**
   * 
   * @see Result_Code
   */
  public SendPhotoResponseData setCode(@org.apache.thrift.annotation.Nullable Result_Code code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  /**
   * 
   * @see UploadPhotoResultEnum
   */
  @org.apache.thrift.annotation.Nullable
  public UploadPhotoResultEnum getUploadPhotoResultEnum() {
    return this.uploadPhotoResultEnum;
  }

  /**
   * 
   * @see UploadPhotoResultEnum
   */
  public SendPhotoResponseData setUploadPhotoResultEnum(@org.apache.thrift.annotation.Nullable UploadPhotoResultEnum uploadPhotoResultEnum) {
    this.uploadPhotoResultEnum = uploadPhotoResultEnum;
    return this;
  }

  public void unsetUploadPhotoResultEnum() {
    this.uploadPhotoResultEnum = null;
  }

  /** Returns true if field uploadPhotoResultEnum is set (has been assigned a value) and false otherwise */
  public boolean isSetUploadPhotoResultEnum() {
    return this.uploadPhotoResultEnum != null;
  }

  public void setUploadPhotoResultEnumIsSet(boolean value) {
    if (!value) {
      this.uploadPhotoResultEnum = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Result_Code)value);
      }
      break;

    case UPLOAD_PHOTO_RESULT_ENUM:
      if (value == null) {
        unsetUploadPhotoResultEnum();
      } else {
        setUploadPhotoResultEnum((UploadPhotoResultEnum)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case UPLOAD_PHOTO_RESULT_ENUM:
      return getUploadPhotoResultEnum();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case UPLOAD_PHOTO_RESULT_ENUM:
      return isSetUploadPhotoResultEnum();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SendPhotoResponseData)
      return this.equals((SendPhotoResponseData)that);
    return false;
  }

  public boolean equals(SendPhotoResponseData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_uploadPhotoResultEnum = true && this.isSetUploadPhotoResultEnum();
    boolean that_present_uploadPhotoResultEnum = true && that.isSetUploadPhotoResultEnum();
    if (this_present_uploadPhotoResultEnum || that_present_uploadPhotoResultEnum) {
      if (!(this_present_uploadPhotoResultEnum && that_present_uploadPhotoResultEnum))
        return false;
      if (!this.uploadPhotoResultEnum.equals(that.uploadPhotoResultEnum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code.getValue();

    hashCode = hashCode * 8191 + ((isSetUploadPhotoResultEnum()) ? 131071 : 524287);
    if (isSetUploadPhotoResultEnum())
      hashCode = hashCode * 8191 + uploadPhotoResultEnum.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SendPhotoResponseData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUploadPhotoResultEnum()).compareTo(other.isSetUploadPhotoResultEnum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUploadPhotoResultEnum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uploadPhotoResultEnum, other.uploadPhotoResultEnum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SendPhotoResponseData(");
    boolean first = true;

    if (isSetCode()) {
      sb.append("code:");
      if (this.code == null) {
        sb.append("null");
      } else {
        sb.append(this.code);
      }
      first = false;
    }
    if (isSetUploadPhotoResultEnum()) {
      if (!first) sb.append(", ");
      sb.append("uploadPhotoResultEnum:");
      if (this.uploadPhotoResultEnum == null) {
        sb.append("null");
      } else {
        sb.append(this.uploadPhotoResultEnum);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SendPhotoResponseDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SendPhotoResponseDataStandardScheme getScheme() {
      return new SendPhotoResponseDataStandardScheme();
    }
  }

  private static class SendPhotoResponseDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<SendPhotoResponseData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SendPhotoResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = cn.xvkang.phone.thrift.Result_Code.findByValue(iprot.readI32());
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPLOAD_PHOTO_RESULT_ENUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uploadPhotoResultEnum = cn.xvkang.phone.thrift.UploadPhotoResultEnum.findByValue(iprot.readI32());
              struct.setUploadPhotoResultEnumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SendPhotoResponseData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        if (struct.isSetCode()) {
          oprot.writeFieldBegin(CODE_FIELD_DESC);
          oprot.writeI32(struct.code.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.uploadPhotoResultEnum != null) {
        if (struct.isSetUploadPhotoResultEnum()) {
          oprot.writeFieldBegin(UPLOAD_PHOTO_RESULT_ENUM_FIELD_DESC);
          oprot.writeI32(struct.uploadPhotoResultEnum.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SendPhotoResponseDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SendPhotoResponseDataTupleScheme getScheme() {
      return new SendPhotoResponseDataTupleScheme();
    }
  }

  private static class SendPhotoResponseDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<SendPhotoResponseData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SendPhotoResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetUploadPhotoResultEnum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code.getValue());
      }
      if (struct.isSetUploadPhotoResultEnum()) {
        oprot.writeI32(struct.uploadPhotoResultEnum.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SendPhotoResponseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.code = cn.xvkang.phone.thrift.Result_Code.findByValue(iprot.readI32());
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uploadPhotoResultEnum = cn.xvkang.phone.thrift.UploadPhotoResultEnum.findByValue(iprot.readI32());
        struct.setUploadPhotoResultEnumIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

