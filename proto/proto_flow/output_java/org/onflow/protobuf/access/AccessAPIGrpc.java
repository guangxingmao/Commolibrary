package org.onflow.protobuf.access;

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
 * AccessAPI is the public-facing API provided by access nodes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: flow/access/access.proto")
public final class AccessAPIGrpc {

  private AccessAPIGrpc() {}

  public static final String SERVICE_NAME = "flow.access.AccessAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.PingRequest,
      org.onflow.protobuf.access.Access.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = org.onflow.protobuf.access.Access.PingRequest.class,
      responseType = org.onflow.protobuf.access.Access.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.PingRequest,
      org.onflow.protobuf.access.Access.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.PingRequest, org.onflow.protobuf.access.Access.PingResponse> getPingMethod;
    if ((getPingMethod = AccessAPIGrpc.getPingMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getPingMethod = AccessAPIGrpc.getPingMethod) == null) {
          AccessAPIGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.PingRequest, org.onflow.protobuf.access.Access.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetLatestBlockHeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestBlockHeader",
      requestType = org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockHeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetLatestBlockHeaderMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetLatestBlockHeaderMethod;
    if ((getGetLatestBlockHeaderMethod = AccessAPIGrpc.getGetLatestBlockHeaderMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetLatestBlockHeaderMethod = AccessAPIGrpc.getGetLatestBlockHeaderMethod) == null) {
          AccessAPIGrpc.getGetLatestBlockHeaderMethod = getGetLatestBlockHeaderMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestBlockHeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockHeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetLatestBlockHeader"))
              .build();
        }
      }
    }
    return getGetLatestBlockHeaderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockHeaderByID",
      requestType = org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockHeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByIDMethod;
    if ((getGetBlockHeaderByIDMethod = AccessAPIGrpc.getGetBlockHeaderByIDMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetBlockHeaderByIDMethod = AccessAPIGrpc.getGetBlockHeaderByIDMethod) == null) {
          AccessAPIGrpc.getGetBlockHeaderByIDMethod = getGetBlockHeaderByIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockHeaderByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockHeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetBlockHeaderByID"))
              .build();
        }
      }
    }
    return getGetBlockHeaderByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockHeaderByHeight",
      requestType = org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockHeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest,
      org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByHeightMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse> getGetBlockHeaderByHeightMethod;
    if ((getGetBlockHeaderByHeightMethod = AccessAPIGrpc.getGetBlockHeaderByHeightMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetBlockHeaderByHeightMethod = AccessAPIGrpc.getGetBlockHeaderByHeightMethod) == null) {
          AccessAPIGrpc.getGetBlockHeaderByHeightMethod = getGetBlockHeaderByHeightMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest, org.onflow.protobuf.access.Access.BlockHeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockHeaderByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockHeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetBlockHeaderByHeight"))
              .build();
        }
      }
    }
    return getGetBlockHeaderByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetLatestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestBlock",
      requestType = org.onflow.protobuf.access.Access.GetLatestBlockRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetLatestBlockMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestBlockRequest, org.onflow.protobuf.access.Access.BlockResponse> getGetLatestBlockMethod;
    if ((getGetLatestBlockMethod = AccessAPIGrpc.getGetLatestBlockMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetLatestBlockMethod = AccessAPIGrpc.getGetLatestBlockMethod) == null) {
          AccessAPIGrpc.getGetLatestBlockMethod = getGetLatestBlockMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetLatestBlockRequest, org.onflow.protobuf.access.Access.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetLatestBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetLatestBlock"))
              .build();
        }
      }
    }
    return getGetLatestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByIDRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByID",
      requestType = org.onflow.protobuf.access.Access.GetBlockByIDRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByIDRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByIDRequest, org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByIDMethod;
    if ((getGetBlockByIDMethod = AccessAPIGrpc.getGetBlockByIDMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetBlockByIDMethod = AccessAPIGrpc.getGetBlockByIDMethod) == null) {
          AccessAPIGrpc.getGetBlockByIDMethod = getGetBlockByIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetBlockByIDRequest, org.onflow.protobuf.access.Access.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetBlockByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetBlockByID"))
              .build();
        }
      }
    }
    return getGetBlockByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByHeightRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByHeight",
      requestType = org.onflow.protobuf.access.Access.GetBlockByHeightRequest.class,
      responseType = org.onflow.protobuf.access.Access.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByHeightRequest,
      org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByHeightMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetBlockByHeightRequest, org.onflow.protobuf.access.Access.BlockResponse> getGetBlockByHeightMethod;
    if ((getGetBlockByHeightMethod = AccessAPIGrpc.getGetBlockByHeightMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetBlockByHeightMethod = AccessAPIGrpc.getGetBlockByHeightMethod) == null) {
          AccessAPIGrpc.getGetBlockByHeightMethod = getGetBlockByHeightMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetBlockByHeightRequest, org.onflow.protobuf.access.Access.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetBlockByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetBlockByHeight"))
              .build();
        }
      }
    }
    return getGetBlockByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetCollectionByIDRequest,
      org.onflow.protobuf.access.Access.CollectionResponse> getGetCollectionByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollectionByID",
      requestType = org.onflow.protobuf.access.Access.GetCollectionByIDRequest.class,
      responseType = org.onflow.protobuf.access.Access.CollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetCollectionByIDRequest,
      org.onflow.protobuf.access.Access.CollectionResponse> getGetCollectionByIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetCollectionByIDRequest, org.onflow.protobuf.access.Access.CollectionResponse> getGetCollectionByIDMethod;
    if ((getGetCollectionByIDMethod = AccessAPIGrpc.getGetCollectionByIDMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetCollectionByIDMethod = AccessAPIGrpc.getGetCollectionByIDMethod) == null) {
          AccessAPIGrpc.getGetCollectionByIDMethod = getGetCollectionByIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetCollectionByIDRequest, org.onflow.protobuf.access.Access.CollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollectionByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetCollectionByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.CollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetCollectionByID"))
              .build();
        }
      }
    }
    return getGetCollectionByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.SendTransactionRequest,
      org.onflow.protobuf.access.Access.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTransaction",
      requestType = org.onflow.protobuf.access.Access.SendTransactionRequest.class,
      responseType = org.onflow.protobuf.access.Access.SendTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.SendTransactionRequest,
      org.onflow.protobuf.access.Access.SendTransactionResponse> getSendTransactionMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.SendTransactionRequest, org.onflow.protobuf.access.Access.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = AccessAPIGrpc.getSendTransactionMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getSendTransactionMethod = AccessAPIGrpc.getSendTransactionMethod) == null) {
          AccessAPIGrpc.getSendTransactionMethod = getSendTransactionMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.SendTransactionRequest, org.onflow.protobuf.access.Access.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.SendTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.SendTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("SendTransaction"))
              .build();
        }
      }
    }
    return getSendTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest,
      org.onflow.protobuf.access.Access.TransactionResponse> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = org.onflow.protobuf.access.Access.GetTransactionRequest.class,
      responseType = org.onflow.protobuf.access.Access.TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest,
      org.onflow.protobuf.access.Access.TransactionResponse> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest, org.onflow.protobuf.access.Access.TransactionResponse> getGetTransactionMethod;
    if ((getGetTransactionMethod = AccessAPIGrpc.getGetTransactionMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetTransactionMethod = AccessAPIGrpc.getGetTransactionMethod) == null) {
          AccessAPIGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetTransactionRequest, org.onflow.protobuf.access.Access.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest,
      org.onflow.protobuf.access.Access.TransactionResultResponse> getGetTransactionResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionResult",
      requestType = org.onflow.protobuf.access.Access.GetTransactionRequest.class,
      responseType = org.onflow.protobuf.access.Access.TransactionResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest,
      org.onflow.protobuf.access.Access.TransactionResultResponse> getGetTransactionResultMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetTransactionRequest, org.onflow.protobuf.access.Access.TransactionResultResponse> getGetTransactionResultMethod;
    if ((getGetTransactionResultMethod = AccessAPIGrpc.getGetTransactionResultMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetTransactionResultMethod = AccessAPIGrpc.getGetTransactionResultMethod) == null) {
          AccessAPIGrpc.getGetTransactionResultMethod = getGetTransactionResultMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetTransactionRequest, org.onflow.protobuf.access.Access.TransactionResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.TransactionResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetTransactionResult"))
              .build();
        }
      }
    }
    return getGetTransactionResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountRequest,
      org.onflow.protobuf.access.Access.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = org.onflow.protobuf.access.Access.GetAccountRequest.class,
      responseType = org.onflow.protobuf.access.Access.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountRequest,
      org.onflow.protobuf.access.Access.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountRequest, org.onflow.protobuf.access.Access.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = AccessAPIGrpc.getGetAccountMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetAccountMethod = AccessAPIGrpc.getGetAccountMethod) == null) {
          AccessAPIGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetAccountRequest, org.onflow.protobuf.access.Access.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest,
      org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtLatestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountAtLatestBlock",
      requestType = org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest.class,
      responseType = org.onflow.protobuf.access.Access.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest,
      org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtLatestBlockMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest, org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtLatestBlockMethod;
    if ((getGetAccountAtLatestBlockMethod = AccessAPIGrpc.getGetAccountAtLatestBlockMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetAccountAtLatestBlockMethod = AccessAPIGrpc.getGetAccountAtLatestBlockMethod) == null) {
          AccessAPIGrpc.getGetAccountAtLatestBlockMethod = getGetAccountAtLatestBlockMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest, org.onflow.protobuf.access.Access.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountAtLatestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetAccountAtLatestBlock"))
              .build();
        }
      }
    }
    return getGetAccountAtLatestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest,
      org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountAtBlockHeight",
      requestType = org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest.class,
      responseType = org.onflow.protobuf.access.Access.AccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest,
      org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtBlockHeightMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest, org.onflow.protobuf.access.Access.AccountResponse> getGetAccountAtBlockHeightMethod;
    if ((getGetAccountAtBlockHeightMethod = AccessAPIGrpc.getGetAccountAtBlockHeightMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetAccountAtBlockHeightMethod = AccessAPIGrpc.getGetAccountAtBlockHeightMethod) == null) {
          AccessAPIGrpc.getGetAccountAtBlockHeightMethod = getGetAccountAtBlockHeightMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest, org.onflow.protobuf.access.Access.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountAtBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.AccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetAccountAtBlockHeight"))
              .build();
        }
      }
    }
    return getGetAccountAtBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtLatestBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteScriptAtLatestBlock",
      requestType = org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest.class,
      responseType = org.onflow.protobuf.access.Access.ExecuteScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtLatestBlockMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtLatestBlockMethod;
    if ((getExecuteScriptAtLatestBlockMethod = AccessAPIGrpc.getExecuteScriptAtLatestBlockMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getExecuteScriptAtLatestBlockMethod = AccessAPIGrpc.getExecuteScriptAtLatestBlockMethod) == null) {
          AccessAPIGrpc.getExecuteScriptAtLatestBlockMethod = getExecuteScriptAtLatestBlockMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteScriptAtLatestBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("ExecuteScriptAtLatestBlock"))
              .build();
        }
      }
    }
    return getExecuteScriptAtLatestBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteScriptAtBlockID",
      requestType = org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest.class,
      responseType = org.onflow.protobuf.access.Access.ExecuteScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockIDMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockIDMethod;
    if ((getExecuteScriptAtBlockIDMethod = AccessAPIGrpc.getExecuteScriptAtBlockIDMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getExecuteScriptAtBlockIDMethod = AccessAPIGrpc.getExecuteScriptAtBlockIDMethod) == null) {
          AccessAPIGrpc.getExecuteScriptAtBlockIDMethod = getExecuteScriptAtBlockIDMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteScriptAtBlockID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("ExecuteScriptAtBlockID"))
              .build();
        }
      }
    }
    return getExecuteScriptAtBlockIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteScriptAtBlockHeight",
      requestType = org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest.class,
      responseType = org.onflow.protobuf.access.Access.ExecuteScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest,
      org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockHeightMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse> getExecuteScriptAtBlockHeightMethod;
    if ((getExecuteScriptAtBlockHeightMethod = AccessAPIGrpc.getExecuteScriptAtBlockHeightMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getExecuteScriptAtBlockHeightMethod = AccessAPIGrpc.getExecuteScriptAtBlockHeightMethod) == null) {
          AccessAPIGrpc.getExecuteScriptAtBlockHeightMethod = getExecuteScriptAtBlockHeightMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest, org.onflow.protobuf.access.Access.ExecuteScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteScriptAtBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ExecuteScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("ExecuteScriptAtBlockHeight"))
              .build();
        }
      }
    }
    return getExecuteScriptAtBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest,
      org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForHeightRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsForHeightRange",
      requestType = org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest.class,
      responseType = org.onflow.protobuf.access.Access.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest,
      org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForHeightRangeMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest, org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForHeightRangeMethod;
    if ((getGetEventsForHeightRangeMethod = AccessAPIGrpc.getGetEventsForHeightRangeMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetEventsForHeightRangeMethod = AccessAPIGrpc.getGetEventsForHeightRangeMethod) == null) {
          AccessAPIGrpc.getGetEventsForHeightRangeMethod = getGetEventsForHeightRangeMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest, org.onflow.protobuf.access.Access.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsForHeightRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetEventsForHeightRange"))
              .build();
        }
      }
    }
    return getGetEventsForHeightRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest,
      org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForBlockIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsForBlockIDs",
      requestType = org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest.class,
      responseType = org.onflow.protobuf.access.Access.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest,
      org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForBlockIDsMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest, org.onflow.protobuf.access.Access.EventsResponse> getGetEventsForBlockIDsMethod;
    if ((getGetEventsForBlockIDsMethod = AccessAPIGrpc.getGetEventsForBlockIDsMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetEventsForBlockIDsMethod = AccessAPIGrpc.getGetEventsForBlockIDsMethod) == null) {
          AccessAPIGrpc.getGetEventsForBlockIDsMethod = getGetEventsForBlockIDsMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest, org.onflow.protobuf.access.Access.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsForBlockIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetEventsForBlockIDs"))
              .build();
        }
      }
    }
    return getGetEventsForBlockIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetNetworkParametersRequest,
      org.onflow.protobuf.access.Access.GetNetworkParametersResponse> getGetNetworkParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetworkParameters",
      requestType = org.onflow.protobuf.access.Access.GetNetworkParametersRequest.class,
      responseType = org.onflow.protobuf.access.Access.GetNetworkParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetNetworkParametersRequest,
      org.onflow.protobuf.access.Access.GetNetworkParametersResponse> getGetNetworkParametersMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetNetworkParametersRequest, org.onflow.protobuf.access.Access.GetNetworkParametersResponse> getGetNetworkParametersMethod;
    if ((getGetNetworkParametersMethod = AccessAPIGrpc.getGetNetworkParametersMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetNetworkParametersMethod = AccessAPIGrpc.getGetNetworkParametersMethod) == null) {
          AccessAPIGrpc.getGetNetworkParametersMethod = getGetNetworkParametersMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetNetworkParametersRequest, org.onflow.protobuf.access.Access.GetNetworkParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNetworkParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetNetworkParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetNetworkParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetNetworkParameters"))
              .build();
        }
      }
    }
    return getGetNetworkParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest,
      org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> getGetLatestProtocolStateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestProtocolStateSnapshot",
      requestType = org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest.class,
      responseType = org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest,
      org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> getGetLatestProtocolStateSnapshotMethod() {
    io.grpc.MethodDescriptor<org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest, org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> getGetLatestProtocolStateSnapshotMethod;
    if ((getGetLatestProtocolStateSnapshotMethod = AccessAPIGrpc.getGetLatestProtocolStateSnapshotMethod) == null) {
      synchronized (AccessAPIGrpc.class) {
        if ((getGetLatestProtocolStateSnapshotMethod = AccessAPIGrpc.getGetLatestProtocolStateSnapshotMethod) == null) {
          AccessAPIGrpc.getGetLatestProtocolStateSnapshotMethod = getGetLatestProtocolStateSnapshotMethod =
              io.grpc.MethodDescriptor.<org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest, org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestProtocolStateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessAPIMethodDescriptorSupplier("GetLatestProtocolStateSnapshot"))
              .build();
        }
      }
    }
    return getGetLatestProtocolStateSnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAPIStub>() {
        @java.lang.Override
        public AccessAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAPIStub(channel, callOptions);
        }
      };
    return AccessAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAPIBlockingStub>() {
        @java.lang.Override
        public AccessAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAPIBlockingStub(channel, callOptions);
        }
      };
    return AccessAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessAPIFutureStub>() {
        @java.lang.Override
        public AccessAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessAPIFutureStub(channel, callOptions);
        }
      };
    return AccessAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AccessAPI is the public-facing API provided by access nodes.
   * </pre>
   */
  public static abstract class AccessAPIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public void ping(org.onflow.protobuf.access.Access.PingRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlockHeader gets the latest sealed or unsealed block header.
     * </pre>
     */
    public void getLatestBlockHeader(org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestBlockHeaderMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBlockHeaderByID gets a block header by ID.
     * </pre>
     */
    public void getBlockHeaderByID(org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHeaderByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBlockHeaderByHeight gets a block header by height.
     * </pre>
     */
    public void getBlockHeaderByHeight(org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockHeaderByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlock gets the full payload of the latest sealed or unsealed
     * block.
     * </pre>
     */
    public void getLatestBlock(org.onflow.protobuf.access.Access.GetLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBlockByID gets a full block by ID.
     * </pre>
     */
    public void getBlockByID(org.onflow.protobuf.access.Access.GetBlockByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBlockByHeight gets a full block by height.
     * </pre>
     */
    public void getBlockByHeight(org.onflow.protobuf.access.Access.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollectionByID gets a collection by ID.
     * </pre>
     */
    public void getCollectionByID(org.onflow.protobuf.access.Access.GetCollectionByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.CollectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCollectionByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendTransaction submits a transaction to the network.
     * </pre>
     */
    public void sendTransaction(org.onflow.protobuf.access.Access.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTransaction gets a transaction by ID.
     * </pre>
     */
    public void getTransaction(org.onflow.protobuf.access.Access.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public void getTransactionResult(org.onflow.protobuf.access.Access.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAccount is an alias for GetAccountAtLatestBlock.
     * Warning: this function is deprecated. It behaves identically to
     * GetAccountAtLatestBlock and will be removed in a future version.
     * </pre>
     */
    public void getAccount(org.onflow.protobuf.access.Access.GetAccountRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtLatestBlock gets an account by address from the latest sealed
     * execution state.
     * </pre>
     */
    public void getAccountAtLatestBlock(org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountAtLatestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtBlockHeight gets an account by address at the given block
     * height
     * </pre>
     */
    public void getAccountAtBlockHeight(org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountAtBlockHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtLatestBlock executes a read-only Cadence script against the
     * latest sealed execution state.
     * </pre>
     */
    public void executeScriptAtLatestBlock(org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteScriptAtLatestBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public void executeScriptAtBlockID(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteScriptAtBlockIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockHeight executes a ready-only Cadence script against the
     * execution state at the given block height.
     * </pre>
     */
    public void executeScriptAtBlockHeight(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteScriptAtBlockHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventsForHeightRange retrieves events emitted within the specified block
     * range.
     * </pre>
     */
    public void getEventsForHeightRange(org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsForHeightRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for the specified block IDs and event
     * type.
     * </pre>
     */
    public void getEventsForBlockIDs(org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsForBlockIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNetworkParameters retrieves the Flow network details
     * </pre>
     */
    public void getNetworkParameters(org.onflow.protobuf.access.Access.GetNetworkParametersRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetNetworkParametersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLatestProtocolStateSnapshot retrieves the latest sealed protocol state
     * snapshot. Used by Flow nodes joining the network to bootstrap a
     * space-efficient local state.
     * </pre>
     */
    public void getLatestProtocolStateSnapshot(org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestProtocolStateSnapshotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.PingRequest,
                org.onflow.protobuf.access.Access.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetLatestBlockHeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest,
                org.onflow.protobuf.access.Access.BlockHeaderResponse>(
                  this, METHODID_GET_LATEST_BLOCK_HEADER)))
          .addMethod(
            getGetBlockHeaderByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest,
                org.onflow.protobuf.access.Access.BlockHeaderResponse>(
                  this, METHODID_GET_BLOCK_HEADER_BY_ID)))
          .addMethod(
            getGetBlockHeaderByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest,
                org.onflow.protobuf.access.Access.BlockHeaderResponse>(
                  this, METHODID_GET_BLOCK_HEADER_BY_HEIGHT)))
          .addMethod(
            getGetLatestBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetLatestBlockRequest,
                org.onflow.protobuf.access.Access.BlockResponse>(
                  this, METHODID_GET_LATEST_BLOCK)))
          .addMethod(
            getGetBlockByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetBlockByIDRequest,
                org.onflow.protobuf.access.Access.BlockResponse>(
                  this, METHODID_GET_BLOCK_BY_ID)))
          .addMethod(
            getGetBlockByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetBlockByHeightRequest,
                org.onflow.protobuf.access.Access.BlockResponse>(
                  this, METHODID_GET_BLOCK_BY_HEIGHT)))
          .addMethod(
            getGetCollectionByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetCollectionByIDRequest,
                org.onflow.protobuf.access.Access.CollectionResponse>(
                  this, METHODID_GET_COLLECTION_BY_ID)))
          .addMethod(
            getSendTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.SendTransactionRequest,
                org.onflow.protobuf.access.Access.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetTransactionRequest,
                org.onflow.protobuf.access.Access.TransactionResponse>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getGetTransactionResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetTransactionRequest,
                org.onflow.protobuf.access.Access.TransactionResultResponse>(
                  this, METHODID_GET_TRANSACTION_RESULT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetAccountRequest,
                org.onflow.protobuf.access.Access.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountAtLatestBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest,
                org.onflow.protobuf.access.Access.AccountResponse>(
                  this, METHODID_GET_ACCOUNT_AT_LATEST_BLOCK)))
          .addMethod(
            getGetAccountAtBlockHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest,
                org.onflow.protobuf.access.Access.AccountResponse>(
                  this, METHODID_GET_ACCOUNT_AT_BLOCK_HEIGHT)))
          .addMethod(
            getExecuteScriptAtLatestBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest,
                org.onflow.protobuf.access.Access.ExecuteScriptResponse>(
                  this, METHODID_EXECUTE_SCRIPT_AT_LATEST_BLOCK)))
          .addMethod(
            getExecuteScriptAtBlockIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest,
                org.onflow.protobuf.access.Access.ExecuteScriptResponse>(
                  this, METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID)))
          .addMethod(
            getExecuteScriptAtBlockHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest,
                org.onflow.protobuf.access.Access.ExecuteScriptResponse>(
                  this, METHODID_EXECUTE_SCRIPT_AT_BLOCK_HEIGHT)))
          .addMethod(
            getGetEventsForHeightRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest,
                org.onflow.protobuf.access.Access.EventsResponse>(
                  this, METHODID_GET_EVENTS_FOR_HEIGHT_RANGE)))
          .addMethod(
            getGetEventsForBlockIDsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest,
                org.onflow.protobuf.access.Access.EventsResponse>(
                  this, METHODID_GET_EVENTS_FOR_BLOCK_IDS)))
          .addMethod(
            getGetNetworkParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetNetworkParametersRequest,
                org.onflow.protobuf.access.Access.GetNetworkParametersResponse>(
                  this, METHODID_GET_NETWORK_PARAMETERS)))
          .addMethod(
            getGetLatestProtocolStateSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest,
                org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse>(
                  this, METHODID_GET_LATEST_PROTOCOL_STATE_SNAPSHOT)))
          .build();
    }
  }

  /**
   * <pre>
   * AccessAPI is the public-facing API provided by access nodes.
   * </pre>
   */
  public static final class AccessAPIStub extends io.grpc.stub.AbstractAsyncStub<AccessAPIStub> {
    private AccessAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public void ping(org.onflow.protobuf.access.Access.PingRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlockHeader gets the latest sealed or unsealed block header.
     * </pre>
     */
    public void getLatestBlockHeader(org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestBlockHeaderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBlockHeaderByID gets a block header by ID.
     * </pre>
     */
    public void getBlockHeaderByID(org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHeaderByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBlockHeaderByHeight gets a block header by height.
     * </pre>
     */
    public void getBlockHeaderByHeight(org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestBlock gets the full payload of the latest sealed or unsealed
     * block.
     * </pre>
     */
    public void getLatestBlock(org.onflow.protobuf.access.Access.GetLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBlockByID gets a full block by ID.
     * </pre>
     */
    public void getBlockByID(org.onflow.protobuf.access.Access.GetBlockByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBlockByHeight gets a full block by height.
     * </pre>
     */
    public void getBlockByHeight(org.onflow.protobuf.access.Access.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollectionByID gets a collection by ID.
     * </pre>
     */
    public void getCollectionByID(org.onflow.protobuf.access.Access.GetCollectionByIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.CollectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCollectionByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendTransaction submits a transaction to the network.
     * </pre>
     */
    public void sendTransaction(org.onflow.protobuf.access.Access.SendTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTransaction gets a transaction by ID.
     * </pre>
     */
    public void getTransaction(org.onflow.protobuf.access.Access.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public void getTransactionResult(org.onflow.protobuf.access.Access.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAccount is an alias for GetAccountAtLatestBlock.
     * Warning: this function is deprecated. It behaves identically to
     * GetAccountAtLatestBlock and will be removed in a future version.
     * </pre>
     */
    public void getAccount(org.onflow.protobuf.access.Access.GetAccountRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtLatestBlock gets an account by address from the latest sealed
     * execution state.
     * </pre>
     */
    public void getAccountAtLatestBlock(org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountAtLatestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAccountAtBlockHeight gets an account by address at the given block
     * height
     * </pre>
     */
    public void getAccountAtBlockHeight(org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountAtBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtLatestBlock executes a read-only Cadence script against the
     * latest sealed execution state.
     * </pre>
     */
    public void executeScriptAtLatestBlock(org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteScriptAtLatestBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public void executeScriptAtBlockID(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockHeight executes a ready-only Cadence script against the
     * execution state at the given block height.
     * </pre>
     */
    public void executeScriptAtBlockHeight(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventsForHeightRange retrieves events emitted within the specified block
     * range.
     * </pre>
     */
    public void getEventsForHeightRange(org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsForHeightRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for the specified block IDs and event
     * type.
     * </pre>
     */
    public void getEventsForBlockIDs(org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsForBlockIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNetworkParameters retrieves the Flow network details
     * </pre>
     */
    public void getNetworkParameters(org.onflow.protobuf.access.Access.GetNetworkParametersRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetNetworkParametersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLatestProtocolStateSnapshot retrieves the latest sealed protocol state
     * snapshot. Used by Flow nodes joining the network to bootstrap a
     * space-efficient local state.
     * </pre>
     */
    public void getLatestProtocolStateSnapshot(org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest request,
        io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestProtocolStateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AccessAPI is the public-facing API provided by access nodes.
   * </pre>
   */
  public static final class AccessAPIBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessAPIBlockingStub> {
    private AccessAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.PingResponse ping(org.onflow.protobuf.access.Access.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestBlockHeader gets the latest sealed or unsealed block header.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockHeaderResponse getLatestBlockHeader(org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestBlockHeaderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBlockHeaderByID gets a block header by ID.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockHeaderResponse getBlockHeaderByID(org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHeaderByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBlockHeaderByHeight gets a block header by height.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockHeaderResponse getBlockHeaderByHeight(org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockHeaderByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestBlock gets the full payload of the latest sealed or unsealed
     * block.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockResponse getLatestBlock(org.onflow.protobuf.access.Access.GetLatestBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBlockByID gets a full block by ID.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockResponse getBlockByID(org.onflow.protobuf.access.Access.GetBlockByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBlockByHeight gets a full block by height.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.BlockResponse getBlockByHeight(org.onflow.protobuf.access.Access.GetBlockByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollectionByID gets a collection by ID.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.CollectionResponse getCollectionByID(org.onflow.protobuf.access.Access.GetCollectionByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCollectionByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendTransaction submits a transaction to the network.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.SendTransactionResponse sendTransaction(org.onflow.protobuf.access.Access.SendTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTransaction gets a transaction by ID.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.TransactionResponse getTransaction(org.onflow.protobuf.access.Access.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.TransactionResultResponse getTransactionResult(org.onflow.protobuf.access.Access.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAccount is an alias for GetAccountAtLatestBlock.
     * Warning: this function is deprecated. It behaves identically to
     * GetAccountAtLatestBlock and will be removed in a future version.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.GetAccountResponse getAccount(org.onflow.protobuf.access.Access.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAccountAtLatestBlock gets an account by address from the latest sealed
     * execution state.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.AccountResponse getAccountAtLatestBlock(org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountAtLatestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAccountAtBlockHeight gets an account by address at the given block
     * height
     * </pre>
     */
    public org.onflow.protobuf.access.Access.AccountResponse getAccountAtBlockHeight(org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountAtBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtLatestBlock executes a read-only Cadence script against the
     * latest sealed execution state.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.ExecuteScriptResponse executeScriptAtLatestBlock(org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteScriptAtLatestBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.ExecuteScriptResponse executeScriptAtBlockID(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteScriptAtBlockIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockHeight executes a ready-only Cadence script against the
     * execution state at the given block height.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.ExecuteScriptResponse executeScriptAtBlockHeight(org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteScriptAtBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventsForHeightRange retrieves events emitted within the specified block
     * range.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.EventsResponse getEventsForHeightRange(org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsForHeightRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for the specified block IDs and event
     * type.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.EventsResponse getEventsForBlockIDs(org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsForBlockIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNetworkParameters retrieves the Flow network details
     * </pre>
     */
    public org.onflow.protobuf.access.Access.GetNetworkParametersResponse getNetworkParameters(org.onflow.protobuf.access.Access.GetNetworkParametersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLatestProtocolStateSnapshot retrieves the latest sealed protocol state
     * snapshot. Used by Flow nodes joining the network to bootstrap a
     * space-efficient local state.
     * </pre>
     */
    public org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse getLatestProtocolStateSnapshot(org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestProtocolStateSnapshotMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AccessAPI is the public-facing API provided by access nodes.
   * </pre>
   */
  public static final class AccessAPIFutureStub extends io.grpc.stub.AbstractFutureStub<AccessAPIFutureStub> {
    private AccessAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping is used to check if the access node is alive and healthy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.PingResponse> ping(
        org.onflow.protobuf.access.Access.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestBlockHeader gets the latest sealed or unsealed block header.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockHeaderResponse> getLatestBlockHeader(
        org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestBlockHeaderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBlockHeaderByID gets a block header by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockHeaderResponse> getBlockHeaderByID(
        org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHeaderByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBlockHeaderByHeight gets a block header by height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockHeaderResponse> getBlockHeaderByHeight(
        org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockHeaderByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestBlock gets the full payload of the latest sealed or unsealed
     * block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockResponse> getLatestBlock(
        org.onflow.protobuf.access.Access.GetLatestBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBlockByID gets a full block by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockResponse> getBlockByID(
        org.onflow.protobuf.access.Access.GetBlockByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBlockByHeight gets a full block by height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.BlockResponse> getBlockByHeight(
        org.onflow.protobuf.access.Access.GetBlockByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollectionByID gets a collection by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.CollectionResponse> getCollectionByID(
        org.onflow.protobuf.access.Access.GetCollectionByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCollectionByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendTransaction submits a transaction to the network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.SendTransactionResponse> sendTransaction(
        org.onflow.protobuf.access.Access.SendTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTransaction gets a transaction by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.TransactionResponse> getTransaction(
        org.onflow.protobuf.access.Access.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTransactionResult gets the result of a transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.TransactionResultResponse> getTransactionResult(
        org.onflow.protobuf.access.Access.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAccount is an alias for GetAccountAtLatestBlock.
     * Warning: this function is deprecated. It behaves identically to
     * GetAccountAtLatestBlock and will be removed in a future version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.GetAccountResponse> getAccount(
        org.onflow.protobuf.access.Access.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAccountAtLatestBlock gets an account by address from the latest sealed
     * execution state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.AccountResponse> getAccountAtLatestBlock(
        org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountAtLatestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAccountAtBlockHeight gets an account by address at the given block
     * height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.AccountResponse> getAccountAtBlockHeight(
        org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountAtBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtLatestBlock executes a read-only Cadence script against the
     * latest sealed execution state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.ExecuteScriptResponse> executeScriptAtLatestBlock(
        org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteScriptAtLatestBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockID executes a ready-only Cadence script against the
     * execution state at the block with the given ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.ExecuteScriptResponse> executeScriptAtBlockID(
        org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteScriptAtBlockHeight executes a ready-only Cadence script against the
     * execution state at the given block height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.ExecuteScriptResponse> executeScriptAtBlockHeight(
        org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteScriptAtBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEventsForHeightRange retrieves events emitted within the specified block
     * range.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.EventsResponse> getEventsForHeightRange(
        org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsForHeightRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEventsForBlockIDs retrieves events for the specified block IDs and event
     * type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.EventsResponse> getEventsForBlockIDs(
        org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsForBlockIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNetworkParameters retrieves the Flow network details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.GetNetworkParametersResponse> getNetworkParameters(
        org.onflow.protobuf.access.Access.GetNetworkParametersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLatestProtocolStateSnapshot retrieves the latest sealed protocol state
     * snapshot. Used by Flow nodes joining the network to bootstrap a
     * space-efficient local state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse> getLatestProtocolStateSnapshot(
        org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestProtocolStateSnapshotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_LATEST_BLOCK_HEADER = 1;
  private static final int METHODID_GET_BLOCK_HEADER_BY_ID = 2;
  private static final int METHODID_GET_BLOCK_HEADER_BY_HEIGHT = 3;
  private static final int METHODID_GET_LATEST_BLOCK = 4;
  private static final int METHODID_GET_BLOCK_BY_ID = 5;
  private static final int METHODID_GET_BLOCK_BY_HEIGHT = 6;
  private static final int METHODID_GET_COLLECTION_BY_ID = 7;
  private static final int METHODID_SEND_TRANSACTION = 8;
  private static final int METHODID_GET_TRANSACTION = 9;
  private static final int METHODID_GET_TRANSACTION_RESULT = 10;
  private static final int METHODID_GET_ACCOUNT = 11;
  private static final int METHODID_GET_ACCOUNT_AT_LATEST_BLOCK = 12;
  private static final int METHODID_GET_ACCOUNT_AT_BLOCK_HEIGHT = 13;
  private static final int METHODID_EXECUTE_SCRIPT_AT_LATEST_BLOCK = 14;
  private static final int METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID = 15;
  private static final int METHODID_EXECUTE_SCRIPT_AT_BLOCK_HEIGHT = 16;
  private static final int METHODID_GET_EVENTS_FOR_HEIGHT_RANGE = 17;
  private static final int METHODID_GET_EVENTS_FOR_BLOCK_IDS = 18;
  private static final int METHODID_GET_NETWORK_PARAMETERS = 19;
  private static final int METHODID_GET_LATEST_PROTOCOL_STATE_SNAPSHOT = 20;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((org.onflow.protobuf.access.Access.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.PingResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_BLOCK_HEADER:
          serviceImpl.getLatestBlockHeader((org.onflow.protobuf.access.Access.GetLatestBlockHeaderRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEADER_BY_ID:
          serviceImpl.getBlockHeaderByID((org.onflow.protobuf.access.Access.GetBlockHeaderByIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEADER_BY_HEIGHT:
          serviceImpl.getBlockHeaderByHeight((org.onflow.protobuf.access.Access.GetBlockHeaderByHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockHeaderResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_BLOCK:
          serviceImpl.getLatestBlock((org.onflow.protobuf.access.Access.GetLatestBlockRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockByID((org.onflow.protobuf.access.Access.GetBlockByIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HEIGHT:
          serviceImpl.getBlockByHeight((org.onflow.protobuf.access.Access.GetBlockByHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_COLLECTION_BY_ID:
          serviceImpl.getCollectionByID((org.onflow.protobuf.access.Access.GetCollectionByIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.CollectionResponse>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((org.onflow.protobuf.access.Access.SendTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((org.onflow.protobuf.access.Access.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RESULT:
          serviceImpl.getTransactionResult((org.onflow.protobuf.access.Access.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.TransactionResultResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.onflow.protobuf.access.Access.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_AT_LATEST_BLOCK:
          serviceImpl.getAccountAtLatestBlock((org.onflow.protobuf.access.Access.GetAccountAtLatestBlockRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_AT_BLOCK_HEIGHT:
          serviceImpl.getAccountAtBlockHeight((org.onflow.protobuf.access.Access.GetAccountAtBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.AccountResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_SCRIPT_AT_LATEST_BLOCK:
          serviceImpl.executeScriptAtLatestBlock((org.onflow.protobuf.access.Access.ExecuteScriptAtLatestBlockRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_SCRIPT_AT_BLOCK_ID:
          serviceImpl.executeScriptAtBlockID((org.onflow.protobuf.access.Access.ExecuteScriptAtBlockIDRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_SCRIPT_AT_BLOCK_HEIGHT:
          serviceImpl.executeScriptAtBlockHeight((org.onflow.protobuf.access.Access.ExecuteScriptAtBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ExecuteScriptResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_FOR_HEIGHT_RANGE:
          serviceImpl.getEventsForHeightRange((org.onflow.protobuf.access.Access.GetEventsForHeightRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_FOR_BLOCK_IDS:
          serviceImpl.getEventsForBlockIDs((org.onflow.protobuf.access.Access.GetEventsForBlockIDsRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_PARAMETERS:
          serviceImpl.getNetworkParameters((org.onflow.protobuf.access.Access.GetNetworkParametersRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.GetNetworkParametersResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_PROTOCOL_STATE_SNAPSHOT:
          serviceImpl.getLatestProtocolStateSnapshot((org.onflow.protobuf.access.Access.GetLatestProtocolStateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<org.onflow.protobuf.access.Access.ProtocolStateSnapshotResponse>) responseObserver);
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

  private static abstract class AccessAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onflow.protobuf.access.Access.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessAPI");
    }
  }

  private static final class AccessAPIFileDescriptorSupplier
      extends AccessAPIBaseDescriptorSupplier {
    AccessAPIFileDescriptorSupplier() {}
  }

  private static final class AccessAPIMethodDescriptorSupplier
      extends AccessAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessAPIFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetLatestBlockHeaderMethod())
              .addMethod(getGetBlockHeaderByIDMethod())
              .addMethod(getGetBlockHeaderByHeightMethod())
              .addMethod(getGetLatestBlockMethod())
              .addMethod(getGetBlockByIDMethod())
              .addMethod(getGetBlockByHeightMethod())
              .addMethod(getGetCollectionByIDMethod())
              .addMethod(getSendTransactionMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionResultMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountAtLatestBlockMethod())
              .addMethod(getGetAccountAtBlockHeightMethod())
              .addMethod(getExecuteScriptAtLatestBlockMethod())
              .addMethod(getExecuteScriptAtBlockIDMethod())
              .addMethod(getExecuteScriptAtBlockHeightMethod())
              .addMethod(getGetEventsForHeightRangeMethod())
              .addMethod(getGetEventsForBlockIDsMethod())
              .addMethod(getGetNetworkParametersMethod())
              .addMethod(getGetLatestProtocolStateSnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
