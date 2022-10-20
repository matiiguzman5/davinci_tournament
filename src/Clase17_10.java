import java.util.Date;

public class Clase17_10 {
    public static void main(String[] args) {

        Date comienzoDeCursada = new Date(2022,7,18);
        
        Date fechaParcial = new Date (2022, 8, 29);
        Date finDeCursada = new Date(2022,11,5);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri" , comienzoDeCursada, finDeCursada);

        Match primerParcial= new Match();
        primerParcial.setDate(fechaParcial);
        primerParcial.setLocation("Aula 116");
        primerParcial.setLocalGoalCounter(0);
        primerParcial.setVisitantGoalCounter(0);
    }
}