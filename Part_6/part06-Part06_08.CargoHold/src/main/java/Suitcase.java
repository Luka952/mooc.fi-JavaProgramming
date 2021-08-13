
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maxw;
    private int weight;
    
    public Suitcase(int maxWeight){
        this.items=new ArrayList<>();
        this.maxw=maxWeight;
        this.weight=0;
    }
    
    public void addItem(Item item){
        if(this.maxw>=weight+item.getWeight()){
            this.items.add(item);
            weight+=item.getWeight();
        }
    }
    
    @Override
    public String toString(){
        if(this.items.size()==0){
            return "no items ("+this.weight+" kg)";
        }else if(this.items.size()==1){
            return this.items.size()+" item ("+this.weight+" kg)";
        }
        return this.items.size()+" items ("+this.weight+" kg)";
    }
    
    public void printItems(){
        for(Item s: items){
            System.out.println(s.toString());
        }
    }
    
    public int totalWeight(){
        return this.weight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item hItem=this.items.get(0);
        for(Item i:items){
            if(i.getWeight()>hItem.getWeight()){
                hItem=i;
            }
        }
        return hItem;
    }
    
}
