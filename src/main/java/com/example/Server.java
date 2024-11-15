package com.example;

import com.example.Endpoints.*;
import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {


        // Initilize endpoints!!
        ExampleEndpoint exampleEndpoint = new ExampleEndpoint() ;

        // Publish the enpoints!!
        Endpoint.publish("http://localhost:8080/Service", exampleEndpoint);


        System.out.println("Server up and run on : <http://localhost:8080/>");
    }
}