package com.sample.shinyay.rest.json;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by syanagih on 2016/12/31.
 */
public class NotFoundException extends WebApplicationException {

    public NotFoundException() {
        super(Response.status(Response.Status.NOT_FOUND).type(MediaType.TEXT_PLAIN_TYPE).build());
    }

    public NotFoundException(String message) {
        super(Response.status(Response.Status.NOT_FOUND).entity(message).type(MediaType.TEXT_PLAIN_TYPE).build());
    }

    public NotFoundException(JsonError jse) {
        super(Response.status(Response.Status.NOT_FOUND).entity(jse).type(MediaType.APPLICATION_JSON_TYPE).build());
    }
}
