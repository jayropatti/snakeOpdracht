package nl.hu.bep.setup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("restservices")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RolesAllowedDynamicFeature.class);
        // geef aan in welke package gekeken moet worden om site te laten registreren
        packages("nl.hu.battlesnake.webservices");

    }
}
