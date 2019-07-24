/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-07-23")
public class ResetPwdRequest implements org.apache.thrift.TBase<ResetPwdRequest, ResetPwdRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ResetPwdRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResetPwdRequest");

  private static final org.apache.thrift.protocol.TField OLD_PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("oldPwd", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("newPwd", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField JWT_FIELD_DESC = new org.apache.thrift.protocol.TField("jwt", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ResetPwdRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ResetPwdRequestTupleSchemeFactory();

  public java.lang.String oldPwd; // optional
  public java.lang.String newPwd; // optional
  public java.lang.String jwt; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OLD_PWD((short)1, "oldPwd"),
    NEW_PWD((short)2, "newPwd"),
    JWT((short)3, "jwt");

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
        case 1: // OLD_PWD
          return OLD_PWD;
        case 2: // NEW_PWD
          return NEW_PWD;
        case 3: // JWT
          return JWT;
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
  private static final _Fields optionals[] = {_Fields.OLD_PWD,_Fields.NEW_PWD,_Fields.JWT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OLD_PWD, new org.apache.thrift.meta_data.FieldMetaData("oldPwd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.NEW_PWD, new org.apache.thrift.meta_data.FieldMetaData("newPwd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.JWT, new org.apache.thrift.meta_data.FieldMetaData("jwt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResetPwdRequest.class, metaDataMap);
  }

  public ResetPwdRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResetPwdRequest(ResetPwdRequest other) {
    if (other.isSetOldPwd()) {
      this.oldPwd = other.oldPwd;
    }
    if (other.isSetNewPwd()) {
      this.newPwd = other.newPwd;
    }
    if (other.isSetJwt()) {
      this.jwt = other.jwt;
    }
  }

  public ResetPwdRequest deepCopy() {
    return new ResetPwdRequest(this);
  }

  @Override
  public void clear() {
    this.oldPwd = null;
    this.newPwd = null;
    this.jwt = null;
  }

  public java.lang.String getOldPwd() {
    return this.oldPwd;
  }

  public ResetPwdRequest setOldPwd(java.lang.String oldPwd) {
    this.oldPwd = oldPwd;
    return this;
  }

  public void unsetOldPwd() {
    this.oldPwd = null;
  }

  /** Returns true if field oldPwd is set (has been assigned a value) and false otherwise */
  public boolean isSetOldPwd() {
    return this.oldPwd != null;
  }

  public void setOldPwdIsSet(boolean value) {
    if (!value) {
      this.oldPwd = null;
    }
  }

  public java.lang.String getNewPwd() {
    return this.newPwd;
  }

  public ResetPwdRequest setNewPwd(java.lang.String newPwd) {
    this.newPwd = newPwd;
    return this;
  }

  public void unsetNewPwd() {
    this.newPwd = null;
  }

  /** Returns true if field newPwd is set (has been assigned a value) and false otherwise */
  public boolean isSetNewPwd() {
    return this.newPwd != null;
  }

  public void setNewPwdIsSet(boolean value) {
    if (!value) {
      this.newPwd = null;
    }
  }

  public java.lang.String getJwt() {
    return this.jwt;
  }

  public ResetPwdRequest setJwt(java.lang.String jwt) {
    this.jwt = jwt;
    return this;
  }

  public void unsetJwt() {
    this.jwt = null;
  }

  /** Returns true if field jwt is set (has been assigned a value) and false otherwise */
  public boolean isSetJwt() {
    return this.jwt != null;
  }

  public void setJwtIsSet(boolean value) {
    if (!value) {
      this.jwt = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OLD_PWD:
      if (value == null) {
        unsetOldPwd();
      } else {
        setOldPwd((java.lang.String)value);
      }
      break;

    case NEW_PWD:
      if (value == null) {
        unsetNewPwd();
      } else {
        setNewPwd((java.lang.String)value);
      }
      break;

    case JWT:
      if (value == null) {
        unsetJwt();
      } else {
        setJwt((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OLD_PWD:
      return getOldPwd();

    case NEW_PWD:
      return getNewPwd();

    case JWT:
      return getJwt();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OLD_PWD:
      return isSetOldPwd();
    case NEW_PWD:
      return isSetNewPwd();
    case JWT:
      return isSetJwt();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ResetPwdRequest)
      return this.equals((ResetPwdRequest)that);
    return false;
  }

  public boolean equals(ResetPwdRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_oldPwd = true && this.isSetOldPwd();
    boolean that_present_oldPwd = true && that.isSetOldPwd();
    if (this_present_oldPwd || that_present_oldPwd) {
      if (!(this_present_oldPwd && that_present_oldPwd))
        return false;
      if (!this.oldPwd.equals(that.oldPwd))
        return false;
    }

    boolean this_present_newPwd = true && this.isSetNewPwd();
    boolean that_present_newPwd = true && that.isSetNewPwd();
    if (this_present_newPwd || that_present_newPwd) {
      if (!(this_present_newPwd && that_present_newPwd))
        return false;
      if (!this.newPwd.equals(that.newPwd))
        return false;
    }

    boolean this_present_jwt = true && this.isSetJwt();
    boolean that_present_jwt = true && that.isSetJwt();
    if (this_present_jwt || that_present_jwt) {
      if (!(this_present_jwt && that_present_jwt))
        return false;
      if (!this.jwt.equals(that.jwt))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOldPwd()) ? 131071 : 524287);
    if (isSetOldPwd())
      hashCode = hashCode * 8191 + oldPwd.hashCode();

    hashCode = hashCode * 8191 + ((isSetNewPwd()) ? 131071 : 524287);
    if (isSetNewPwd())
      hashCode = hashCode * 8191 + newPwd.hashCode();

    hashCode = hashCode * 8191 + ((isSetJwt()) ? 131071 : 524287);
    if (isSetJwt())
      hashCode = hashCode * 8191 + jwt.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ResetPwdRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOldPwd()).compareTo(other.isSetOldPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldPwd, other.oldPwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNewPwd()).compareTo(other.isSetNewPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newPwd, other.newPwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJwt()).compareTo(other.isSetJwt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJwt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jwt, other.jwt);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ResetPwdRequest(");
    boolean first = true;

    if (isSetOldPwd()) {
      sb.append("oldPwd:");
      if (this.oldPwd == null) {
        sb.append("null");
      } else {
        sb.append(this.oldPwd);
      }
      first = false;
    }
    if (isSetNewPwd()) {
      if (!first) sb.append(", ");
      sb.append("newPwd:");
      if (this.newPwd == null) {
        sb.append("null");
      } else {
        sb.append(this.newPwd);
      }
      first = false;
    }
    if (isSetJwt()) {
      if (!first) sb.append(", ");
      sb.append("jwt:");
      if (this.jwt == null) {
        sb.append("null");
      } else {
        sb.append(this.jwt);
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

  private static class ResetPwdRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResetPwdRequestStandardScheme getScheme() {
      return new ResetPwdRequestStandardScheme();
    }
  }

  private static class ResetPwdRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<ResetPwdRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResetPwdRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OLD_PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oldPwd = iprot.readString();
              struct.setOldPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.newPwd = iprot.readString();
              struct.setNewPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JWT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jwt = iprot.readString();
              struct.setJwtIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResetPwdRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.oldPwd != null) {
        if (struct.isSetOldPwd()) {
          oprot.writeFieldBegin(OLD_PWD_FIELD_DESC);
          oprot.writeString(struct.oldPwd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.newPwd != null) {
        if (struct.isSetNewPwd()) {
          oprot.writeFieldBegin(NEW_PWD_FIELD_DESC);
          oprot.writeString(struct.newPwd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jwt != null) {
        if (struct.isSetJwt()) {
          oprot.writeFieldBegin(JWT_FIELD_DESC);
          oprot.writeString(struct.jwt);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResetPwdRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResetPwdRequestTupleScheme getScheme() {
      return new ResetPwdRequestTupleScheme();
    }
  }

  private static class ResetPwdRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<ResetPwdRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResetPwdRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOldPwd()) {
        optionals.set(0);
      }
      if (struct.isSetNewPwd()) {
        optionals.set(1);
      }
      if (struct.isSetJwt()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOldPwd()) {
        oprot.writeString(struct.oldPwd);
      }
      if (struct.isSetNewPwd()) {
        oprot.writeString(struct.newPwd);
      }
      if (struct.isSetJwt()) {
        oprot.writeString(struct.jwt);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResetPwdRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.oldPwd = iprot.readString();
        struct.setOldPwdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newPwd = iprot.readString();
        struct.setNewPwdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.jwt = iprot.readString();
        struct.setJwtIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

