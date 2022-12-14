package it.toth.exampleApi;

import beans.request.RequestExample;
import beans.response.ResponseExample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/example")
public class ExampleApi {

     @Path("apiV1")
     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public String v1() { return "v1";}

     @Path("apiV2")
     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public String v2() { return "v2";}


     @Path("exApi")
     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public ResponseExample exApi(RequestExample req) {
          ResponseExample res = new ResponseExample();
          res.setDbo(new Date());
          res.setName("PIPPO");
          res.setSurname("BAUDO");

          return res;
     }
}
