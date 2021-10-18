
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> list;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        this.list=new ArrayList<>();
        this.capacity=capacity;
    }
    
    public int cap(){
        int sum=0;
        for(Item i:this.list){
            sum+=i.getWeight();
        }
        
        return sum;
    }
    
    @Override
    public void add(Item item){
        if(this.cap()+item.getWeight()<=this.capacity){
            this.list.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.list.contains(item);
    }
    
}
