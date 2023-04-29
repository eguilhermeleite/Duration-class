import java.time.Duration;

public class App {

    public static void main(String[] args) throws Exception {

        //Duration duracao = Duration.ofMinutes(123);
        Duration duracao = Duration.ofMinutes(113);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        
        String duracaoFormatada = String.format("%dh:%02dm", horas, minutos);
        System.out.println("Duration: " + duracaoFormatada);
      
    }
}
