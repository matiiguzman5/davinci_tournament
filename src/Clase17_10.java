import java.util.Date;

public class Clase17_10 {
    public static void main(String[] args) {

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri");
        torneoDaVinci.setName("Torneo 2022, 2do cuatri");
        Date comienzoDeCursada = new Date(2022/7/18);
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);
        torneoDaVinci.setStartDate(comienzoDeCursada);

        Date finDeCursada = new Date(2022/11/5);
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);
        torneoDaVinci.setEndDate(finDeCursada);
    }
    Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri" , 2022/7/18);
}