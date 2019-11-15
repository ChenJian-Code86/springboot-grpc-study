package com.tobacco.helloworld;

import com.tobacco.entities.Test;
import com.tobacco.mapper.TestMapper;

import com.tobacco.proto.TestGrpc;
import com.tobacco.proto.TestOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Slf4j
@GrpcService(TestOuterClass.class)
@Service
public class TestService extends TestGrpc.TestImplBase {
    @Autowired
    private TestMapper testMapper;
    @Override
    public void testJpa(com.tobacco.proto.TestOuterClass.TestRequest request,
                        StreamObserver<com.tobacco.proto.TestOuterClass.TestReply> responseObserver) {
        ArrayList<Test> sa= new ArrayList<Test>();
        Test test = new Test();
        test.setId(121);
        test.setName("2121");
        test.setTest("weqweq");
        sa.add(test);
        testMapper.saveAll(sa);

    }
}
