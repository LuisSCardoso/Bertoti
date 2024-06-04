package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monitoramento {
    private double umidade;
    private boolean queimada;
    private List<Observer> observers;

    public Monitoramento() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer satelite) {
        observers.add(satelite);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(umidade, queimada);
        }
    }

    public void setMedida(double umidade, boolean queimada) {
        this.umidade = umidade;
        this.queimada = queimada;
        notifyObservers();
    }

    public double getUmidade() {
        return umidade;
    }

    public boolean isQueimada() {
        return queimada;
    }
}
 