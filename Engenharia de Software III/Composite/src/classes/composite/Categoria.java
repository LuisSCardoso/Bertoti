package classes.composite;

import java.util.ArrayList;
import java.util.List;

import interfaces.ItemMenu;

public class Categoria implements ItemMenu{
    private String nome;
    public List<ItemMenu> items = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void addMenuItem(ItemMenu item) {
        items.add(item);
    }

    public void removeMenuItem(ItemMenu item) {
        items.remove(item);
    }

    public String getItemInfo(int index) {
        if (index >= 0 && index < items.size()) {
            ItemMenu item = items.get(index);
            return item.getNome() + " - $" + item.getPreco();
        } else {
            return null;
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double totalpreco = 0;
        for (ItemMenu item : items) {
            totalpreco += item.getPreco();
        }
        return totalpreco;
    }

    public void displayCategoryItems() {
        System.out.println("Categoria: " + getNome());
        for (ItemMenu item : items) {
            System.out.println(" - " + item.getNome() + " - R$" + item.getPreco());
        }
    }
}