package MVC.codigo.controler;

import MVC.codigo.model.Batalha;
import MVC.codigo.model.Pokemon;

// public class Ember implements StrategyGolpes {
//     public int attack(){
//         return 40;
//     }
    
//     @Override
//     public int golpear(){
//         Ember ember = new Ember();
//         int dano = ember.attack();
//         return dano;
//     }
    

// }
public class GolpeA implements StrategyGolpes {
    @SuppressWarnings("unused")
    private Batalha batalha;
    private Pokemon pokemon;

    public GolpeA(Batalha batalha, Pokemon pokemon) {
        this.batalha = batalha;
        this.pokemon = pokemon;
    }

    @Override
    public void golpear() {
        System.out.println(pokemon.getNome() + " uses GolpeA!");

    }
}