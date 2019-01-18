public class Sundries implements ISell{

    String name;
    int costPrice;
    int sellPrice;

    public Sundries(String name, int costPrice, int sellPrice){
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public void calculateMarkup() {

    }
}
