import java.util.Date;

public class Clase17_10 {
    public static void main(String[] args) {

        Date comienzoDeCursada = new Date(2022,7,18);
        

        Date finDeCursada = new Date(2022,11,5);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri" , comienzoDeCursada, finDeCursada);


        Date fechaParcial = new Date (2022, 8, 29);

        Player lbicho = new Player("Elbicho", "DC");
        Player messichikito = new Player("Messichiki", "ED");

        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(lbicho);
        profesPoo.addPlayer(messichikito);
        Team estudiantesPoo = new Team("Estudiantes POO");

        Match primerParcial= new Match("Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo
        );




    }
}