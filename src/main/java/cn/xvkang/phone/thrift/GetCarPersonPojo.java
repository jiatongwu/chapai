/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-08-01")
public class GetCarPersonPojo implements org.apache.thrift.TBase<GetCarPersonPojo, GetCarPersonPojo._Fields>, java.io.Serializable, Cloneable, Comparable<GetCarPersonPojo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetCarPersonPojo");

  private static final org.apache.thrift.protocol.TField PERSON_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("personName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CPH_FIELD_DESC = new org.apache.thrift.protocol.TField("cph", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetCarPersonPojoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetCarPersonPojoTupleSchemeFactory();

  public java.lang.String personName; // optional
  public java.lang.String phone; // optional
  public java.lang.String cph; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERSON_NAME((short)1, "personName"),
    PHONE((short)2, "phone"),
    CPH((short)3, "cph");

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
        case 1: // PERSON_NAME
          return PERSON_NAME;
        case 2: // PHONE
          return PHONE;
        case 3: // CPH
          return CPH;
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
  private static final _Fields optionals[] = {_Fields.PERSON_NAME,_Fields.PHONE,_Fields.CPH};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSON_NAME, new org.apache.thrift.meta_data.FieldMetaData("personName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.CPH, new org.apache.thrift.meta_data.FieldMetaData("cph", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetCarPersonPojo.class, metaDataMap);
  }

  public GetCarPersonPojo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetCarPersonPojo(GetCarPersonPojo other) {
    if (other.isSetPersonName()) {
      this.personName = other.personName;
    }
    if (other.isSetPhone()) {
      this.phone = other.phone;
    }
    if (other.isSetCph()) {
      this.cph = other.cph;
    }
  }

  public GetCarPersonPojo deepCopy() {
    return new GetCarPersonPojo(this);
  }

  @Override
  public void clear() {
    this.personName = null;
    this.phone = null;
    this.cph = null;
  }

  public java.lang.String getPersonName() {
    return this.personName;
  }

  public GetCarPersonPojo setPersonName(java.lang.String personName) {
    this.personName = personName;
    return this;
  }

  public void unsetPersonName() {
    this.personName = null;
  }

  /** Returns true if field personName is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonName() {
    return this.personName != null;
  }

  public void setPersonNameIsSet(boolean value) {
    if (!value) {
      this.personName = null;
    }
  }

  public java.lang.String getPhone() {
    return this.phone;
  }

  public GetCarPersonPojo setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  public void unsetPhone() {
    this.phone = null;
  }

  /** Returns true if field phone is set (has been assigned a value) and false otherwise */
  public boolean isSetPhone() {
    return this.phone != null;
  }

  public void setPhoneIsSet(boolean value) {
    if (!value) {
      this.phone = null;
    }
  }

  public java.lang.String getCph() {
    return this.cph;
  }

  public GetCarPersonPojo setCph(java.lang.String cph) {
    this.cph = cph;
    return this;
  }

  public void unsetCph() {
    this.cph = null;
  }

  /** Returns true if field cph is set (has been assigned a value) and false otherwise */
  public boolean isSetCph() {
    return this.cph != null;
  }

  public void setCphIsSet(boolean value) {
    if (!value) {
      this.cph = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PERSON_NAME:
      if (value == null) {
        unsetPersonName();
      } else {
        setPersonName((java.lang.String)value);
      }
      break;

    case PHONE:
      if (value == null) {
        unsetPhone();
      } else {
        setPhone((java.lang.String)value);
      }
      break;

    case CPH:
      if (value == null) {
        unsetCph();
      } else {
        setCph((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PERSON_NAME:
      return getPersonName();

    case PHONE:
      return getPhone();

    case CPH:
      return getCph();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PERSON_NAME:
      return isSetPersonName();
    case PHONE:
      return isSetPhone();
    case CPH:
      return isSetCph();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetCarPersonPojo)
      return this.equals((GetCarPersonPojo)that);
    return false;
  }

  public boolean equals(GetCarPersonPojo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_personName = true && this.isSetPersonName();
    boolean that_present_personName = true && that.isSetPersonName();
    if (this_present_personName || that_present_personName) {
      if (!(this_present_personName && that_present_personName))
        return false;
      if (!this.personName.equals(that.personName))
        return false;
    }

    boolean this_present_phone = true && this.isSetPhone();
    boolean that_present_phone = true && that.isSetPhone();
    if (this_present_phone || that_present_phone) {
      if (!(this_present_phone && that_present_phone))
        return false;
      if (!this.phone.equals(that.phone))
        return false;
    }

    boolean this_present_cph = true && this.isSetCph();
    boolean that_present_cph = true && that.isSetCph();
    if (this_present_cph || that_present_cph) {
      if (!(this_present_cph && that_present_cph))
        return false;
      if (!this.cph.equals(that.cph))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPersonName()) ? 131071 : 524287);
    if (isSetPersonName())
      hashCode = hashCode * 8191 + personName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhone()) ? 131071 : 524287);
    if (isSetPhone())
      hashCode = hashCode * 8191 + phone.hashCode();

    hashCode = hashCode * 8191 + ((isSetCph()) ? 131071 : 524287);
    if (isSetCph())
      hashCode = hashCode * 8191 + cph.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetCarPersonPojo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPersonName()).compareTo(other.isSetPersonName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personName, other.personName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCph()).compareTo(other.isSetCph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cph, other.cph);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCarPersonPojo(");
    boolean first = true;

    if (isSetPersonName()) {
      sb.append("personName:");
      if (this.personName == null) {
        sb.append("null");
      } else {
        sb.append(this.personName);
      }
      first = false;
    }
    if (isSetPhone()) {
      if (!first) sb.append(", ");
      sb.append("phone:");
      if (this.phone == null) {
        sb.append("null");
      } else {
        sb.append(this.phone);
      }
      first = false;
    }
    if (isSetCph()) {
      if (!first) sb.append(", ");
      sb.append("cph:");
      if (this.cph == null) {
        sb.append("null");
      } else {
        sb.append(this.cph);
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

  private static class GetCarPersonPojoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetCarPersonPojoStandardScheme getScheme() {
      return new GetCarPersonPojoStandardScheme();
    }
  }

  private static class GetCarPersonPojoStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetCarPersonPojo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetCarPersonPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERSON_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.personName = iprot.readString();
              struct.setPersonNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phone = iprot.readString();
              struct.setPhoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CPH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cph = iprot.readString();
              struct.setCphIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetCarPersonPojo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.personName != null) {
        if (struct.isSetPersonName()) {
          oprot.writeFieldBegin(PERSON_NAME_FIELD_DESC);
          oprot.writeString(struct.personName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.phone != null) {
        if (struct.isSetPhone()) {
          oprot.writeFieldBegin(PHONE_FIELD_DESC);
          oprot.writeString(struct.phone);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cph != null) {
        if (struct.isSetCph()) {
          oprot.writeFieldBegin(CPH_FIELD_DESC);
          oprot.writeString(struct.cph);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetCarPersonPojoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetCarPersonPojoTupleScheme getScheme() {
      return new GetCarPersonPojoTupleScheme();
    }
  }

  private static class GetCarPersonPojoTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetCarPersonPojo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetCarPersonPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPersonName()) {
        optionals.set(0);
      }
      if (struct.isSetPhone()) {
        optionals.set(1);
      }
      if (struct.isSetCph()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPersonName()) {
        oprot.writeString(struct.personName);
      }
      if (struct.isSetPhone()) {
        oprot.writeString(struct.phone);
      }
      if (struct.isSetCph()) {
        oprot.writeString(struct.cph);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetCarPersonPojo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.personName = iprot.readString();
        struct.setPersonNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.phone = iprot.readString();
        struct.setPhoneIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cph = iprot.readString();
        struct.setCphIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
