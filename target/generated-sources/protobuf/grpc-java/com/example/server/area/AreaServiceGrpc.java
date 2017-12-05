package com.example.server.area;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: CalculateArea.proto")
public final class AreaServiceGrpc {

  private AreaServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.server.area.AreaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAreaMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.example.server.area.AreaRequest,
      com.example.server.area.AreaResponse> METHOD_GET_AREA = getGetAreaMethod();

  private static volatile io.grpc.MethodDescriptor<com.example.server.area.AreaRequest,
      com.example.server.area.AreaResponse> getGetAreaMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.example.server.area.AreaRequest,
      com.example.server.area.AreaResponse> getGetAreaMethod() {
    io.grpc.MethodDescriptor<com.example.server.area.AreaRequest, com.example.server.area.AreaResponse> getGetAreaMethod;
    if ((getGetAreaMethod = AreaServiceGrpc.getGetAreaMethod) == null) {
      synchronized (AreaServiceGrpc.class) {
        if ((getGetAreaMethod = AreaServiceGrpc.getGetAreaMethod) == null) {
          AreaServiceGrpc.getGetAreaMethod = getGetAreaMethod = 
              io.grpc.MethodDescriptor.<com.example.server.area.AreaRequest, com.example.server.area.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.server.area.AreaService", "GetArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.server.area.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.server.area.AreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AreaServiceMethodDescriptorSupplier("GetArea"))
                  .build();
          }
        }
     }
     return getGetAreaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AreaServiceStub newStub(io.grpc.Channel channel) {
    return new AreaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AreaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AreaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AreaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AreaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AreaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getArea(com.example.server.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.example.server.area.AreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAreaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAreaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.server.area.AreaRequest,
                com.example.server.area.AreaResponse>(
                  this, METHODID_GET_AREA)))
          .build();
    }
  }

  /**
   */
  public static final class AreaServiceStub extends io.grpc.stub.AbstractStub<AreaServiceStub> {
    private AreaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceStub(channel, callOptions);
    }

    /**
     */
    public void getArea(com.example.server.area.AreaRequest request,
        io.grpc.stub.StreamObserver<com.example.server.area.AreaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAreaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AreaServiceBlockingStub extends io.grpc.stub.AbstractStub<AreaServiceBlockingStub> {
    private AreaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.server.area.AreaResponse getArea(com.example.server.area.AreaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAreaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AreaServiceFutureStub extends io.grpc.stub.AbstractStub<AreaServiceFutureStub> {
    private AreaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AreaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AreaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AreaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.server.area.AreaResponse> getArea(
        com.example.server.area.AreaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAreaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AREA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AreaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AreaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AREA:
          serviceImpl.getArea((com.example.server.area.AreaRequest) request,
              (io.grpc.stub.StreamObserver<com.example.server.area.AreaResponse>) responseObserver);
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

  private static abstract class AreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AreaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.server.area.CalculateArea.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AreaService");
    }
  }

  private static final class AreaServiceFileDescriptorSupplier
      extends AreaServiceBaseDescriptorSupplier {
    AreaServiceFileDescriptorSupplier() {}
  }

  private static final class AreaServiceMethodDescriptorSupplier
      extends AreaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AreaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AreaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AreaServiceFileDescriptorSupplier())
              .addMethod(getGetAreaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
