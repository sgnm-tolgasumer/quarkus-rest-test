package org.acme.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.jboss.resteasy.util.PortProvider;

@Path("/")
public class HostnameResource {

    @GET
    public String printHostname() {
        return PortProvider.getHost();
    }

}
