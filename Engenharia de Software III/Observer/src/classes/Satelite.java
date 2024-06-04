package classes;

import java.util.Observable;

import interfaces.Observer;

@SuppressWarnings("deprecation")
public class Satelite implements Observer, java.util.Observer {
    @Override
    public void update(double umidade, boolean queimada) {
        medirQueimada(queimada);
    }

    private void medirQueimada(boolean queimada) {
        if (queimada) {
            System.out.println("Satellite detected fire!");
        } else {
            System.out.println("No fire detected by the satellite.");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
