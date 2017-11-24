package servicesGamle;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Karol on 16-Oct-2017 at 20:52:46.
 */
public class dummyclass {


  //  @Path("/message/")
  //  public class MessageService {

        private static ArrayList<String> messages = new ArrayList<String>(){{
            add("Hvor mange tenner har vanligvis et voksent menneske, hvis man regner med visdomstennene?");
            add("32*");
            add("31");
            add("28");
            add("29");
            add("Hva i kroppen produserer blodet?");
            add("Nyrene");
            add("Hjerte");
            add("Lymfesystemet");
            add("Beinmargen*");
            add("Hva er kroppens største organ?");
            add("Leveren");
            add("Hjertet");
            add("Huden*");
            add("Lymfesystemet");
            add("Hvilken planet er nærmest solen?");
            add("Saturn");
            add("Merkur*");
            add("Venus");
            add("Uranus");
            add("Hvilken stjerne er solens nærmeste nabo?");
            add("Alpha Cenntauri");
            add("Sirius (Hundestjernen)");
            add("Proxima Centauri*");
            add("Stella Polaris");
            add("Hvilket årstall kunne det første mennesket i verdenshistorien gå på månen?");
            add("1969*");
            add("1972");
            add("1958");
            add("1962");
            add("Hva kalles en stjerne som eksploderer?");
            add("Hvit dverg");
            add("Svart hull");
            add("Supernova*");
            add("Nøytronstjerne");
            add("Når brennstoffet i solens kjerne begynner å ta slutt, så vil den ta form som en:");
            add("En hvit kjempe");
            add("En rød dverg");
            add("En gul kjempe");
            add("En rød kjempe*");
            add("Hva er verdens største øy?");
            add("New Zealand");
            add("Storbritania");
            add("Grønland*");
            add("Island");
            add("Hvilket land har størst areal?");
            add("Russland*");
            add("Kina");
            add("USA");
            add("Canada");
            add("Hvem har laget maleriet Den atenske skolen?");
            add("Michelangelo");
            add("Platon");
            add("Rafael*");
            add("Leonardo da Vinci");
            add("Hvem har laget maleriet Nattevakten?");
            add("Rembrandt*");
            add("Picasso");
            add("Monet");
            add("Rafael");
            add("Hvem har laget maleriet Impresjon av soloppgang?");
            add("Monet*");
            add("Rembrandt");
            add("Van Gogh");
            add("Edvard Munch");
            add("Hvem har laget maleriet Jødebruden?");
            add("Francisco Goya");
            add("El Greco");
            add("Rafael");
            add("Rrembrandt*");
            add("Hva heter den hellige boken som ble gitt fra Gabriel til Mohammed?");
            add("Koranen*");
            add("Toraen");
            add("Guds bok");
            add("Guds hellige bok");
            add("Hva er japans nasjonalsport?");
            add("Aikido");
            add("Sumo-wrestling*");
            add("Judo");
            add("Ping-pong");
            add("Hvor mange minutter er det i en rugby kamp?");
            add("80 min*");
            add("45 min");
            add("90 min");
            add("60 min");
            add("I hvilken sport kan man vinne Davis Cup?");
            add("Golf");
            add("Triatlon");
            add("Svømming");
            add("Tennis*");
            add("Hvor mange poeng trenger man for å vinne i Krokket?");
            add("24");
            add("10");
            add("26*");
            add("32");
            add("Hvem vant den siste Copa America?");
            add("Brasil");
            add("Argentina");
            add("Chile*");
            add("Uruguay");
            add("Hvilken idrettsutøver var den første til å vinne frem Wimbeldon titler på rad?");
            add("Bjørn Borg*");
            add("Serena Williams");
            add("Roger Federer");
            add("Andre Agassi");
            add("Hva er den siste teksten i Bibelen?");
            add("Johannes' åpenbaring*");
            add("Salmenes bok");
            add("Evangeliet etter Markus");
            add("Apostlenes gjerninger");
            add("Hva er det man allitd har på høyre hånd når man går søndagstur?");
            add("Pulsklokke");
            add("Giftering");
            add("En vott");
            add("Fingre*");
            add("Hva slags duer er det som ikke kan fly?");
            add("Vinduer*");
            add("Lokkedue*");
            add("Turteldue*");
            add("Fredsdue");
            add("Når vegguret slår 13 slag, hva er da klokka?");
            add("13");
            add("Ett");
            add("Ingen. Den er elektrisk");
            add("Ødelagt*");


            add("Ta to epler fra tre epler. Hvor mange har du da?");
            add("5");
            add("3");
            add("1");
            add("2*");
            add("Noen måneder har 31 dager, noen har 30 dager, men hvor mange har 28 dager?");
            add("6");
            add("1");
            add("12*");
            add("2");
            add("Hvilket land har den 4.juli?");
            add("England");
            add("USA");
            add("Sør-Afrika");
            add("Alle land*");
            add("Del 30 med 1/2 og legg til 10. Hvilket tall får du?");
            add("25");
            add("70*");
            add("15");
            add("40");
            add("Hvor mange dyr av hver sort tok Moses med seg i arken?");
            add("4");
            add("2");
            add("100");
            add("0*");
            add("Hvis legen gav deg 3 tabletter med beskjed om å ta en hver halvtime, hvor lenge ville de vare?");
            add("3 timer");
            add("1 time*");
            add("1.5 timer");
            add("6 timer");
            add("Hvis du var alene i et hus hva ville du tent først?");
            add("En parafinlampe");
            add("Et stearinlys");
            add("En fyrstikk*");
            add("Peisen");
            add("Hva er π?");
            add("Forholdet mellom omkretsen og diameteren til en sirkel*");
            add("3.141592654*");
            add("3.141592645");
            add("Arealet av en sirkel delt med radiusen ganget med seg selv*");
            add("Hva er tyngst?");
            add("1 kilo fjær");
            add("1 kilo bly");
            add("1001 gram*");
            add("1 liter vann");
            add("Hvor mange fødselsdager har en mann i gjennomsnitt?");
            add("67");
            add("82");
            add("1*");
            add("45");
            add("Julie sin mor har fire barn. De heter April, Mai og Juni. Hva heter det fjerde?");
            add("Juli");
            add("August");
            add("Julie*");
            add("Augusta");
            add("Hvilket fjell i verden var det høyeste før Mount Everest ble oppdaget?");
            add("Mount Everest*");
            add("Mount Aconcagua");
            add("Mont Blanc");
            add("Mount McKinley");
            add("Et elektrisk tog kjører sørover med en fart på 51 km/t. Hvilken vei vil røyken bevege seg?");
            add("Nordover");
            add("Ingen*");
            add("Sørover");
            add("Bakover");
            add("Hvis du passerer en person som ligger på andre plass i et løp, hvilken plass er du da på?");
            add("1. plass");
            add("Delt 1.plass");
            add("2. plass*");
            add("3. plass");
            add("Guri er på sykkeltur. Etter 18 km har hun igjen en tredel av turen. Hvor lang er sykkelturen?");
            add("24");
            add("27*");
            add("54");
            add("9");
            add("Hva er størst volum?");
            add("0,5 liter");
            add("8 ml");
            add("0,6 dm³*");
            add("4 dl");
        }
        };


        //private static String message = "none";

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String getMessage() {
            return /*MessageService.*/messages.get(0) + "Hele listen: " + Arrays.toString(messages.toArray());
        }

        @POST
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        public void setMessage(String newMessage) {
            messages.add(newMessage);
        }
    }