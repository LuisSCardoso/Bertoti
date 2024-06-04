import java.util.Observer;
import classes.Satelite;
import classes.Sensor;
import interfaces.Monitoramento;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        Monitoramento monitoramento = new Monitoramento();

        Observer satelite = new Satelite();
        Observer sensor = new Sensor();

        monitoramento.addObserver((interfaces.Observer) satelite);
        monitoramento.addObserver((interfaces.Observer) sensor);

        // Simulate a change in conditions
        monitoramento.setMedida(30.5, true);
        monitoramento.setMedida(55.0, false);
    }
}