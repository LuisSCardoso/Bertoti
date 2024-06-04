package MVC.codigo.model;
import java.util.ArrayList;
import java.util.List;

import MVC.codigo.controler.StrategyGolpes;
import MVC.codigo.view.ObserverHP;

public class Pokemon implements Subject {
    private String nome;
    private int HP;
    private List<StrategyGolpes> golpes;
    private List<ObserverHP> observers;

    public Pokemon(String nome, String tipo, int HP) {
        this.nome = nome;
        this.HP = HP;
        this.golpes = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getHP() {
        return HP;
    }

    public void addGolpe(StrategyGolpes golpe) {
        golpes.add(golpe);
    }

    public void removeGolpe(StrategyGolpes golpe) {
        golpes.remove(golpe);
    }

    public void golpear() {
        for (StrategyGolpes golpe : golpes) {
            golpe.golpear();
        }
    }

    @Override
    public void decreaseHP(int amount) {
        this.HP -= amount;
        notifyObservers();
    }

    @Override
    public void gainHP(int amount) {
        this.HP += amount;
        notifyObservers();
    }

    public void addObserver(ObserverHP observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverHP observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (ObserverHP observer : observers) {
            observer.update(golpes);
        }
    }

    @SuppressWarnings("hiding")
    public <ObserverHP> void addObserver(ObserverHP observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }
}