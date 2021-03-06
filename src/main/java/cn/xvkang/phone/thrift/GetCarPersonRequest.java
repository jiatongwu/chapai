/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-08-01")
public class GetCarPersonRequest implements org.apache.thrift.TBase<GetCarPersonRequest, GetCarPersonRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetCarPersonRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetCarPersonRequest");

  private static final org.apache.thrift.protocol.TField GET_CAR_PERSON_TYPE_ENUM_FIELD_DESC = new org.apache.thrift.protocol.TField("getCarPersonTypeEnum", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IMAGE_OR_CPH_FIELD_DESC = new org.apache.thrift.protocol.TField("imageOrCph", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetCarPersonRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetCarPersonRequestTupleSchemeFactory();

  /**
   * 
   * @see GetCarPersonTypeEnum
   */
  public GetCarPersonTypeEnum getCarPersonTypeEnum; // optional
  public java.lang.String imageOrCph; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see GetCarPersonTypeEnum
     */
    GET_CAR_PERSON_TYPE_ENUM((short)1, "getCarPersonTypeEnum"),
    IMAGE_OR_CPH((short)2, "imageOrCph");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GET_CAR_PERSON_TYPE_ENUM
          return GET_CAR_PERSON_TYPE_ENUM;
        case 2: // IMAGE_OR_CPH
          return IMAGE_OR_CPH;
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
  private static final _Fields optionals[] = {_Fields.GET_CAR_PERSON_TYPE_ENUM,_Fields.IMAGE_OR_CPH};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GET_CAR_PERSON_TYPE_ENUM, new org.apache.thrift.meta_data.FieldMetaData("getCarPersonTypeEnum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GetCarPersonTypeEnum.class)));
    tmpMap.put(_Fields.IMAGE_OR_CPH, new org.apache.thrift.meta_data.FieldMetaData("imageOrCph", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetCarPersonRequest.class, metaDataMap);
  }

  public GetCarPersonRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetCarPersonRequest(GetCarPersonRequest other) {
    if (other.isSetGetCarPersonTypeEnum()) {
      this.getCarPersonTypeEnum = other.getCarPersonTypeEnum;
    }
    if (other.isSetImageOrCph()) {
      this.imageOrCph = other.imageOrCph;
    }
  }

  public GetCarPersonRequest deepCopy() {
    return new GetCarPersonRequest(this);
  }

  @Override
  public void clear() {
    this.getCarPersonTypeEnum = null;
    this.imageOrCph = null;
  }

  /**
   * 
   * @see GetCarPersonTypeEnum
   */
  public GetCarPersonTypeEnum getGetCarPersonTypeEnum() {
    return this.getCarPersonTypeEnum;
  }

  /**
   * 
   * @see GetCarPersonTypeEnum
   */
  public GetCarPersonRequest setGetCarPersonTypeEnum(GetCarPersonTypeEnum getCarPersonTypeEnum) {
    this.getCarPersonTypeEnum = getCarPersonTypeEnum;
    return this;
  }

  public void unsetGetCarPersonTypeEnum() {
    this.getCarPersonTypeEnum = null;
  }

  /** Returns true if field getCarPersonTypeEnum is set (has been assigned a value) and false otherwise */
  public boolean isSetGetCarPersonTypeEnum() {
    return this.getCarPersonTypeEnum != null;
  }

  public void setGetCarPersonTypeEnumIsSet(boolean value) {
    if (!value) {
      this.getCarPersonTypeEnum = null;
    }
  }

  public java.lang.String getImageOrCph() {
    return this.imageOrCph;
  }

  public GetCarPersonRequest setImageOrCph(java.lang.String imageOrCph) {
    this.imageOrCph = imageOrCph;
    return this;
  }

  public void unsetImageOrCph() {
    this.imageOrCph = null;
  }

  /** Returns true if field imageOrCph is set (has been assigned a value) and false otherwise */
  public boolean isSetImageOrCph() {
    return this.imageOrCph != null;
  }

  public void setImageOrCphIsSet(boolean value) {
    if (!value) {
      this.imageOrCph = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case GET_CAR_PERSON_TYPE_ENUM:
      if (value == null) {
        unsetGetCarPersonTypeEnum();
      } else {
        setGetCarPersonTypeEnum((GetCarPersonTypeEnum)value);
      }
      break;

    case IMAGE_OR_CPH:
      if (value == null) {
        unsetImageOrCph();
      } else {
        setImageOrCph((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GET_CAR_PERSON_TYPE_ENUM:
      return getGetCarPersonTypeEnum();

    case IMAGE_OR_CPH:
      return getImageOrCph();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GET_CAR_PERSON_TYPE_ENUM:
      return isSetGetCarPersonTypeEnum();
    case IMAGE_OR_CPH:
      return isSetImageOrCph();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetCarPersonRequest)
      return this.equals((GetCarPersonRequest)that);
    return false;
  }

  public boolean equals(GetCarPersonRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_getCarPersonTypeEnum = true && this.isSetGetCarPersonTypeEnum();
    boolean that_present_getCarPersonTypeEnum = true && that.isSetGetCarPersonTypeEnum();
    if (this_present_getCarPersonTypeEnum || that_present_getCarPersonTypeEnum) {
      if (!(this_present_getCarPersonTypeEnum && that_present_getCarPersonTypeEnum))
        return false;
      if (!this.getCarPersonTypeEnum.equals(that.getCarPersonTypeEnum))
        return false;
    }

    boolean this_present_imageOrCph = true && this.isSetImageOrCph();
    boolean that_present_imageOrCph = true && that.isSetImageOrCph();
    if (this_present_imageOrCph || that_present_imageOrCph) {
      if (!(this_present_imageOrCph && that_present_imageOrCph))
        return false;
      if (!this.imageOrCph.equals(that.imageOrCph))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetGetCarPersonTypeEnum()) ? 131071 : 524287);
    if (isSetGetCarPersonTypeEnum())
      hashCode = hashCode * 8191 + getCarPersonTypeEnum.getValue();

    hashCode = hashCode * 8191 + ((isSetImageOrCph()) ? 131071 : 524287);
    if (isSetImageOrCph())
      hashCode = hashCode * 8191 + imageOrCph.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetCarPersonRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetGetCarPersonTypeEnum()).compareTo(other.isSetGetCarPersonTypeEnum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetCarPersonTypeEnum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.getCarPersonTypeEnum, other.getCarPersonTypeEnum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetImageOrCph()).compareTo(other.isSetImageOrCph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImageOrCph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imageOrCph, other.imageOrCph);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCarPersonRequest(");
    boolean first = true;

    if (isSetGetCarPersonTypeEnum()) {
      sb.append("getCarPersonTypeEnum:");
      if (this.getCarPersonTypeEnum == null) {
        sb.append("null");
      } else {
        sb.append(this.getCarPersonTypeEnum);
      }
      first = false;
    }
    if (isSetImageOrCph()) {
      if (!first) sb.append(", ");
      sb.append("imageOrCph:");
      if (this.imageOrCph == null) {
        sb.append("null");
      } else {
        sb.append(this.imageOrCph);
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

  private static class GetCarPersonRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetCarPersonRequestStandardScheme getScheme() {
      return new GetCarPersonRequestStandardScheme();
    }
  }

  private static class GetCarPersonRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetCarPersonRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetCarPersonRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GET_CAR_PERSON_TYPE_ENUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.getCarPersonTypeEnum = cn.xvkang.phone.thrift.GetCarPersonTypeEnum.findByValue(iprot.readI32());
              struct.setGetCarPersonTypeEnumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IMAGE_OR_CPH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imageOrCph = iprot.readString();
              struct.setImageOrCphIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetCarPersonRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.getCarPersonTypeEnum != null) {
        if (struct.isSetGetCarPersonTypeEnum()) {
          oprot.writeFieldBegin(GET_CAR_PERSON_TYPE_ENUM_FIELD_DESC);
          oprot.writeI32(struct.getCarPersonTypeEnum.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.imageOrCph != null) {
        if (struct.isSetImageOrCph()) {
          oprot.writeFieldBegin(IMAGE_OR_CPH_FIELD_DESC);
          oprot.writeString(struct.imageOrCph);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetCarPersonRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetCarPersonRequestTupleScheme getScheme() {
      return new GetCarPersonRequestTupleScheme();
    }
  }

  private static class GetCarPersonRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetCarPersonRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetCarPersonRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGetCarPersonTypeEnum()) {
        optionals.set(0);
      }
      if (struct.isSetImageOrCph()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetGetCarPersonTypeEnum()) {
        oprot.writeI32(struct.getCarPersonTypeEnum.getValue());
      }
      if (struct.isSetImageOrCph()) {
        oprot.writeString(struct.imageOrCph);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetCarPersonRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.getCarPersonTypeEnum = cn.xvkang.phone.thrift.GetCarPersonTypeEnum.findByValue(iprot.readI32());
        struct.setGetCarPersonTypeEnumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.imageOrCph = iprot.readString();
        struct.setImageOrCphIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

