package org.onflow.protobuf.execution;

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
 * ExecutionAPI is the API provided by the execution nodes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: flow/execution/execution.proto")
public final class ExecutionAPIGrpc {

  private ExecutionAPIGrpc() {}

  public static final String SERVICE_NAME = "flow.execution.ExecutionAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.PingRequest,
      org.onflow.protobuf.execution.Execution.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = org.onflow.protobuf.execution.Execution.PingRequest.class,
      responseType = org.onflow.protobuf.execution.Execution.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.PingRequest,
      org.onflow.protobuf.execution.Execution.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.PingRequest, org.onflow.protobuf.execution.Execution.PingResponse> getPingMethod;
    if ((getPingMethod = ExecutionAPIGrpc.getPingMethod) == null) {
      synchronized (ExecutionAPIGrpc.class) {
        if ((getPingMethod = ExecutionAPIGrpc.getPingMethod) == null) {
          ExecutionAPIGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.execution.Execution.PingRequest, org.onflow.protobuf.execution.Execution.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionAPIMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest,
      org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> getGetAccountAtBlockIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountAtBlockID",
      requestType = org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest.class,
      responseType = org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest,
      org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> getGetAccountAtBlockIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest, org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> getGetAccountAtBlockIDMethod;
    if ((getGetAccountAtBlockIDMethod = ExecutionAPIGrpc.getGetAccountAtBlockIDMethod) == null) {
      synchronized (ExecutionAPIGrpc.class) {
        if ((getGetAccountAtBlockIDMethod = ExecutionAPIGrpc.getGetAccountAtBlockIDMethod) == null) {
          ExecutionAPIGrpc.getGetAccountAtBlockIDMethod = getGetAccountAtBlockIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest, org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountAtBlockID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionAPIMethodDescriptorSupplier("GetAccountAtBlockID"))
              .build();
        }
      }
    }
    return getGetAccountAtBlockIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest,
      org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> getExecuteScriptAtBlockIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteScriptAtBlockID",
      requestType = org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest.class,
      responseType = org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest,
      org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> getExecuteScriptAtBlockIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest, org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> getExecuteScriptAtBlockIDMethod;
    if ((getExecuteScriptAtBlockIDMethod = ExecutionAPIGrpc.getExecuteScriptAtBlockIDMethod) == null) {
      synchronized (ExecutionAPIGrpc.class) {
        if ((getExecuteScriptAtBlockIDMethod = ExecutionAPIGrpc.getExecuteScriptAtBlockIDMethod) == null) {
          ExecutionAPIGrpc.getExecuteScriptAtBlockIDMethod = getExecuteScriptAtBlockIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest, org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteScriptAtBlockID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionAPIMethodDescriptorSupplier("ExecuteScriptAtBlockID"))
              .build();
        }
      }
    }
    return getExecuteScriptAtBlockIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest,
      org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> getGetEventsForBlockIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsForBlockIDs",
      requestType = org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest.class,
      responseType = org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest,
      org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> getGetEventsForBlockIDsMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest, org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> getGetEventsForBlockIDsMethod;
    if ((getGetEventsForBlockIDsMethod = ExecutionAPIGrpc.getGetEventsForBlockIDsMethod) == null) {
      synchronized (ExecutionAPIGrpc.class) {
        if ((getGetEventsForBlockIDsMethod = ExecutionAPIGrpc.getGetEventsForBlockIDsMethod) == null) {
          ExecutionAPIGrpc.getGetEventsForBlockIDsMethod = getGetEventsForBlockIDsMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest, org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsForBlockIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionAPIMethodDescriptorSupplier("GetEventsForBlockIDs"))
              .build();
        }
      }
    }
    return getGetEventsForBlockIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetTransactionResultRequest,
      org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> getGetTransactionResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionResult",
      requestType = org.onflow.protobuf.execution.Execution.GetTransactionResultRequest.class,
      responseType = org.onflow.protobuf.execution.Execution.GetTransactionResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetTransactionResultRequest,
      org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> getGetTransactionResultMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.execution.Execution.GetTransactionResultRequest, org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> getGetTransactionResultMethod;
    if ((getGetTransactionResultMethod = ExecutionAPIGrpc.getGetTransactionResultMethod) == null) {
      synchronized (ExecutionAPIGrpc.class) {
        if ((getGetTransactionResultMethod = ExecutionAPIGrpc.getGetTransactionResultMethod) == null) {
          ExecutionAPIGrpc.getGetTransactionResultMethod = getGetTransactionResultMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.execution.Execution.GetTransactionResultRequest, org.onflow.protobuf.execution.Execution.GetTransactionResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetTransactionResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.execution.Execution.GetTransactionResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutionAPIMethodDescriptorSupplier("GetTransactionResult"))
              .build();
        }
      }
    }
    return getGetTransactionResultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecutionAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIStub>() {
        @java.lang.Override
        public ExecutionAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionAPIStub(channel, callOptions);
        }
      };
    return ExecutionAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutionAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIBlockingStub>() {
        @java.lang.Override
        public ExecutionAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionAPIBlockingStub(channel, callOptions);
        }
      };
    return ExecutionAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExecutionAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutionAPIFutureStub>() {
        @java.lang.Override
        public ExecutionAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutionAPIFutureStub(channel, callOptions);
        }
      };
    return ExecutionAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ExecutionAPI is the API provided by the execution nodes.
   * </pre>
   */
  public static abstract class ExecutionAPIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public void ping(org.onflow.protobuf.execution.Execution.PingRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtBlockID gets an account by address at the given block ID
     * </pre>
     */
    public void getAccountAtBlockID(org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountAtBlockIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public void executeScriptAtBlockID(org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteScriptAtBlockIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for all the specified block IDs that
     * have the given type
     * </pre>
     */
    public void getEventsForBlockIDs(org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsForBlockIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public void getTransactionResult(org.onflow.protobuf.execution.Execution.GetTransactionResultRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionResultMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.execution.Execution.PingRequest,
                org.onflow.protobuf.execution.Execution.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetAccountAtBlockIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest,
                org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse>(
                  this, METHODID_GET_ACCOUNT_AT_BLOCK_ID)))
          .addMethod(
            getExecuteScriptAtBlockIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest,
                org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse>(
                  this, METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID)))
          .addMethod(
            getGetEventsForBlockIDsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest,
                org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse>(
                  this, METHODID_GET_EVENTS_FOR_BLOCK_IDS)))
          .addMethod(
            getGetTransactionResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.execution.Execution.GetTransactionResultRequest,
                org.onflow.protobuf.execution.Execution.GetTransactionResultResponse>(
                  this, METHODID_GET_TRANSACTION_RESULT)))
          .build();
    }
  }

  /**
   * <pre>
   * ExecutionAPI is the API provided by the execution nodes.
   * </pre>
   */
  public static final class ExecutionAPIStub extends io.grpc.stub.AbstractAsyncStub<ExecutionAPIStub> {
    private ExecutionAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public void ping(org.onflow.protobuf.execution.Execution.PingRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtBlockID gets an account by address at the given block ID
     * </pre>
     */
    public void getAccountAtBlockID(org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountAtBlockIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public void executeScriptAtBlockID(org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for all the specified block IDs that
     * have the given type
     * </pre>
     */
    public void getEventsForBlockIDs(org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsForBlockIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public void getTransactionResult(org.onflow.protobuf.execution.Execution.GetTransactionResultRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionResultMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ExecutionAPI is the API provided by the execution nodes.
   * </pre>
   */
  public static final class ExecutionAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExecutionAPIBlockingStub> {
    private ExecutionAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public org.onflow.protobuf.execution.Execution.PingResponse ping(org.onflow.protobuf.execution.Execution.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAccountAtBlockID gets an account by address at the given block ID
     * </pre>
     */
    public org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse getAccountAtBlockID(org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountAtBlockIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse executeScriptAtBlockID(org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteScriptAtBlockIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for all the specified block IDs that
     * have the given type
     * </pre>
     */
    public org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse getEventsForBlockIDs(org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsForBlockIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public org.onflow.protobuf.execution.Execution.GetTransactionResultResponse getTransactionResult(org.onflow.protobuf.execution.Execution.GetTransactionResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionResultMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ExecutionAPI is the API provided by the execution nodes.
   * </pre>
   */
  public static final class ExecutionAPIFutureStub extends io.grpc.stub.AbstractFutureStub<ExecutionAPIFutureStub> {
    private ExecutionAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutionAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.execution.Execution.PingResponse> ping(
        org.onflow.protobuf.execution.Execution.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAccountAtBlockID gets an account by address at the given block ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse> getAccountAtBlockID(
        org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountAtBlockIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse> executeScriptAtBlockID(
        org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for all the specified block IDs that
     * have the given type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse> getEventsForBlockIDs(
        org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsForBlockIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.execution.Execution.GetTransactionResultResponse> getTransactionResult(
        org.onflow.protobuf.execution.Execution.GetTransactionResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionResultMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_ACCOUNT_AT_BLOCK_ID = 1;
  private static final int METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID = 2;
  private static final int METHODID_GET_EVENTS_FOR_BLOCK_IDS = 3;
  private static final int METHODID_GET_TRANSACTION_RESULT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExecutionAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExecutionAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((org.onflow.protobuf.execution.Execution.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.PingResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_AT_BLOCK_ID:
          serviceImpl.getAccountAtBlockID((org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetAccountAtBlockIDResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID:
          serviceImpl.executeScriptAtBlockID((org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.ExecuteScriptAtBlockIDResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_FOR_BLOCK_IDS:
          serviceImpl.getEventsForBlockIDs((org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetEventsForBlockIDsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RESULT:
          serviceImpl.getTransactionResult((org.onflow.protobuf.execution.Execution.GetTransactionResultRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.execution.Execution.GetTransactionResultResponse>) responseObserver);
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

  private static abstract class ExecutionAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExecutionAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onflow.protobuf.execution.Execution.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExecutionAPI");
    }
  }

  private static final class ExecutionAPIFileDescriptorSupplier
      extends ExecutionAPIBaseDescriptorSupplier {
    ExecutionAPIFileDescriptorSupplier() {}
  }

  private static final class ExecutionAPIMethodDescriptorSupplier
      extends ExecutionAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExecutionAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExecutionAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExecutionAPIFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetAccountAtBlockIDMethod())
              .addMethod(getExecuteScriptAtBlockIDMethod())
              .addMethod(getGetEventsForBlockIDsMethod())
              .addMethod(getGetTransactionResultMethod())
              .build();
        }
      }
    }
    return result;
  }
}
