package com.example.grpc.server.area;

import com.example.server.area.AreaFor;
import com.example.server.area.AreaRequest;
import com.example.server.area.AreaResponse;
import com.example.server.area.AreaServiceGrpc.AreaServiceImplBase;

import io.grpc.stub.StreamObserver;

public class AreaServiceImpl extends AreaServiceImplBase{
  
  @Override
  public void getArea(AreaRequest request, StreamObserver<AreaResponse> responseObserver){
    
    double length = request.getLength();
    double weigth = request.getWidth();
    double radius = request.getRadius();
    
    AreaFor areaFor = request.getAreafor();
    
    if (areaFor.equals(AreaFor.CIRCLE)) {
      double area = 3.14 * radius * radius;
      AreaResponse response = AreaResponse.newBuilder().setArea(area).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
      
    }
    
    if(areaFor.equals(AreaFor.RECTANGLE)) {
      double area = length * weigth;
      AreaResponse response = AreaResponse.newBuilder().setArea(area).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
      
    }
    
    if(areaFor.equals(AreaFor.SQUARE)) {
      
      double area = length * length;
      AreaResponse response = AreaResponse.newBuilder().setArea(area).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
      
    }
    
    
    
  }

}
