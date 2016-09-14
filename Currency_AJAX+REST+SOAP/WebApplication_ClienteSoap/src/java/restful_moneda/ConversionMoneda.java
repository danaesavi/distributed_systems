/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restful_moneda;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author sdist
 */
@Path("myPath")
public class ConversionMoneda {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConversionMoneda
     */
    public ConversionMoneda() {
    }

    /**
     * Retrieves representation of an instance of restful_moneda.ConversionMoneda
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml(@QueryParam("cant") double cant, @QueryParam("base") String base,
            @QueryParam("convert_to") String convert_to ) {
       return Double.toString(conversion(base, convert_to, cant));    
    }

    /**
     * PUT method for updating or creating an instance of ConversionMoneda
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }

    private static double conversion(java.lang.String base, java.lang.String convertTo, double cant) {
        monedacliente.NewWebServiceM_Service service = new monedacliente.NewWebServiceM_Service();
        monedacliente.NewWebServiceM port = service.getNewWebServiceMPort();
        return port.conversion(base, convertTo, cant);
    }
}
