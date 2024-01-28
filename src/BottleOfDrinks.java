public class BottleOfDrinks extends Product{
    private int volume;

    public BottleOfDrinks(int id, String name, int price, int volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfDrinks{" +
                "volume = " + volume + ", name " + getName() +
                '}';
    }
}
