package com.example.Endpoints;

import com.example.Schemas.*;
import com.example.Services.*;

import jakarta.jws.*;

@WebService
public class ExampleEndpoint {
  @WebMethod
  public Response ExampleServicee(@WebParam(name = "Request") Request request){
    Response response = new Response();
    @SuppressWarnings("unused")
    ExampleService Service = new ExampleService();
    // Call Some Service Methods here!!

    return response;
  }
  
}
