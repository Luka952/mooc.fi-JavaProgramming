
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> mapStock;
    private Map<String, Integer> mapPrice;

    public Warehouse() {
        this.mapStock = new HashMap<>();
        this.mapPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.mapStock.put(product, stock);
        this.mapPrice.put(product, price);
    }

    public int price(String product) {
        for (String p : this.mapPrice.keySet()) {
            if (p.equals(product)) {
                return this.mapPrice.get(p);
            }
        }

        return -99;
    }

    public int stock(String product) {
        for (String p : this.mapStock.keySet()) {
            if (p.equals(product)) {
                return this.mapStock.get(p);
            }
        }

        return 0;
    }

    public boolean take(String product) {
        for (String p : this.mapStock.keySet()) {
            if (p.equals(product) && this.mapStock.get(p) > 0) {
                this.mapStock.put(p, this.mapStock.get(p) - 1);
                return true;
            }
        }

        return false;
    }
    
    public Set<String> products(){
        Set<String> list=new HashSet<>();
        for(String key: this.mapStock.keySet()){
            list.add(key);
        }
        return list;
    }

}
