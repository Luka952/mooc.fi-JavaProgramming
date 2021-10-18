
import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory(){
        this.list=new ArrayList<>();
    }
    
    public void add(double status){
        this.list.add(status);
    }
    
    public void clear(){
        this.list.clear();
    }
    
    public double maxValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        double max=this.list.get(0);
        int a=0;
        for(int i=0;i<this.list.size();i++){
            if(this.list.get(i)>=max){
                max=this.list.get(i);
                a=i;
            }
        }
        
        return this.list.get(a);
    }
    
    public double minValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        double min=this.list.get(0);
        int a=0;
        for(int i=0;i<this.list.size();i++){
            if(this.list.get(i)<=min){
                min=this.list.get(i);
                a=i;
            }
        }
        
        return this.list.get(a);
    }
    
    public double average(){
        if(this.list.isEmpty()){
            return 0;
        }
        
        double sum=0;
        double a=0;
        for(int i=0;i<this.list.size();i++){
            sum+=this.list.get(i);
            a++;
        }
        
        return sum/a;
    }
    
    @Override
    public String toString(){
        return this.list.toString();
    }
    
}
