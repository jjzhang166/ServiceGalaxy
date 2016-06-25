/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ailk.monitor;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MachineNet implements org.apache.thrift.TBase<MachineNet, MachineNet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MachineNet");

  private static final org.apache.thrift.protocol.TField LMID_FIELD_DESC = new org.apache.thrift.protocol.TField("lmid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NADDR_FIELD_DESC = new org.apache.thrift.protocol.TField("naddr", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NLSADDR_FIELD_DESC = new org.apache.thrift.protocol.TField("nlsaddr", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NETGROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("netgroup", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NETID_FIELD_DESC = new org.apache.thrift.protocol.TField("netid", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TCPKEEPALIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("tcpkeepalive", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MachineNetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MachineNetTupleSchemeFactory());
  }

  public String lmid; // required
  public String naddr; // required
  public String nlsaddr; // required
  public String netgroup; // required
  public String netid; // required
  public boolean tcpkeepalive; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LMID((short)1, "lmid"),
    NADDR((short)2, "naddr"),
    NLSADDR((short)3, "nlsaddr"),
    NETGROUP((short)4, "netgroup"),
    NETID((short)5, "netid"),
    TCPKEEPALIVE((short)6, "tcpkeepalive");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LMID
          return LMID;
        case 2: // NADDR
          return NADDR;
        case 3: // NLSADDR
          return NLSADDR;
        case 4: // NETGROUP
          return NETGROUP;
        case 5: // NETID
          return NETID;
        case 6: // TCPKEEPALIVE
          return TCPKEEPALIVE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TCPKEEPALIVE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LMID, new org.apache.thrift.meta_data.FieldMetaData("lmid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NADDR, new org.apache.thrift.meta_data.FieldMetaData("naddr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NLSADDR, new org.apache.thrift.meta_data.FieldMetaData("nlsaddr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NETGROUP, new org.apache.thrift.meta_data.FieldMetaData("netgroup", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NETID, new org.apache.thrift.meta_data.FieldMetaData("netid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TCPKEEPALIVE, new org.apache.thrift.meta_data.FieldMetaData("tcpkeepalive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MachineNet.class, metaDataMap);
  }

  public MachineNet() {
  }

  public MachineNet(
    String lmid,
    String naddr,
    String nlsaddr,
    String netgroup,
    String netid,
    boolean tcpkeepalive)
  {
    this();
    this.lmid = lmid;
    this.naddr = naddr;
    this.nlsaddr = nlsaddr;
    this.netgroup = netgroup;
    this.netid = netid;
    this.tcpkeepalive = tcpkeepalive;
    setTcpkeepaliveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MachineNet(MachineNet other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetLmid()) {
      this.lmid = other.lmid;
    }
    if (other.isSetNaddr()) {
      this.naddr = other.naddr;
    }
    if (other.isSetNlsaddr()) {
      this.nlsaddr = other.nlsaddr;
    }
    if (other.isSetNetgroup()) {
      this.netgroup = other.netgroup;
    }
    if (other.isSetNetid()) {
      this.netid = other.netid;
    }
    this.tcpkeepalive = other.tcpkeepalive;
  }

  public MachineNet deepCopy() {
    return new MachineNet(this);
  }

  @Override
  public void clear() {
    this.lmid = null;
    this.naddr = null;
    this.nlsaddr = null;
    this.netgroup = null;
    this.netid = null;
    setTcpkeepaliveIsSet(false);
    this.tcpkeepalive = false;
  }

  public String getLmid() {
    return this.lmid;
  }

  public MachineNet setLmid(String lmid) {
    this.lmid = lmid;
    return this;
  }

  public void unsetLmid() {
    this.lmid = null;
  }

  /** Returns true if field lmid is set (has been assigned a value) and false otherwise */
  public boolean isSetLmid() {
    return this.lmid != null;
  }

  public void setLmidIsSet(boolean value) {
    if (!value) {
      this.lmid = null;
    }
  }

  public String getNaddr() {
    return this.naddr;
  }

  public MachineNet setNaddr(String naddr) {
    this.naddr = naddr;
    return this;
  }

  public void unsetNaddr() {
    this.naddr = null;
  }

  /** Returns true if field naddr is set (has been assigned a value) and false otherwise */
  public boolean isSetNaddr() {
    return this.naddr != null;
  }

  public void setNaddrIsSet(boolean value) {
    if (!value) {
      this.naddr = null;
    }
  }

  public String getNlsaddr() {
    return this.nlsaddr;
  }

  public MachineNet setNlsaddr(String nlsaddr) {
    this.nlsaddr = nlsaddr;
    return this;
  }

  public void unsetNlsaddr() {
    this.nlsaddr = null;
  }

  /** Returns true if field nlsaddr is set (has been assigned a value) and false otherwise */
  public boolean isSetNlsaddr() {
    return this.nlsaddr != null;
  }

  public void setNlsaddrIsSet(boolean value) {
    if (!value) {
      this.nlsaddr = null;
    }
  }

  public String getNetgroup() {
    return this.netgroup;
  }

  public MachineNet setNetgroup(String netgroup) {
    this.netgroup = netgroup;
    return this;
  }

  public void unsetNetgroup() {
    this.netgroup = null;
  }

  /** Returns true if field netgroup is set (has been assigned a value) and false otherwise */
  public boolean isSetNetgroup() {
    return this.netgroup != null;
  }

  public void setNetgroupIsSet(boolean value) {
    if (!value) {
      this.netgroup = null;
    }
  }

  public String getNetid() {
    return this.netid;
  }

  public MachineNet setNetid(String netid) {
    this.netid = netid;
    return this;
  }

  public void unsetNetid() {
    this.netid = null;
  }

  /** Returns true if field netid is set (has been assigned a value) and false otherwise */
  public boolean isSetNetid() {
    return this.netid != null;
  }

  public void setNetidIsSet(boolean value) {
    if (!value) {
      this.netid = null;
    }
  }

  public boolean isTcpkeepalive() {
    return this.tcpkeepalive;
  }

  public MachineNet setTcpkeepalive(boolean tcpkeepalive) {
    this.tcpkeepalive = tcpkeepalive;
    setTcpkeepaliveIsSet(true);
    return this;
  }

  public void unsetTcpkeepalive() {
    __isset_bit_vector.clear(__TCPKEEPALIVE_ISSET_ID);
  }

  /** Returns true if field tcpkeepalive is set (has been assigned a value) and false otherwise */
  public boolean isSetTcpkeepalive() {
    return __isset_bit_vector.get(__TCPKEEPALIVE_ISSET_ID);
  }

  public void setTcpkeepaliveIsSet(boolean value) {
    __isset_bit_vector.set(__TCPKEEPALIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LMID:
      if (value == null) {
        unsetLmid();
      } else {
        setLmid((String)value);
      }
      break;

    case NADDR:
      if (value == null) {
        unsetNaddr();
      } else {
        setNaddr((String)value);
      }
      break;

    case NLSADDR:
      if (value == null) {
        unsetNlsaddr();
      } else {
        setNlsaddr((String)value);
      }
      break;

    case NETGROUP:
      if (value == null) {
        unsetNetgroup();
      } else {
        setNetgroup((String)value);
      }
      break;

    case NETID:
      if (value == null) {
        unsetNetid();
      } else {
        setNetid((String)value);
      }
      break;

    case TCPKEEPALIVE:
      if (value == null) {
        unsetTcpkeepalive();
      } else {
        setTcpkeepalive((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LMID:
      return getLmid();

    case NADDR:
      return getNaddr();

    case NLSADDR:
      return getNlsaddr();

    case NETGROUP:
      return getNetgroup();

    case NETID:
      return getNetid();

    case TCPKEEPALIVE:
      return Boolean.valueOf(isTcpkeepalive());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LMID:
      return isSetLmid();
    case NADDR:
      return isSetNaddr();
    case NLSADDR:
      return isSetNlsaddr();
    case NETGROUP:
      return isSetNetgroup();
    case NETID:
      return isSetNetid();
    case TCPKEEPALIVE:
      return isSetTcpkeepalive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MachineNet)
      return this.equals((MachineNet)that);
    return false;
  }

  public boolean equals(MachineNet that) {
    if (that == null)
      return false;

    boolean this_present_lmid = true && this.isSetLmid();
    boolean that_present_lmid = true && that.isSetLmid();
    if (this_present_lmid || that_present_lmid) {
      if (!(this_present_lmid && that_present_lmid))
        return false;
      if (!this.lmid.equals(that.lmid))
        return false;
    }

    boolean this_present_naddr = true && this.isSetNaddr();
    boolean that_present_naddr = true && that.isSetNaddr();
    if (this_present_naddr || that_present_naddr) {
      if (!(this_present_naddr && that_present_naddr))
        return false;
      if (!this.naddr.equals(that.naddr))
        return false;
    }

    boolean this_present_nlsaddr = true && this.isSetNlsaddr();
    boolean that_present_nlsaddr = true && that.isSetNlsaddr();
    if (this_present_nlsaddr || that_present_nlsaddr) {
      if (!(this_present_nlsaddr && that_present_nlsaddr))
        return false;
      if (!this.nlsaddr.equals(that.nlsaddr))
        return false;
    }

    boolean this_present_netgroup = true && this.isSetNetgroup();
    boolean that_present_netgroup = true && that.isSetNetgroup();
    if (this_present_netgroup || that_present_netgroup) {
      if (!(this_present_netgroup && that_present_netgroup))
        return false;
      if (!this.netgroup.equals(that.netgroup))
        return false;
    }

    boolean this_present_netid = true && this.isSetNetid();
    boolean that_present_netid = true && that.isSetNetid();
    if (this_present_netid || that_present_netid) {
      if (!(this_present_netid && that_present_netid))
        return false;
      if (!this.netid.equals(that.netid))
        return false;
    }

    boolean this_present_tcpkeepalive = true;
    boolean that_present_tcpkeepalive = true;
    if (this_present_tcpkeepalive || that_present_tcpkeepalive) {
      if (!(this_present_tcpkeepalive && that_present_tcpkeepalive))
        return false;
      if (this.tcpkeepalive != that.tcpkeepalive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MachineNet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MachineNet typedOther = (MachineNet)other;

    lastComparison = Boolean.valueOf(isSetLmid()).compareTo(typedOther.isSetLmid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLmid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lmid, typedOther.lmid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNaddr()).compareTo(typedOther.isSetNaddr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNaddr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.naddr, typedOther.naddr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNlsaddr()).compareTo(typedOther.isSetNlsaddr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNlsaddr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nlsaddr, typedOther.nlsaddr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNetgroup()).compareTo(typedOther.isSetNetgroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetgroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.netgroup, typedOther.netgroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNetid()).compareTo(typedOther.isSetNetid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.netid, typedOther.netid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTcpkeepalive()).compareTo(typedOther.isSetTcpkeepalive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTcpkeepalive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tcpkeepalive, typedOther.tcpkeepalive);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MachineNet(");
    boolean first = true;

    sb.append("lmid:");
    if (this.lmid == null) {
      sb.append("null");
    } else {
      sb.append(this.lmid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("naddr:");
    if (this.naddr == null) {
      sb.append("null");
    } else {
      sb.append(this.naddr);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nlsaddr:");
    if (this.nlsaddr == null) {
      sb.append("null");
    } else {
      sb.append(this.nlsaddr);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("netgroup:");
    if (this.netgroup == null) {
      sb.append("null");
    } else {
      sb.append(this.netgroup);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("netid:");
    if (this.netid == null) {
      sb.append("null");
    } else {
      sb.append(this.netid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tcpkeepalive:");
    sb.append(this.tcpkeepalive);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MachineNetStandardSchemeFactory implements SchemeFactory {
    public MachineNetStandardScheme getScheme() {
      return new MachineNetStandardScheme();
    }
  }

  private static class MachineNetStandardScheme extends StandardScheme<MachineNet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MachineNet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LMID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lmid = iprot.readString();
              struct.setLmidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NADDR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.naddr = iprot.readString();
              struct.setNaddrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NLSADDR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nlsaddr = iprot.readString();
              struct.setNlsaddrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NETGROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.netgroup = iprot.readString();
              struct.setNetgroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NETID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.netid = iprot.readString();
              struct.setNetidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TCPKEEPALIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.tcpkeepalive = iprot.readBool();
              struct.setTcpkeepaliveIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MachineNet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.lmid != null) {
        oprot.writeFieldBegin(LMID_FIELD_DESC);
        oprot.writeString(struct.lmid);
        oprot.writeFieldEnd();
      }
      if (struct.naddr != null) {
        oprot.writeFieldBegin(NADDR_FIELD_DESC);
        oprot.writeString(struct.naddr);
        oprot.writeFieldEnd();
      }
      if (struct.nlsaddr != null) {
        oprot.writeFieldBegin(NLSADDR_FIELD_DESC);
        oprot.writeString(struct.nlsaddr);
        oprot.writeFieldEnd();
      }
      if (struct.netgroup != null) {
        oprot.writeFieldBegin(NETGROUP_FIELD_DESC);
        oprot.writeString(struct.netgroup);
        oprot.writeFieldEnd();
      }
      if (struct.netid != null) {
        oprot.writeFieldBegin(NETID_FIELD_DESC);
        oprot.writeString(struct.netid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TCPKEEPALIVE_FIELD_DESC);
      oprot.writeBool(struct.tcpkeepalive);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MachineNetTupleSchemeFactory implements SchemeFactory {
    public MachineNetTupleScheme getScheme() {
      return new MachineNetTupleScheme();
    }
  }

  private static class MachineNetTupleScheme extends TupleScheme<MachineNet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MachineNet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLmid()) {
        optionals.set(0);
      }
      if (struct.isSetNaddr()) {
        optionals.set(1);
      }
      if (struct.isSetNlsaddr()) {
        optionals.set(2);
      }
      if (struct.isSetNetgroup()) {
        optionals.set(3);
      }
      if (struct.isSetNetid()) {
        optionals.set(4);
      }
      if (struct.isSetTcpkeepalive()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetLmid()) {
        oprot.writeString(struct.lmid);
      }
      if (struct.isSetNaddr()) {
        oprot.writeString(struct.naddr);
      }
      if (struct.isSetNlsaddr()) {
        oprot.writeString(struct.nlsaddr);
      }
      if (struct.isSetNetgroup()) {
        oprot.writeString(struct.netgroup);
      }
      if (struct.isSetNetid()) {
        oprot.writeString(struct.netid);
      }
      if (struct.isSetTcpkeepalive()) {
        oprot.writeBool(struct.tcpkeepalive);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MachineNet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.lmid = iprot.readString();
        struct.setLmidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.naddr = iprot.readString();
        struct.setNaddrIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nlsaddr = iprot.readString();
        struct.setNlsaddrIsSet(true);
      }
      if (incoming.get(3)) {
        struct.netgroup = iprot.readString();
        struct.setNetgroupIsSet(true);
      }
      if (incoming.get(4)) {
        struct.netid = iprot.readString();
        struct.setNetidIsSet(true);
      }
      if (incoming.get(5)) {
        struct.tcpkeepalive = iprot.readBool();
        struct.setTcpkeepaliveIsSet(true);
      }
    }
  }

}
