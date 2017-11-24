package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karol on 21-Nov-2017 at 09:13:44.
 */
@Path("/quizes/")
public class QuizService {
    private static Map<String, Quiz> quizes = new HashMap<String, Quiz>();
    private static Map<String, Player> players = new HashMap<String, Player>();
    private static Map<String, Question> questions = new HashMap<String, Question>();

    static {
        Quiz quiz1 = new Quiz();
        quiz1.setName("The Quiz");
        quiz1.setStartTime("12:15 PM");
        quiz1.setNumOfQuestion(30);
        quiz1.setKey(130);
        quizes.put(quiz1.getName(), quiz1);

        Quiz quiz2 = new Quiz();
        quiz2.setName("The Quiz 2");
        quiz2.setStartTime("10:39 PM");
        quiz2.setNumOfQuestion(20);
        quiz2.setKey(220);
        quizes.put(quiz2.getName(), quiz2);

        for (int i = 0; i < 10; i++) {
            Player player = new Player();
            player.setNickname("The Player " + (i + 1));
            player.setPoints((i + 1) * 11);
            players.put(player.getNickname(), player);
        }
    }

    /*
    * Player service
    */
    @GET
    @Path("/player/{playerNickname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@PathParam("playerNickname") String playerNickname){
        return players.get(playerNickname);
    }

    @GET
    @Path("/player")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Player> getPlayer() {
        return players.values();
    }

    @POST
    @Path("/player")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPlayer(Player player) {
        players.put(player.getNickname(), player);
    }

    @PUT
    @Path("/player")
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePlayer(Player player){
        players.put(player.getNickname(), player);}

    /*
    * Quiz service
    */
    @GET
    @Path("/quizes/{quizName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Quiz getQuiz(@PathParam("quizName") String quizName) {
        return quizes.get(quizName);
    }

    @GET
    @Path("/quizes")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Quiz> getQuizes() {
        return quizes.values();
    }

    @POST
    @Path("/quizes")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addQuiz(Quiz quiz) {
        quizes.put(quiz.getName(), quiz);
    }


    /*
    * Question service
    */
    @GET
    @Path("/question/{questionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Question getQuestion(@PathParam("questionId") String questionId) {
        return questions.get(questionId);
    }

    @GET
    @Path("/question")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Question> getQuestions() {
        return questions.values();
    }

    @POST
    @Path("/question")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addQuestion(Question question) {
        questions.put(question.getId(), question);
    }

    static {
        Question question1 = new Question();
        question1.setId("1");
        question1.setQuestion("Hvor mange tenner har vanligvis et voksent menneske, hvis man regner med visdomstennene?");
        question1.setAnswerA("32");
        question1.setAnswerB("31");
        question1.setAnswerC("28");
        question1.setAnswerD("29");
        question1.setCorrectAnswer("A");
        questions.put(question1.getId(), question1);

        Question question2 = new Question();
        question2.setId("2");
        question2.setQuestion("Hva i kroppen produserer blodet?");
        question2.setAnswerA("Nyrene");
        question2.setAnswerB("Hjerte");
        question2.setAnswerC("Lymfesystemet");
        question2.setAnswerD("Beinmargen");
        question2.setCorrectAnswer("D");
        questions.put(question2.getId(), question2);

        Question question3 = new Question();
        question3.setId("3");
        question3.setQuestion("Hva er kroppens største organ?");
        question3.setAnswerA("Leveren");
        question3.setAnswerB("Hjertet");
        question3.setAnswerC("Huden");
        question3.setAnswerD("Lymfesystemet");
        question3.setCorrectAnswer("C");
        questions.put(question3.getId(), question3);

        Question question4 = new Question();
        question4.setId("4");
        question4.setQuestion("Hvilken planet er nærmest solen?");
        question4.setAnswerA("Saturn");
        question4.setAnswerB("Merkur");
        question4.setAnswerC("Venus");
        question4.setAnswerD("Uranus");
        question4.setCorrectAnswer("B");
        questions.put(question4.getId(), question4);

        Question question5 = new Question();
        question5.setId("5");
        question5.setQuestion("Hvilken stjerne er solens nærmeste nabo?");
        question5.setAnswerA("Alpha Cenntauri");
        question5.setAnswerB("Sirius (Hundestjernen)");
        question5.setAnswerC("Proxima Centauri");
        question5.setAnswerD("Stella Polaris");
        question5.setCorrectAnswer("C");
        questions.put(question5.getId(), question5);

        Question question6 = new Question();
        question6.setId("6");
        question6.setQuestion("Hvilket årstall kunne det første mennesket i verdenshistorien gå på månen?");
        question6.setAnswerA("1969");
        question6.setAnswerB("1972");
        question6.setAnswerC("1958");
        question6.setAnswerD("1962");
        question6.setCorrectAnswer("A");
        questions.put(question6.getId(), question6);

        Question question7 = new Question();
        question7.setId("7");
        question7.setQuestion("Hva kalles en stjerne som eksploderer?");
        question7.setAnswerA("Hvit dverg");
        question7.setAnswerB("Svart hull");
        question7.setAnswerC("Supernova");
        question7.setAnswerD("Nøytronstjerne");
        question7.setCorrectAnswer("C");
        questions.put(question7.getId(), question7);

        Question question8 = new Question();
        question8.setId("8");
        question8.setQuestion("Når brennstoffet i solens kjerne begynner å ta slutt, så vil den ta form som en:");
        question8.setAnswerA("En hvit kjempe");
        question8.setAnswerB("En rød dverg");
        question8.setAnswerC("En gul kjempe");
        question8.setAnswerD("En rød kjempe");
        question8.setCorrectAnswer("D");
        questions.put(question8.getId(), question8);

        Question question9 = new Question();
        question9.setId("9");
        question9.setQuestion("Hva er verdens største øy?");
        question9.setAnswerA("New Zealand");
        question9.setAnswerB("Storbritania");
        question9.setAnswerC("Grønland");
        question9.setAnswerD("Island");
        question9.setCorrectAnswer("C");
        questions.put(question9.getId(), question9);

        Question question10 = new Question();
        question10.setId("10");
        question10.setQuestion("Hvilket land har størst areal?");
        question10.setAnswerA("Russland");
        question10.setAnswerB("Kina");
        question10.setAnswerC("USA");
        question10.setAnswerD("Canada");
        question10.setCorrectAnswer("A");
        questions.put(question10.getId(), question10);

        Question question11 = new Question();
        question11.setId("11");
        question11.setQuestion("Hvem har laget maleriet Den atenske skolen?");
        question11.setAnswerA("Michelangelo");
        question11.setAnswerB("Platon");
        question11.setAnswerC("Rafael");
        question11.setAnswerD("Leonardo da Vinci");
        question11.setCorrectAnswer("C");
        question11.setFile("media/denAtenskeSkolen.jpg");
        questions.put(question11.getId(), question11);

        Question question12 = new Question();
        question12.setId("12");
        question12.setQuestion("Hvem har laget maleriet Nattevakten?");
        question12.setAnswerA("Rembrandt");
        question12.setAnswerB("Picasso");
        question12.setAnswerC("Monet");
        question12.setAnswerD("Rafael");
        question12.setCorrectAnswer("A");
        question12.setFile("media/nattevakten.jpeg");
        questions.put(question12.getId(), question12);

        Question question13 = new Question();
        question13.setId("13");
        question13.setQuestion("Hva er navnet på maleriet?");
        question13.setAnswerA("Veien til paradis");
        question13.setAnswerB("Vannliljer");
        question13.setAnswerC("Broen");
        question13.setAnswerD("Den grønne bro");
        question13.setCorrectAnswer("B");
        question13.setFile("media/vannliljer.jpeg");
        questions.put(question13.getId(), question13);

        Question question14 = new Question();
        question14.setId("14");
        question14.setQuestion("Hvem har laget maleriet Impresjon av soloppgang?");
        question14.setAnswerA("Monet");
        question14.setAnswerB("Rembrandt");
        question14.setAnswerC("Van Gogh");
        question14.setAnswerD("Edvard Munch");
        question14.setCorrectAnswer("A");
        question14.setFile("media/impresjonAvSoloppgang.jpeg");
        questions.put(question14.getId(), question14);

        Question question15 = new Question();
        question15.setId("15");
        question15.setQuestion("Hvem har laget maleriet Jødebruden?");
        question15.setAnswerA("Francisco Goya");
        question15.setAnswerB("El Greco");
        question15.setAnswerC("Rafael");
        question15.setAnswerD("Rrembrandt");
        question15.setCorrectAnswer("D");
        question15.setFile("media/jødebruden.jpeg");
        questions.put(question15.getId(), question15);

        Question question16 = new Question();
        question16.setId("16");
        question16.setQuestion("Hvilket land tilhører dette flagget?");
        question16.setAnswerA("Jordan");
        question16.setAnswerB("Cookøyene");
        question16.setAnswerC("Komorene");
        question16.setAnswerD("Etiopia");
        question16.setCorrectAnswer("C");
        question16.setFile("media/komorene.png");
        questions.put(question16.getId(), question16);

        Question question17 = new Question();
        question17.setId("17");
        question17.setQuestion("Hvilket land tilhører dette flagget?");
        question17.setAnswerA("Luxembourg");
        question17.setAnswerB("Malta");
        question17.setAnswerC("Taiwan");
        question17.setAnswerD("Indonesia");
        question17.setCorrectAnswer("B");
        question17.setFile("media/malta.png");
        questions.put(question17.getId(), question17);

        Question question18 = new Question();
        question18.setId("18");
        question18.setQuestion("Hvilket land tilhører dette flagget?");
        question18.setAnswerA("Salomonøyene");
        question18.setAnswerB("Syria");
        question18.setAnswerC("Samoa");
        question18.setAnswerD("Kosovo");
        question18.setCorrectAnswer("D");
        question18.setFile("media/kosovo.png");
        questions.put(question18.getId(), question18);

        Question question19 = new Question();
        question19.setId("19");
        question19.setQuestion("Hvilket land tilhører dette flagget?");
        question19.setAnswerA("Saint Lucia");
        question19.setAnswerB("Somalia");
        question19.setAnswerC("Palau");
        question19.setAnswerD("Sierra Leone");
        question19.setCorrectAnswer("A");
        question19.setFile("media/saintLucia.png");
        questions.put(question19.getId(), question19);

        Question question20 = new Question();
        question20.setId("20");
        question20.setQuestion("Hva heter den hellige boken som ble gitt fra Gabriel til Mohammed?");
        question20.setAnswerA("Koranen");
        question20.setAnswerB("Toraen");
        question20.setAnswerC("Guds bok");
        question20.setAnswerD("Guds hellige bok");
        question20.setCorrectAnswer("A");
        questions.put(question20.getId(), question20);

        Question question21 = new Question();
        question21.setId("21");
        question21.setQuestion("Hva er japans nasjonalsport?");
        question21.setAnswerA("Aikido");
        question21.setAnswerB("Sumo-wrestling");
        question21.setAnswerC("Judo");
        question21.setAnswerD("Ping-pong");
        question21.setCorrectAnswer("B");
        questions.put(question21.getId(), question21);

        Question question22 = new Question();
        question22.setId("22");
        question22.setQuestion("Hvor mange minutter er det i en rugby kamp?");
        question22.setAnswerA("80 min");
        question22.setAnswerB("45 min");
        question22.setAnswerC("90 min");
        question22.setAnswerD("60 min");
        question22.setCorrectAnswer("A");
        questions.put(question22.getId(), question22);

        Question question23 = new Question();
        question23.setId("23");
        question23.setQuestion("I hvilken sport kan man vinne Davis Cup?");
        question23.setAnswerA("Golf");
        question23.setAnswerB("Triatlon");
        question23.setAnswerC("Svømming");
        question23.setAnswerD("Tennis");
        question23.setCorrectAnswer("D");
        questions.put(question23.getId(), question23);

        Question question24 = new Question();
        question24.setId("24");
        question24.setQuestion("Hvor mange poeng trenger man for å vinne i Krokket?");
        question24.setAnswerA("24");
        question24.setAnswerB("10");
        question24.setAnswerC("26");
        question24.setAnswerD("32");
        question24.setCorrectAnswer("C");
        questions.put(question24.getId(), question24);

        Question question25 = new Question();
        question25.setId("25");
        question25.setQuestion("Hvem vant den siste Copa America?");
        question25.setAnswerA("Brasil");
        question25.setAnswerB("Argentina");
        question25.setAnswerC("Chile");
        question25.setAnswerD("Uruguay");
        question25.setCorrectAnswer("C");
        questions.put(question25.getId(), question25);

        Question question26 = new Question();
        question26.setId("26");
        question26.setQuestion("Hvilken idrettsutøver var den første til å vinne fem Wimbeldon titler på rad?");
        question26.setAnswerA("Bjørn Borg");
        question26.setAnswerB("Serena Williams");
        question26.setAnswerC("Roger Federer");
        question26.setAnswerD("Andre Agassi");
        question26.setCorrectAnswer("A");
        questions.put(question26.getId(), question26);

        Question question27 = new Question();
        question27.setId("27");
        question27.setQuestion("Hva er den siste teksten i Bibelen?");
        question27.setAnswerA("Johannes' åpenbaring");
        question27.setAnswerB("Salmenes bok");
        question27.setAnswerC("Evangeliet etter Markus");
        question27.setAnswerD("Apostlenes gjerninger");
        question27.setCorrectAnswer("A");
        questions.put(question27.getId(), question27);

        Question question28 = new Question();
        question28.setId("28");
        question28.setQuestion("Hva er det man allitd har på høyre hånd når man går søndagstur?");
        question28.setAnswerA("Pulsklokke");
        question28.setAnswerB("Giftering");
        question28.setAnswerC("En vott");
        question28.setAnswerD("Fingre");
        question28.setCorrectAnswer("D");
        questions.put(question28.getId(), question28);

        Question question29 = new Question();
        question29.setId("29");
        question29.setQuestion("Hva slags duer er det som ikke kan fly?");
        question29.setAnswerA("Vinduer");
        question29.setAnswerB("Lokkedue");
        question29.setAnswerC("Turteldue");
        question29.setAnswerD("Fredsdue");
        question29.setCorrectAnswer("ABC");
        questions.put(question29.getId(), question29);

        Question question30 = new Question();
        question30.setId("30");
        question30.setQuestion("Når vegguret slår 13 slag, hva er da klokka?");
        question30.setAnswerA("13");
        question30.setAnswerB("Ett");
        question30.setAnswerC("Ingen. Den er elektrisk");
        question30.setAnswerD("Ødelagt");
        question30.setCorrectAnswer("D");
        questions.put(question30.getId(), question30);

        Question question31 = new Question();
        question31.setId("31");
        question31.setQuestion("Ta to epler fra tre epler. Hvor mange har du da?");
        question31.setAnswerA("5");
        question31.setAnswerB("3");
        question31.setAnswerC("1");
        question31.setAnswerD("2");
        question31.setCorrectAnswer("D");
        questions.put(question31.getId(), question31);

        Question question32 = new Question();
        question32.setId("32");
        question32.setQuestion("Noen måneder har 31 dager, noen har 30 dager, men hvor mange har 28 dager?");
        question32.setAnswerA("6");
        question32.setAnswerB("1");
        question32.setAnswerC("12");
        question32.setAnswerD("2");
        question32.setCorrectAnswer("C");
        questions.put(question32.getId(), question32);

        Question question33 = new Question();
        question33.setId("33");
        question33.setQuestion("Hvilket land har den 4.juli?");
        question33.setAnswerA("England");
        question33.setAnswerB("USA");
        question33.setAnswerC("Sør-Afrika");
        question33.setAnswerD("Alle land");
        question33.setCorrectAnswer("D");
        questions.put(question33.getId(), question33);

        Question question34 = new Question();
        question34.setId("34");
        question34.setQuestion("Del 30 med 1/2 og legg til 10. Hvilket tall får du?");
        question34.setAnswerA("25");
        question34.setAnswerB("70");
        question34.setAnswerC("15");
        question34.setAnswerD("40");
        question34.setCorrectAnswer("B");
        questions.put(question34.getId(), question34);

        Question question35 = new Question();
        question35.setId("35");
        question35.setQuestion("Hvilken figur hører ikke sammen med de andre?");
        question35.setAnswerA("A og E");
        question35.setAnswerB("Alle untatt F");
        question35.setAnswerC("C");
        question35.setAnswerD("D");
        question35.setCorrectAnswer("C");
        question35.setFile("media/hvilkenFigurHørerIkkeSammenMedDeAndre.jpeg");
        questions.put(question35.getId(), question35);

        Question question36 = new Question();
        question36.setId("36");
        question36.setQuestion("Hvor mange dyr av hver sort tok Moses med seg i arken?");
        question36.setAnswerA("4");
        question36.setAnswerB("2");
        question36.setAnswerC("100");
        question36.setAnswerD("0");
        question36.setCorrectAnswer("D");
        questions.put(question36.getId(), question36);

        Question question37 = new Question();
        question37.setId("37");
        question37.setQuestion("Hvis legen gav deg 3 tabletter med beskjed om å ta en hver halvtime, hvor lenge ville de vare?");
        question37.setAnswerA("3 timer");
        question37.setAnswerB("1 time");
        question37.setAnswerC("1.5 timer");
        question37.setAnswerD("6 timer");
        question37.setCorrectAnswer("B");
        questions.put(question37.getId(), question37);

        Question question38 = new Question();
        question38.setId("38");
        question38.setQuestion("Hvis du var alene i et hus hva ville du tent først?");
        question38.setAnswerA("En parafinlampe");
        question38.setAnswerB("Et stearinlys");
        question38.setAnswerC("En fyrstikk");
        question38.setAnswerD("Peisen");
        question38.setCorrectAnswer("C");
        questions.put(question38.getId(), question38);

        Question question39 = new Question();
        question39.setId("39");
        question39.setQuestion("Hva er π?");
        question39.setAnswerA("Forholdet mellom omkretsen og diameteren til en sirkel");
        question39.setAnswerB("3.141592654");
        question39.setAnswerC("3.141592645");
        question39.setAnswerD("Arealet av en sirkel delt med radiusen ganget med seg selv");
        question39.setCorrectAnswer("ABD");
        questions.put(question39.getId(), question39);

        Question question40 = new Question();
        question40.setId("40");
        question40.setQuestion("Hvilken figur blir den neste i rekken?");
        question40.setAnswerA("C");
        question40.setAnswerB("A og E");
        question40.setAnswerC("B");
        question40.setAnswerD("D");
        question40.setCorrectAnswer("A");
        question40.setFile("media/hvilkenFigurBlirDenNesteIRekken.png");
        questions.put(question40.getId(), question40);

        Question question41 = new Question();
        question41.setId("41");
        question41.setQuestion("Hva er tyngst?");
        question41.setAnswerA("1 kilo fjær");
        question41.setAnswerB("1 kilo bly");
        question41.setAnswerC("1001 gram");
        question41.setAnswerD("1 liter vann");
        question41.setCorrectAnswer("C");
        questions.put(question41.getId(), question41);

        Question question42 = new Question();
        question42.setId("42");
        question42.setQuestion("Hvor mange fødselsdager har en mann i gjennomsnitt?");
        question42.setAnswerA("67");
        question42.setAnswerB("82");
        question42.setAnswerC("1");
        question42.setAnswerD("45");
        question42.setCorrectAnswer("C");
        questions.put(question42.getId(), question42);

        Question question43 = new Question();
        question43.setId("43");
        question43.setQuestion("Hvilket land tilhører dette flagget?");
        question43.setAnswerA("Italia");
        question43.setAnswerB("Tyskland");
        question43.setAnswerC("Irland");
        question43.setAnswerD("Frankrike");
        question43.setCorrectAnswer("C");
        question43.setFile("media/irland.png");
        questions.put(question43.getId(), question43);

        Question question44 = new Question();
        question44.setId("44");
        question44.setQuestion("Julie sin mor har fire barn. De heter April, Mai og Juni. Hva heter det fjerde?");
        question44.setAnswerA("Juli");
        question44.setAnswerB("August");
        question44.setAnswerC("Julie");
        question44.setAnswerD("Augusta");
        question44.setCorrectAnswer("C");
        questions.put(question44.getId(), question44);

        Question question45 = new Question();
        question45.setId("45");
        question45.setQuestion("Hvilket fjell i verden var det høyeste før Mount Everest ble oppdaget?");
        question45.setAnswerA("Mount Everest");
        question45.setAnswerB("Mount Aconcagua");
        question45.setAnswerC("Mont Blanc");
        question45.setAnswerD("Mount McKinley");
        question45.setCorrectAnswer("A");
        questions.put(question45.getId(), question45);

        Question question46 = new Question();
        question46.setId("46");
        question46.setQuestion("Hvilken figur blir den neste i rekken?");
        question46.setAnswerA("A eller E");
        question46.setAnswerB("C");
        question46.setAnswerC("D");
        question46.setAnswerD("B");
        question46.setCorrectAnswer("D");
        question46.setFile("media/hvilkenFigurBlirDenNesteIRekken2.png");
        questions.put(question46.getId(), question46);

        Question question47 = new Question();
        question47.setId("47");
        question47.setQuestion("Et elektrisk tog kjører sørover med en fart på 51 km/t. Hvilken vei vil røyken bevege seg?");
        question47.setAnswerA("Nordover");
        question47.setAnswerB("Ingen");
        question47.setAnswerC("Sørover");
        question47.setAnswerD("Bakover");
        question47.setCorrectAnswer("B");
        questions.put(question47.getId(), question47);

        Question question48 = new Question();
        question48.setId("48");
        question48.setQuestion("Hvis du passerer en person som ligger på andre plass i et løp, hvilken plass er du da på?");
        question48.setAnswerA("1. plass");
        question48.setAnswerB("Delt 1.plass");
        question48.setAnswerC("2. plass");
        question48.setAnswerD("3. plass");
        question48.setCorrectAnswer("C");
        questions.put(question48.getId(), question48);

        Question question49 = new Question();
        question49.setId("49");
        question49.setQuestion("Guri er på sykkeltur. Etter 18 km har hun igjen en tredel av turen. Hvor lang er sykkelturen?");
        question49.setAnswerA("24");
        question49.setAnswerB("27");
        question49.setAnswerC("54");
        question49.setAnswerD("9");
        question49.setCorrectAnswer("B");
        questions.put(question49.getId(), question49);

        Question question50 = new Question();
        question50.setId("50");
        question50.setQuestion("Hva er størst volum?");
        question50.setAnswerA("0,5 liter");
        question50.setAnswerB("8 ml");
        question50.setAnswerC("0,6 dm³");
        question50.setAnswerD("4 dl");
        question50.setCorrectAnswer("C");
        questions.put(question50.getId(), question50);
    }
}