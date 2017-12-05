package com.example.grpc.server;

import com.example.server.GreetingServiceGrpc.GreetingServiceImplBase;
import com.example.server.HelloRequest;
import com.example.server.HelloResponse;

import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceImplBase {
  
  @Override
  public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
    
    String name = request.getName();
    System.out.println("......."+name);
    HelloResponse response = HelloResponse.newBuilder().setGreeting("Hello "+ name).build();
    
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    
  }

}
