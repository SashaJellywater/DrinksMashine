public class HotDrinks extends Product{
    private int volume;
    private int temp;

    public HotDrinks( int id, String name, int price, int volume, int temp) {
        super(id, name, price);
        this.volume = volume;
        this.temp = temp;

    }
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ваш горячий напиток:{" + getName() +
                " , объём = " + volume + ", температура " + temp +"°C" +
                '}';
    }
}