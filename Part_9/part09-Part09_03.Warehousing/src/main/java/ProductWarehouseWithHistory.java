
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory ch= new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.ch.add(initialBalance);
        
    }
    
    public String history(){
        return this.ch.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        double n=0;
        
        n=(double)super.getBalance()+amount;
        this.ch.add(n);
        
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double n=0;
        
        n=(double)super.getBalance()-amount;
        this.ch.add(n);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.ch.toString());
        System.out.println("Largest amount of product: "+this.ch.maxValue());
        System.out.println("Smallest amount of product: "+this.ch.minValue());
        System.out.println("Average: "+this.ch.average());
    }
    
}
