// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/annotations.proto

package com.google.api2;

public final class AnnotationsProto {
  private AnnotationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api2.AnnotationsProto.http);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int HTTP_FIELD_NUMBER = 72295728;
  /**
   * <pre>
   * See `HttpRule`.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      com.google.api2.HttpRule> http = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.google.api2.HttpRule.class,
        com.google.api2.HttpRule.getDefaultInstance());

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/api/annotations.proto\022\ngoogle.a" +
      "pi\032\025google/api/http.proto\032 google/protob" +
      "uf/descriptor.proto:E\n\004http\022\036.google.pro" +
      "tobuf.MethodOptions\030\260\312\274\" \001(\0132\024.google.ap" +
      "i.HttpRuleBo\n\017com.google.api2B\020Annotatio" +
      "nsProtoP\001ZAgoogle.golang.org/genproto/go" +
      "ogleapis/api/annotations;annotations\242\002\004G" +
      "APIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api2.HttpProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    http.internalInit(descriptor.getExtensions().get(0));
    com.google.api2.HttpProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}