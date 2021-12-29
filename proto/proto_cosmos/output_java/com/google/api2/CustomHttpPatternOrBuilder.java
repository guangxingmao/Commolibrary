// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api2;

public interface CustomHttpPatternOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.CustomHttpPattern)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this custom HTTP verb.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * The name of this custom HTTP verb.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * The path matched by this custom verb.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * The path matched by this custom verb.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();
}
