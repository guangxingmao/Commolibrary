// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/cvm/v1alpha1/cvm.proto

package shentu.cvm.v1alpha1;

public final class Cvm {
  private Cvm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035shentu/cvm/v1alpha1/cvm.proto\022\023shentu." +
      "cvm.v1alpha1\032\024gogoproto/gogo.protoB<Z.gi" +
      "thub.com/certikfoundation/shentu/x/cvm/t" +
      "ypes\330\341\036\000\200\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.GoGoProtos.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf3.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf3.GoGoProtos.goprotoStringerAll);
    registry.add(com.google.protobuf3.GoGoProtos.stringerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf3.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
