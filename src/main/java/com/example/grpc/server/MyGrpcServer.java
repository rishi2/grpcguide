package com.example.grpc.server;

import java.io.IOException;
import java.util.logging.Logger;


import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MyGrpcServer {
  
  private static final Logger logger = Logger.getLogger(MyGrpcServer.class.getName());
  
  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50051;
    server = ServerBuilder.forPort(port)
        .addService(new GreetingServiceImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
    @Override
    public void run() {
      // Use stderr here since the logger may have been reset by its JVM shutdown hook.
      System.err.println("*** shutting down gRPC server since JVM is shutting down");
      MyGrpcServer.this.stop();
      System.err.println("*** server shut down");
    }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  
  
  public static void main (String [] args) throws IOException, InterruptedException{
      
    final MyGrpcServer server = new MyGrpcServer();
    server.start();
    server.blockUntilShutdown();
  }

}
