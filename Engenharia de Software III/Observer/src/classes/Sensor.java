package classes;

import java.util.Observable;

import interfaces.Observer;

// Sensor.java
@SuppressWarnings("deprecation")
public class Sensor implements Observer, java.util.Observer {
    @Override
    public void update(double umidade, boolean queimada) {
        medirUmidade(umidade);
    }

    private void medirUmidade(double umidade) {
        System.out.println("Sensor measured humidity: " + umidade + "%");
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
