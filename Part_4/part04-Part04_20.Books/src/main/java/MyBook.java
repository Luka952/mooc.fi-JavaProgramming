
public class MyBook {
    private String t;
    private int p;
    private int y;
    
    public MyBook(String t, int p, int y){
        this.t=t;
        this.p=p;
        this.y=y;
    }
    
    public String everything(){
        return this.t+", "+this.p+" pages, "+this.y;
    }
    
    public String name(){
        return this.t;
    }
}


