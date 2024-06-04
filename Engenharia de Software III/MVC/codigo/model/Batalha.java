package MVC.codigo.model;

import MVC.codigo.controler.StrategyGolpes;

public class Batalha {
    @SuppressWarnings("unused")
    private Pokemon pokemon;
    @SuppressWarnings("unused")
    private StrategyGolpes golpe;
    @SuppressWarnings("unused")
    private int HP;

    public Batalha(Pokemon pokemon, StrategyGolpes golpe, int HP) {
        this.pokemon = pokemon;
        this.golpe = golpe;
        this.HP = HP;
    }

    public void effect() {

    }

    public void damage() {

    }

    public void accuracy() {

    }

    public void update() {

    }
}
