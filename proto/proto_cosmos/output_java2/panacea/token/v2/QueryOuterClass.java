// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/query.proto

package panacea.token.v2;

public final class QueryOuterClass {
  private QueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryTokensRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryTokensRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_token_v2_QueryTokensResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_token_v2_QueryTokensResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034panacea/token/v2/query.proto\022\020panacea." +
      "token.v2\032\034google/api/annotations.proto\032*" +
      "cosmos/base/query/v1beta1/pagination.pro" +
      "to\032\034panacea/token/v2/token.proto\"#\n\021Quer" +
      "yTokenRequest\022\016\n\006symbol\030\001 \001(\t\"<\n\022QueryTo" +
      "kenResponse\022&\n\005token\030\001 \001(\0132\027.panacea.tok" +
      "en.v2.Token\"P\n\022QueryTokensRequest\022:\n\npag" +
      "ination\030\001 \001(\0132&.cosmos.base.query.v1beta" +
      "1.PageRequest\"z\n\023QueryTokensResponse\022&\n\005" +
      "token\030\001 \003(\0132\027.panacea.token.v2.Token\022;\n\n" +
      "pagination\030\002 \001(\0132\'.cosmos.base.query.v1b" +
      "eta1.PageResponse2\377\001\n\005Query\022}\n\005Token\022#.p" +
      "anacea.token.v2.QueryTokenRequest\032$.pana" +
      "cea.token.v2.QueryTokenResponse\")\202\323\344\223\002#\022" +
      "!/panacea/token/v2/tokens/{symbol}\022w\n\006To" +
      "kens\022$.panacea.token.v2.QueryTokensReque" +
      "st\032%.panacea.token.v2.QueryTokensRespons" +
      "e\" \202\323\344\223\002\032\022\030/panacea/token/v2/tokensB2P\001Z" +
      ".github.com/medibloc/panacea-core/x/toke" +
      "n/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api2.AnnotationsProto.getDescriptor(),
          cosmos.base.query.v1beta1.Pagination.getDescriptor(),
          panacea.token.v2.TokenOuterClass.getDescriptor(),
        });
    internal_static_panacea_token_v2_QueryTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_token_v2_QueryTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryTokenRequest_descriptor,
        new java.lang.String[] { "Symbol", });
    internal_static_panacea_token_v2_QueryTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_token_v2_QueryTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryTokenResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_panacea_token_v2_QueryTokensRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_token_v2_QueryTokensRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryTokensRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_panacea_token_v2_QueryTokensResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_token_v2_QueryTokensResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_token_v2_QueryTokensResponse_descriptor,
        new java.lang.String[] { "Token", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api2.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api2.AnnotationsProto.getDescriptor();
    cosmos.base.query.v1beta1.Pagination.getDescriptor();
    panacea.token.v2.TokenOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}