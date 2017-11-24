package servicesGamle;

import services.Player;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/player/")
public class PlayerServiceOld {
    private static String nickname = "none";
    private static int points = 0;
	private static Map<String, Player> players = new HashMap<>();


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getNickname() {
        return PlayerServiceOld.nickname;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void setNickname(String newNickname) {
        nickname = newNickname;
    }


    @GET
    @Path("/{playerNickname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@PathParam("playerNickname") String playerNickname) {
        return players.get(playerNickname);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Player> getPlayers() {
        return players.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPlayer(Player player) {
        players.put(player.getNickname(), player);
    }

    @DELETE
    @Path("/{playerNickname}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePlayer(@PathParam("playerNickname") String nickname){ players.remove(nickname);}

   @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePlayer(Player player){
       players.put(player.getNickname(), player);}
}