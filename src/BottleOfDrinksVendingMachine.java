import java.util.ArrayList;
import java.util.List;

public class BottleOfDrinksVendingMachine implements VendingMachine{
    private final List<Product> productList;
    private int money;

    public BottleOfDrinksVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for(Product product: productList){
            if(product.getName().equals(name)){
                money +=product.getPrice();
                return product;
            }
        }
        return null;
    }
    public BottleOfDrinks getProduct( String name, int volume){
        for(Product product: productList){
            if (product instanceof BottleOfDrinks){
                if (product.getName().equals(name) && ((BottleOfDrinks) product).getVolume()== volume){
                    return (BottleOfDrinks) product;
                }
            }
        }
        return null;
    }
}
