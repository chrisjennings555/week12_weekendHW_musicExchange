import java.util.ArrayList;

public class Shop {

    ArrayList stock;

    public Shop(ArrayList<ISell> stock){
        this.stock = new ArrayList();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public int findIndexOfItem(ISell item){
        return stock.indexOf(item);
    }

    public void removeItemFromStock(ISell item){
        int itemIndex = findIndexOfItem(item);
        stock.remove(itemIndex);
    }

    public int calculateMarkupOfItem(ISell item){
        Instrument pricedItem = (Instrument) item;
        int markUp = pricedItem.sellPrice - pricedItem.costPrice;
        return markUp;
    }


}
