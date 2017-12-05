# grpcguide


1. Build service :
`mvn clean package`

2. Up CalculateArea Service server

mvn install exec:java -Dexec.mainClass=com.example.grpc.server.area.MyGrpcServer

After successful server up following message should come :

`INFO: Server started, listening on 50051`

3. Now execute, Client class for calculateArea from grpcguideclient repo

