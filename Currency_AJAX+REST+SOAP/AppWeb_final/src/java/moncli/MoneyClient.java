/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moncli;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:ConversionMoneda [myPath]<br>
 * USAGE:
 * <pre>
 *        MoneyClient client = new MoneyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author sdist
 */
public class MoneyClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/WebApplication_ClienteSoap/webresources";

    public MoneyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("myPath");
    }

    public String getHtml(@QueryParam("cant") String cant, @QueryParam("convert_to")String convert_to, @QueryParam("base")String base) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (cant != null) {
            resource = resource.queryParam("cant", cant);
        }
        if (convert_to != null) {
            resource = resource.queryParam("convert_to", convert_to);
        }
        if (base != null) {
            resource = resource.queryParam("base", base);
        }
        return resource.request(javax.ws.rs.core.MediaType.TEXT_HTML).get(String.class);
    }

    public void putHtml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.TEXT_HTML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.TEXT_HTML));
    }

    public void close() {
        client.close();
    }
    
}
