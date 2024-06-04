package MVC.codigo.teste;
import MVC.codigo.controler.GolpeA;
import MVC.codigo.controler.GolpeB;
import MVC.codigo.controler.StrategyGolpes;
import MVC.codigo.model.Batalha;
import MVC.codigo.model.Pokemon;

public class Teste {
    public static <ObserverHP> void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 100);
        Batalha battle = new Batalha(pikachu, null, 100);

        StrategyGolpes golpeA = new GolpeA(battle, pikachu);
        StrategyGolpes golpeB = new GolpeB(battle, pikachu);

        pikachu.addGolpe(golpeA);
        pikachu.addGolpe(golpeB);

        ObserverHP observer = new ObserverHP(pikachu);
        pikachu.addObserver(observer);

        pikachu.decreaseHP(10);
        pikachu.golpear();
    }
}
