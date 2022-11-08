package miage.ressource;

import miage.dto.OrderDTO;
import miage.service.OrderService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("order")
public class OrderRessource {

    @Inject
    OrderService orderService;

    @POST
    public Response createNewOrder() {
        OrderDTO orderDTO = orderService.createNewOrder();
        return Response.created(URI.create("/order/" + orderDTO.getId())).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{orderId}")
    public Response getOrder(@PathParam("orderId") int orderId) {
        return Response.ok(orderService.getOrder(orderId)).build();
    }

}
