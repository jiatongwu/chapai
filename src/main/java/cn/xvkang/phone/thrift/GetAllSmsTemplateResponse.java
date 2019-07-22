/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.xvkang.phone.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-07-22")
public class GetAllSmsTemplateResponse implements org.apache.thrift.TBase<GetAllSmsTemplateResponse, GetAllSmsTemplateResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetAllSmsTemplateResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetAllSmsTemplateResponse");

  private static final org.apache.thrift.protocol.TField SMS_TEMPLATES_FIELD_DESC = new org.apache.thrift.protocol.TField("smsTemplates", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetAllSmsTemplateResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetAllSmsTemplateResponseTupleSchemeFactory();

  public java.util.List<GetAllSmsTemplateOneItem> smsTemplates; // optional
  public int count; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SMS_TEMPLATES((short)1, "smsTemplates"),
    COUNT((short)2, "count");

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
        case 1: // SMS_TEMPLATES
          return SMS_TEMPLATES;
        case 2: // COUNT
          return COUNT;
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
  private static final int __COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SMS_TEMPLATES,_Fields.COUNT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SMS_TEMPLATES, new org.apache.thrift.meta_data.FieldMetaData("smsTemplates", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GetAllSmsTemplateOneItem.class))));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetAllSmsTemplateResponse.class, metaDataMap);
  }

  public GetAllSmsTemplateResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetAllSmsTemplateResponse(GetAllSmsTemplateResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSmsTemplates()) {
      java.util.List<GetAllSmsTemplateOneItem> __this__smsTemplates = new java.util.ArrayList<GetAllSmsTemplateOneItem>(other.smsTemplates.size());
      for (GetAllSmsTemplateOneItem other_element : other.smsTemplates) {
        __this__smsTemplates.add(new GetAllSmsTemplateOneItem(other_element));
      }
      this.smsTemplates = __this__smsTemplates;
    }
    this.count = other.count;
  }

  public GetAllSmsTemplateResponse deepCopy() {
    return new GetAllSmsTemplateResponse(this);
  }

  @Override
  public void clear() {
    this.smsTemplates = null;
    setCountIsSet(false);
    this.count = 0;
  }

  public int getSmsTemplatesSize() {
    return (this.smsTemplates == null) ? 0 : this.smsTemplates.size();
  }

  public java.util.Iterator<GetAllSmsTemplateOneItem> getSmsTemplatesIterator() {
    return (this.smsTemplates == null) ? null : this.smsTemplates.iterator();
  }

  public void addToSmsTemplates(GetAllSmsTemplateOneItem elem) {
    if (this.smsTemplates == null) {
      this.smsTemplates = new java.util.ArrayList<GetAllSmsTemplateOneItem>();
    }
    this.smsTemplates.add(elem);
  }

  public java.util.List<GetAllSmsTemplateOneItem> getSmsTemplates() {
    return this.smsTemplates;
  }

  public GetAllSmsTemplateResponse setSmsTemplates(java.util.List<GetAllSmsTemplateOneItem> smsTemplates) {
    this.smsTemplates = smsTemplates;
    return this;
  }

  public void unsetSmsTemplates() {
    this.smsTemplates = null;
  }

  /** Returns true if field smsTemplates is set (has been assigned a value) and false otherwise */
  public boolean isSetSmsTemplates() {
    return this.smsTemplates != null;
  }

  public void setSmsTemplatesIsSet(boolean value) {
    if (!value) {
      this.smsTemplates = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public GetAllSmsTemplateResponse setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SMS_TEMPLATES:
      if (value == null) {
        unsetSmsTemplates();
      } else {
        setSmsTemplates((java.util.List<GetAllSmsTemplateOneItem>)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SMS_TEMPLATES:
      return getSmsTemplates();

    case COUNT:
      return getCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SMS_TEMPLATES:
      return isSetSmsTemplates();
    case COUNT:
      return isSetCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetAllSmsTemplateResponse)
      return this.equals((GetAllSmsTemplateResponse)that);
    return false;
  }

  public boolean equals(GetAllSmsTemplateResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_smsTemplates = true && this.isSetSmsTemplates();
    boolean that_present_smsTemplates = true && that.isSetSmsTemplates();
    if (this_present_smsTemplates || that_present_smsTemplates) {
      if (!(this_present_smsTemplates && that_present_smsTemplates))
        return false;
      if (!this.smsTemplates.equals(that.smsTemplates))
        return false;
    }

    boolean this_present_count = true && this.isSetCount();
    boolean that_present_count = true && that.isSetCount();
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSmsTemplates()) ? 131071 : 524287);
    if (isSetSmsTemplates())
      hashCode = hashCode * 8191 + smsTemplates.hashCode();

    hashCode = hashCode * 8191 + ((isSetCount()) ? 131071 : 524287);
    if (isSetCount())
      hashCode = hashCode * 8191 + count;

    return hashCode;
  }

  @Override
  public int compareTo(GetAllSmsTemplateResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSmsTemplates()).compareTo(other.isSetSmsTemplates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSmsTemplates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.smsTemplates, other.smsTemplates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAllSmsTemplateResponse(");
    boolean first = true;

    if (isSetSmsTemplates()) {
      sb.append("smsTemplates:");
      if (this.smsTemplates == null) {
        sb.append("null");
      } else {
        sb.append(this.smsTemplates);
      }
      first = false;
    }
    if (isSetCount()) {
      if (!first) sb.append(", ");
      sb.append("count:");
      sb.append(this.count);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetAllSmsTemplateResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetAllSmsTemplateResponseStandardScheme getScheme() {
      return new GetAllSmsTemplateResponseStandardScheme();
    }
  }

  private static class GetAllSmsTemplateResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetAllSmsTemplateResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetAllSmsTemplateResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SMS_TEMPLATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.smsTemplates = new java.util.ArrayList<GetAllSmsTemplateOneItem>(_list8.size);
                GetAllSmsTemplateOneItem _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new GetAllSmsTemplateOneItem();
                  _elem9.read(iprot);
                  struct.smsTemplates.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setSmsTemplatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetAllSmsTemplateResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.smsTemplates != null) {
        if (struct.isSetSmsTemplates()) {
          oprot.writeFieldBegin(SMS_TEMPLATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.smsTemplates.size()));
            for (GetAllSmsTemplateOneItem _iter11 : struct.smsTemplates)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCount()) {
        oprot.writeFieldBegin(COUNT_FIELD_DESC);
        oprot.writeI32(struct.count);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetAllSmsTemplateResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetAllSmsTemplateResponseTupleScheme getScheme() {
      return new GetAllSmsTemplateResponseTupleScheme();
    }
  }

  private static class GetAllSmsTemplateResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetAllSmsTemplateResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetAllSmsTemplateResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSmsTemplates()) {
        optionals.set(0);
      }
      if (struct.isSetCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSmsTemplates()) {
        {
          oprot.writeI32(struct.smsTemplates.size());
          for (GetAllSmsTemplateOneItem _iter12 : struct.smsTemplates)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetAllSmsTemplateResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.smsTemplates = new java.util.ArrayList<GetAllSmsTemplateOneItem>(_list13.size);
          GetAllSmsTemplateOneItem _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new GetAllSmsTemplateOneItem();
            _elem14.read(iprot);
            struct.smsTemplates.add(_elem14);
          }
        }
        struct.setSmsTemplatesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

