import java.util.Date;

public class Clase17_10 {
    public static void main(String[] args) {

        Date comienzoDeCursada = new Date(2022,7,18);
        

        Date finDeCursada = new Date(2022,11,5);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri" , comienzoDeCursada, finDeCursada);


        Date fechaParcial = new Date (2022, 8, 29);

        Player lbicho = new Player("Elbicho", "DC");
        Player messichikito = new Player("Messichiki", "ED");
        Player luchox = new Player("Luchox" , "GP");
        Player matix = new Player("Matiz" , "DC");
        Player nicox = new Player("Nicox" , "MCD");
        Player pepe = new Player("pepe" , "DC");
        Player popo = new Player("popo" , "GP");
        Player pupu = new Player("pupu" , "ED");
        Player papa = new Player("papa" , "MCI");
        Player pipi = new Player("pipi" , "MC");

        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(lbicho);
        profesPoo.addPlayer(messichikito);
        profesPoo.addPlayer(luchox);
        profesPoo.addPlayer(matix);
        profesPoo.addPlayer(nicox);

        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(pepe);
        estudiantesPoo.addPlayer(popo);
        estudiantesPoo.addPlayer(pupu);
        estudiantesPoo.addPlayer(papa);
        estudiantesPoo.addPlayer(pipi);


        Match primerParcial= new Match("Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo
        );

        System.out.println(primerParcial.generateMarker());
        primerParcial.makeGoal(profesPoo, profesPoo.getPlayers().get(0) );
        System.out.println(primerParcial.generateMarker());
    }
}