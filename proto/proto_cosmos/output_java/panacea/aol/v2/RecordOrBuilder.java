// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/record.proto

package panacea.aol.v2;

public interface RecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.aol.v2.Record)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes key = 1;</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <code>int64 nano_timestamp = 3;</code>
   * @return The nanoTimestamp.
   */
  long getNanoTimestamp();

  /**
   * <code>string writer_address = 4;</code>
   * @return The writerAddress.
   */
  java.lang.String getWriterAddress();
  /**
   * <code>string writer_address = 4;</code>
   * @return The bytes for writerAddress.
   */
  com.google.protobuf.ByteString
      getWriterAddressBytes();
}
