
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> list;
    
    public ShoppingCart(){
        this.list=new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.list.containsKey(product)){
            increaseQuantity(product);
        }else{
            this.list.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int sum=0;
        
        for(Item i: this.list.values()){
            sum+=i.price();
        }
        
        return sum;
    }
    
    public void increaseQuantity(String product){
        this.list.get(product).increaseQuantity();
    }
    
    public void print(){
        for(String key: this.list.keySet()){
            System.out.println(this.list.get(key).toString());
        }
    }
    
}
