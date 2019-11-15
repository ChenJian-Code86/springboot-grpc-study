package com.tobacco.proto;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: test.proto")
public final class TestGrpc {

  private TestGrpc() {}

  public static final String SERVICE_NAME = "test.Test";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tobacco.proto.TestOuterClass.TestRequest,
      com.tobacco.proto.TestOuterClass.TestReply> getTestJpaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestJpa",
      requestType = com.tobacco.proto.TestOuterClass.TestRequest.class,
      responseType = com.tobacco.proto.TestOuterClass.TestReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tobacco.proto.TestOuterClass.TestRequest,
      com.tobacco.proto.TestOuterClass.TestReply> getTestJpaMethod() {
    io.grpc.MethodDescriptor<com.tobacco.proto.TestOuterClass.TestRequest, com.tobacco.proto.TestOuterClass.TestReply> getTestJpaMethod;
    if ((getTestJpaMethod = TestGrpc.getTestJpaMethod) == null) {
      synchronized (TestGrpc.class) {
        if ((getTestJpaMethod = TestGrpc.getTestJpaMethod) == null) {
          TestGrpc.getTestJpaMethod = getTestJpaMethod =
              io.grpc.MethodDescriptor.<com.tobacco.proto.TestOuterClass.TestRequest, com.tobacco.proto.TestOuterClass.TestReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestJpa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tobacco.proto.TestOuterClass.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tobacco.proto.TestOuterClass.TestReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestMethodDescriptorSupplier("TestJpa"))
              .build();
        }
      }
    }
    return getTestJpaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestStub newStub(io.grpc.Channel channel) {
    return new TestStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class TestImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void testJpa(com.tobacco.proto.TestOuterClass.TestRequest request,
        io.grpc.stub.StreamObserver<com.tobacco.proto.TestOuterClass.TestReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTestJpaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestJpaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tobacco.proto.TestOuterClass.TestRequest,
                com.tobacco.proto.TestOuterClass.TestReply>(
                  this, METHODID_TEST_JPA)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TestStub extends io.grpc.stub.AbstractStub<TestStub> {
    private TestStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void testJpa(com.tobacco.proto.TestOuterClass.TestRequest request,
        io.grpc.stub.StreamObserver<com.tobacco.proto.TestOuterClass.TestReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestJpaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TestBlockingStub extends io.grpc.stub.AbstractStub<TestBlockingStub> {
    private TestBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.tobacco.proto.TestOuterClass.TestReply testJpa(com.tobacco.proto.TestOuterClass.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestJpaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TestFutureStub extends io.grpc.stub.AbstractStub<TestFutureStub> {
    private TestFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tobacco.proto.TestOuterClass.TestReply> testJpa(
        com.tobacco.proto.TestOuterClass.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestJpaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_JPA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_JPA:
          serviceImpl.testJpa((com.tobacco.proto.TestOuterClass.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.tobacco.proto.TestOuterClass.TestReply>) responseObserver);
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

  private static abstract class TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tobacco.proto.TestOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Test");
    }
  }

  private static final class TestFileDescriptorSupplier
      extends TestBaseDescriptorSupplier {
    TestFileDescriptorSupplier() {}
  }

  private static final class TestMethodDescriptorSupplier
      extends TestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestFileDescriptorSupplier())
              .addMethod(getTestJpaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
