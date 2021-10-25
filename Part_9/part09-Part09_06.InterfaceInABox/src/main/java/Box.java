
import java.util.ArrayList;


public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double capacity){
        this.capacity=capacity;
        this.list=new ArrayList<>();
    }
    
    public void add(Packable item){
        if(item.weight()+this.weight()<=this.capacity){
            this.list.add(item);
        }
    }
    
    @Override
    public String toString(){
        return "Box: "+this.list.size()+" items, total weight "+this.weight()+" kg";
    }
    
    @Override
    public double weight() {
        double sum=0;
        for(Packable p: this.list){
            sum+=p.weight();
        }
        
        return (double) sum;
    }
    
}
