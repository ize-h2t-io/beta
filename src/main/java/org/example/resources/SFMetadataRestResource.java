
package org.example.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/sf-api")
public class SFMetadataRestResource {

    @GET
    @Path("/simple")
    @Produces("text/plain")
//    @Consumes("application/json")
    public String simple() throws Exception {
        System.out.println("simple output");        
        return "simple return";
    }


    @POST
    @Path("/login")
    @Consumes("application/x-www-form-urlencoded")
    public void post(MultivaluedMap<String, String> formParams) throws Exception {
        System.out.println("key-value pairs: " + formParams);
        // Store the message
    }


/*
    @POST
    @Path("/login")
    @Produces("application/json")
    public String simple() throws Exception {

        URLConnection connection = new URL(url).openConnection();
        connection.setDoOutput(true); // Triggers POST.
        connection.setRequestProperty("Accept-Charset", charset);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

        try (OutputStream output = connection.getOutputStream()) {
            output.write(query.getBytes(charset));
        }

        InputStream response = connection.getInputStream();


        System.out.println("response (debug): " + response);
        return "response (return): " + response;
    }
*/
    
}
