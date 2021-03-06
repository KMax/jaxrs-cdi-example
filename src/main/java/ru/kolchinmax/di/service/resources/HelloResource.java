package ru.kolchinmax.di.service.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ru.kolchinmax.di.Injectee;

@Path("/")
public class HelloResource {

    @Inject
    Injectee injectee;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Injectee says: " + injectee.sayHi();
    }

}
