import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrinks(1, "Капучино", 200, 400, 65));
        productList.add(new HotDrinks(1, "Капучино", 150, 200, 65));
        productList.add(new HotDrinks(1, "Фильтр", 170, 200, 55));
        productList.add(new HotDrinks(1, "Горячий шоколад", 250, 400, 70));
        productList.add(new HotDrinks(1, "Глинтвейн", 200, 400, 70));
        productList.add(new HotDrinks(1, "Эспрессо", 150, 150, 55));
        productList.add(new HotDrinks(1, "Молоко", 150, 400, 65));
        productList.add(new HotDrinks(1, "Молоко", 100, 200, 65));

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(productList);

        HotDrinks drink1 = vendingMachine.getProduct("Капучино", 400, 65);
        HotDrinks drink2 = vendingMachine.getProduct("Капучино", 500, 70);
        HotDrinks drink3 = vendingMachine.getProduct("Молоко", 400, 65);

        if (drink1 != null) {
            System.out.println(drink1.toString());
        } else {
            System.out.println("Напиток не найден.");
        }

        if (drink2 != null) {
            System.out.println(drink2.toString());
        } else {
            System.out.println("Напиток не найден.");
        }
        
        if (drink3 != null) {
            System.out.println(drink3.toString());
        } else {
            System.out.println("Напиток не найден.");
        }
    }
}

