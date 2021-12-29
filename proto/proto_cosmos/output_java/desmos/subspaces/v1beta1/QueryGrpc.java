package desmos.subspaces.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/subspaces/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.subspaces.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspace",
      requestType = desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest.class,
      responseType = desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest, desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod;
    if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
          QueryGrpc.getSubspaceMethod = getSubspaceMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest, desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspace"))
              .build();
        }
      }
    }
    return getSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> getAdminsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Admins",
      requestType = desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest.class,
      responseType = desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> getAdminsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> getAdminsMethod;
    if ((getAdminsMethod = QueryGrpc.getAdminsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAdminsMethod = QueryGrpc.getAdminsMethod) == null) {
          QueryGrpc.getAdminsMethod = getAdminsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Admins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Admins"))
              .build();
        }
      }
    }
    return getAdminsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> getRegisteredUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredUsers",
      requestType = desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest.class,
      responseType = desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> getRegisteredUsersMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> getRegisteredUsersMethod;
    if ((getRegisteredUsersMethod = QueryGrpc.getRegisteredUsersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredUsersMethod = QueryGrpc.getRegisteredUsersMethod) == null) {
          QueryGrpc.getRegisteredUsersMethod = getRegisteredUsersMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredUsers"))
              .build();
        }
      }
    }
    return getRegisteredUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> getBannedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BannedUsers",
      requestType = desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest.class,
      responseType = desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> getBannedUsersMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> getBannedUsersMethod;
    if ((getBannedUsersMethod = QueryGrpc.getBannedUsersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBannedUsersMethod = QueryGrpc.getBannedUsersMethod) == null) {
          QueryGrpc.getBannedUsersMethod = getBannedUsersMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest, desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BannedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BannedUsers"))
              .build();
        }
      }
    }
    return getBannedUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspaces",
      requestType = desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest.class,
      responseType = desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest,
      desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest, desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod;
    if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
          QueryGrpc.getSubspacesMethod = getSubspacesMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest, desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspaces"))
              .build();
        }
      }
    }
    return getSubspacesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public void subspace(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Admins queries all the admins of the subspace having the given id
     * </pre>
     */
    public void admins(desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredUsers queries all the registered users of the subspace having the
     * given id
     * </pre>
     */
    public void registeredUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * BannedUsers queries all the banned users of the subspace having the given
     * id
     * </pre>
     */
    public void bannedUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBannedUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public void subspaces(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubspacesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubspaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest,
                desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse>(
                  this, METHODID_SUBSPACE)))
          .addMethod(
            getAdminsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest,
                desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse>(
                  this, METHODID_ADMINS)))
          .addMethod(
            getRegisteredUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest,
                desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse>(
                  this, METHODID_REGISTERED_USERS)))
          .addMethod(
            getBannedUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest,
                desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse>(
                  this, METHODID_BANNED_USERS)))
          .addMethod(
            getSubspacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest,
                desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse>(
                  this, METHODID_SUBSPACES)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public void subspace(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Admins queries all the admins of the subspace having the given id
     * </pre>
     */
    public void admins(desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredUsers queries all the registered users of the subspace having the
     * given id
     * </pre>
     */
    public void registeredUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BannedUsers queries all the banned users of the subspace having the given
     * id
     * </pre>
     */
    public void bannedUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBannedUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public void subspaces(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse subspace(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Admins queries all the admins of the subspace having the given id
     * </pre>
     */
    public desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse admins(desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredUsers queries all the registered users of the subspace having the
     * given id
     * </pre>
     */
    public desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse registeredUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BannedUsers queries all the banned users of the subspace having the given
     * id
     * </pre>
     */
    public desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse bannedUsers(desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getBannedUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse subspaces(desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubspacesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse> subspace(
        desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Admins queries all the admins of the subspace having the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse> admins(
        desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredUsers queries all the registered users of the subspace having the
     * given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse> registeredUsers(
        desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BannedUsers queries all the banned users of the subspace having the given
     * id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse> bannedUsers(
        desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBannedUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse> subspaces(
        desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSPACE = 0;
  private static final int METHODID_ADMINS = 1;
  private static final int METHODID_REGISTERED_USERS = 2;
  private static final int METHODID_BANNED_USERS = 3;
  private static final int METHODID_SUBSPACES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSPACE:
          serviceImpl.subspace((desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspaceResponse>) responseObserver);
          break;
        case METHODID_ADMINS:
          serviceImpl.admins((desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryAdminsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_USERS:
          serviceImpl.registeredUsers((desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryRegisteredUsersResponse>) responseObserver);
          break;
        case METHODID_BANNED_USERS:
          serviceImpl.bannedUsers((desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QueryBannedUsersResponse>) responseObserver);
          break;
        case METHODID_SUBSPACES:
          serviceImpl.subspaces((desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v1beta1.QueryOuterClass.QuerySubspacesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return desmos.subspaces.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getSubspaceMethod())
              .addMethod(getAdminsMethod())
              .addMethod(getRegisteredUsersMethod())
              .addMethod(getBannedUsersMethod())
              .addMethod(getSubspacesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
