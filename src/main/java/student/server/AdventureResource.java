package student.server;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/")
public class AdventureResource {
    /**
     * The API endpoint to test connectivity.
     * @return the string "pong" if connection was successful
     */
    @GET
    @Path("ping")
    public String ping() {
        // TODO: This method should return `pong`.
        return "?";
    }

    /**
     * The API endpoint to handle a command issued to the game engine.
     * @param id the ID of the game instance currently being played
     * @param command the command issued by the client
     * @return the result of the issued command
     */
    @POST
    @Path("instance/{id: \\d+}/command")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CommandResult handleCommand(@PathParam("id") int id, Command command) {

        return null;
    }
}
