import classes.composite.Categoria;
import classes.leaf.Item;
import interfaces.ItemMenu;

/**
 * index
 */
public class index {

    private static void displayMenuItems(ItemMenu menuItem) {
        if (menuItem instanceof Categoria) {
            Categoria category = (Categoria) menuItem;
            category.displayCategoryItems();
            for (ItemMenu item : category.items) {
                displayMenuItems(item);
            }
        }
    }

    public static void main(String[] args) {

        Categoria pratosPrincipais = new Categoria("Pratos Principais");
        Categoria sobremesas = new Categoria("Sobremesas");
        Categoria bebidas = new Categoria("Bebidas");

        pratosPrincipais.addMenuItem(new Item("Churrasco",0.00));
        pratosPrincipais.addMenuItem(new Item("Lasanha",0.00));

        bebidas.addMenuItem(new Item("Água",0.00));
        bebidas.addMenuItem(new Item("Suco",0.00));
        bebidas.addMenuItem(new Item("Refrigerante",0.00));

        Item sobremesa1 = new Item("Brownie", 0.00);
        Item sobremesa2 = new Item("Sorvete", 0.00);
        sobremesas.addMenuItem(sobremesa1);
        sobremesas.addMenuItem(sobremesa2);

        Categoria menuCompleto = new Categoria("Cardápio Completo");
        menuCompleto.addMenuItem(pratosPrincipais);
        menuCompleto.addMenuItem(sobremesas);
        menuCompleto.addMenuItem(bebidas);

        displayMenuItems(menuCompleto);

        System.out.println("Preço Total do cardápio: R$" + menuCompleto.getPreco());
    }
}