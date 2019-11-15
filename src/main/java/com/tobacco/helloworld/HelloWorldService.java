package com.tobacco.helloworld;




import com.tobacco.generator.entities.User;
import com.tobacco.generator.mapper.UserMapper;
import com.tobacco.proto.HelloGrpc;
import com.tobacco.proto.HelloWord;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Chen Jian
 */
@Slf4j
@GrpcService(HelloWord.class)
@Service
public class HelloWorldService extends HelloGrpc.HelloImplBase {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void sayHello(HelloWord.HelloRequest request, StreamObserver<HelloWord.HelloReply> responseObserver) {
        HelloWord.HelloReplyOrBuilder helloReplyOrBuilder = HelloWord.HelloReply.newBuilder();
        ((HelloWord.HelloReply.Builder) helloReplyOrBuilder).setMessage(request.getName());

        responseObserver.onNext(((HelloWord.HelloReply.Builder) helloReplyOrBuilder).build());
        responseObserver.onCompleted();
        User user = new User();
        user.setId("ggggg");
        user.setName("sa");
        user.setTest("sdasd");
        System.out.println(user.getName());
        userMapper.insert(user);
    }

}
