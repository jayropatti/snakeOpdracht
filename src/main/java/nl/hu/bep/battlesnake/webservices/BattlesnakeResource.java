package nl.hu.bep.battlesnake.webservices;

import nl.hu.bep.battlesnake.model.GameInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

class MoveRespone{
    public String move;
    public String shout;
}

@Path("/snake")
public class BattlesnakeResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInfo(){
        GameInfo information = new GameInfo();
        information.setAuthor(information.author); //verzend Strings v GameInfo (door bv. author, color toe te voegen) aan information als json data
        information.setColor(information.color);
        information.setHead(information.head);
        information.setTail(information.tail);
        information.setVersion(information.version);
        information.setApiverion(information.apiversion);
        return Response.ok(information).build();
    }

    @POST
    @Path("/start")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response startGame(){

        return Response.ok().build();
    }

    @POST
    @Path("/move")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response moveGame(){
        MoveRespone move = new MoveRespone();
        move.move = "up";
        move.shout = "Going up!";

        return Response.ok(move).build();
    }

    @POST
    @Path("/end")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response endGame(){

        return Response.ok().build();
    }
}
