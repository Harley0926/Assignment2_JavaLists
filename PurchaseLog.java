import java.util.ArrayList;

public class PurchaseLog {
    // TODO: declare the field that stores your PurchaseItem records.
    // Decide: ArrayList<PurchaseItem> or LinkedList<PurchaseItem>?

    ArrayList<String> PurchaseItem = new ArrayList<>();


    public void addItem(PurchaseItem item) {
        // TODO
        PurchaseItem.add(item.getName());

    }

    public PurchaseItem findItemByName(String name) {
        // TODO
        if(PurchaseItem.contains(name)){
            return PurchaseItem.indexOf(name);
        } else {
            return null;
        }
    }

    public void updatePrice(String name, double newPrice) {
        // TODO
        for(int i = 0; i < PurchaseItem.size(); i++){}
            if(PurchaseItem.equals(name)){
                PurchaseItem.set(price, newPrice);
        }
    }

    public void printDailyReport() {
        // TODO: loop through every item — total count, total revenue, best seller
        for(int i = 0; i < PurchaseItem.size(); i++){
            String totalCount = PurchaseItem.get(i);
            int bestSeller = PurchaseItem.min(price);
        }
    }

    public int itemCount() {
        // TODO
        PurchaseItem.toArray();
        return 0;
    }
}