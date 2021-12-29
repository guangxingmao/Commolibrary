// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package panacea.did.v2;

public interface VerificationMethodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.VerificationMethod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string controller = 3;</code>
   * @return The controller.
   */
  java.lang.String getController();
  /**
   * <code>string controller = 3;</code>
   * @return The bytes for controller.
   */
  com.google.protobuf.ByteString
      getControllerBytes();

  /**
   * <code>string public_key_base58 = 4 [json_name = "publicKeyBase58"];</code>
   * @return The publicKeyBase58.
   */
  java.lang.String getPublicKeyBase58();
  /**
   * <code>string public_key_base58 = 4 [json_name = "publicKeyBase58"];</code>
   * @return The bytes for publicKeyBase58.
   */
  com.google.protobuf.ByteString
      getPublicKeyBase58Bytes();
}