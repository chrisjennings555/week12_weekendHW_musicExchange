import java.util.ArrayList;

public class Shop {

    ArrayList stock;

    public Shop(ArrayList<ISell> stock){
        this.stock = new ArrayList<ISell>();
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
        return item.calculateMarkup();
    }

    public int calculateTotalProfit(){
        int totalProfit = 0;
        for(Object item : this.stock) {
            ISell checkedItem = (ISell) item;
            totalProfit += checkedItem.calculateMarkup();
        }
        return totalProfit;
    }


}
