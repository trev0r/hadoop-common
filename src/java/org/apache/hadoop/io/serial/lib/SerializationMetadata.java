// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/protobuf/SerializationMetadata.proto

package org.apache.hadoop.io.serial.lib;

public final class SerializationMetadata {
  private SerializationMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class TypedSerializationMetadata extends
      com.google.protobuf.GeneratedMessage {
    // Use TypedSerializationMetadata.newBuilder() to construct.
    private TypedSerializationMetadata() {
      initFields();
    }
    private TypedSerializationMetadata(boolean noInit) {}
    
    private static final TypedSerializationMetadata defaultInstance;
    public static TypedSerializationMetadata getDefaultInstance() {
      return defaultInstance;
    }
    
    public TypedSerializationMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.io.serial.lib.SerializationMetadata.internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.io.serial.lib.SerializationMetadata.internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_fieldAccessorTable;
    }
    
    // optional string typename = 1;
    public static final int TYPENAME_FIELD_NUMBER = 1;
    private boolean hasTypename;
    private java.lang.String typename_ = "";
    public boolean hasTypename() { return hasTypename; }
    public java.lang.String getTypename() { return typename_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasTypename()) {
        output.writeString(1, getTypename());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasTypename()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getTypename());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata result;
      
      // Construct using org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata();
        return builder;
      }
      
      protected org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.getDescriptor();
      }
      
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata getDefaultInstanceForType() {
        return org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata) {
          return mergeFrom((org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata other) {
        if (other == org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.getDefaultInstance()) return this;
        if (other.hasTypename()) {
          setTypename(other.getTypename());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setTypename(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string typename = 1;
      public boolean hasTypename() {
        return result.hasTypename();
      }
      public java.lang.String getTypename() {
        return result.getTypename();
      }
      public Builder setTypename(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTypename = true;
        result.typename_ = value;
        return this;
      }
      public Builder clearTypename() {
        result.hasTypename = false;
        result.typename_ = getDefaultInstance().getTypename();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.io.serial.lib.TypedSerializationMetadata)
    }
    
    static {
      defaultInstance = new TypedSerializationMetadata(true);
      org.apache.hadoop.io.serial.lib.SerializationMetadata.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.io.serial.lib.TypedSerializationMetadata)
  }
  
  public static final class AvroMetadata extends
      com.google.protobuf.GeneratedMessage {
    // Use AvroMetadata.newBuilder() to construct.
    private AvroMetadata() {
      initFields();
    }
    private AvroMetadata(boolean noInit) {}
    
    private static final AvroMetadata defaultInstance;
    public static AvroMetadata getDefaultInstance() {
      return defaultInstance;
    }
    
    public AvroMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.io.serial.lib.SerializationMetadata.internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.io.serial.lib.SerializationMetadata.internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_fieldAccessorTable;
    }
    
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      SPECIFIC(0, 1),
      GENERIC(1, 2),
      REFLECTION(2, 3),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static Kind valueOf(int value) {
        switch (value) {
          case 1: return SPECIFIC;
          case 2: return GENERIC;
          case 3: return REFLECTION;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.valueOf(number)
      ;        }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Kind[] VALUES = {
        SPECIFIC, GENERIC, REFLECTION, 
      };
      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private Kind(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        org.apache.hadoop.io.serial.lib.SerializationMetadata.getDescriptor();
      }
      
      // @@protoc_insertion_point(enum_scope:org.apache.hadoop.io.serial.lib.AvroMetadata.Kind)
    }
    
    // optional string schema = 1;
    public static final int SCHEMA_FIELD_NUMBER = 1;
    private boolean hasSchema;
    private java.lang.String schema_ = "";
    public boolean hasSchema() { return hasSchema; }
    public java.lang.String getSchema() { return schema_; }
    
    // optional .org.apache.hadoop.io.serial.lib.AvroMetadata.Kind kind = 2;
    public static final int KIND_FIELD_NUMBER = 2;
    private boolean hasKind;
    private org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind kind_;
    public boolean hasKind() { return hasKind; }
    public org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind getKind() { return kind_; }
    
    private void initFields() {
      kind_ = org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind.SPECIFIC;
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasSchema()) {
        output.writeString(1, getSchema());
      }
      if (hasKind()) {
        output.writeEnum(2, getKind().getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasSchema()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSchema());
      }
      if (hasKind()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, getKind().getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata result;
      
      // Construct using org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata();
        return builder;
      }
      
      protected org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.getDescriptor();
      }
      
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata getDefaultInstanceForType() {
        return org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata) {
          return mergeFrom((org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata other) {
        if (other == org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.getDefaultInstance()) return this;
        if (other.hasSchema()) {
          setSchema(other.getSchema());
        }
        if (other.hasKind()) {
          setKind(other.getKind());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setSchema(input.readString());
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind value = org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                setKind(value);
              }
              break;
            }
          }
        }
      }
      
      
      // optional string schema = 1;
      public boolean hasSchema() {
        return result.hasSchema();
      }
      public java.lang.String getSchema() {
        return result.getSchema();
      }
      public Builder setSchema(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasSchema = true;
        result.schema_ = value;
        return this;
      }
      public Builder clearSchema() {
        result.hasSchema = false;
        result.schema_ = getDefaultInstance().getSchema();
        return this;
      }
      
      // optional .org.apache.hadoop.io.serial.lib.AvroMetadata.Kind kind = 2;
      public boolean hasKind() {
        return result.hasKind();
      }
      public org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind getKind() {
        return result.getKind();
      }
      public Builder setKind(org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasKind = true;
        result.kind_ = value;
        return this;
      }
      public Builder clearKind() {
        result.hasKind = false;
        result.kind_ = org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Kind.SPECIFIC;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.io.serial.lib.AvroMetadata)
    }
    
    static {
      defaultInstance = new AvroMetadata(true);
      org.apache.hadoop.io.serial.lib.SerializationMetadata.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.io.serial.lib.AvroMetadata)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(src/protobuf/SerializationMetadata.pro" +
      "to\022\037org.apache.hadoop.io.serial.lib\".\n\032T" +
      "ypedSerializationMetadata\022\020\n\010typename\030\001 " +
      "\001(\t\"\223\001\n\014AvroMetadata\022\016\n\006schema\030\001 \001(\t\022@\n\004" +
      "kind\030\002 \001(\01622.org.apache.hadoop.io.serial" +
      ".lib.AvroMetadata.Kind\"1\n\004Kind\022\014\n\010SPECIF" +
      "IC\020\001\022\013\n\007GENERIC\020\002\022\016\n\nREFLECTION\020\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_io_serial_lib_TypedSerializationMetadata_descriptor,
              new java.lang.String[] { "Typename", },
              org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.class,
              org.apache.hadoop.io.serial.lib.SerializationMetadata.TypedSerializationMetadata.Builder.class);
          internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_io_serial_lib_AvroMetadata_descriptor,
              new java.lang.String[] { "Schema", "Kind", },
              org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.class,
              org.apache.hadoop.io.serial.lib.SerializationMetadata.AvroMetadata.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}