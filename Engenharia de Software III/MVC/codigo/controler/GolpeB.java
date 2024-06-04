package MVC.codigo.controler;

import MVC.codigo.model.Batalha;
import MVC.codigo.model.Pokemon;

// public class Scratch implements StrategyGolpes {
//     public int attack(){
//         return 40;
//     }
    
//     @Override
//     public int golpear(){
//         Scratch scratch = new Scratch();
//         int dano = scratch.attack();
//         return dano;
//     }
// }
    
public class GolpeB implements StrategyGolpes {
    @SuppressWarnings("unused")
    private Batalha batalha;
    private Pokemon pokemon;

    public GolpeB(Batalha batalha, Pokemon pokemon) {
        this.batalha = batalha;
        this.pokemon = pokemon;
    }

    @Override
    public void golpear() {
        System.out.println(pokemon.getNome() + " uses GolpeB!");

    }
}