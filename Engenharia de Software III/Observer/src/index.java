import classes.Monitoramento;
import classes.User;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Monitoramento monitoramento = new Monitoramento();

        User user1 = new User("Sensor");
        User user2 = new User("Satelite");


        monitoramento.registerObserver(user1);
        monitoramento.registerObserver(user2);


        monitoramento.sendMessage("");

        monitoramento.removeObserver(user2);

        monitoramento.sendMessage("Luciano saiu da sala.");
    }
}