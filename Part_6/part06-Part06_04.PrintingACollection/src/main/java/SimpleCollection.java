
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String help="";
        for(String s:this.elements){
            if(s.equals(this.elements.get(elements.size()-1))){
                help+=s;
            }else{
                help+=s+"\n";
            }
        }
        
        if(this.elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        }else if(this.elements.size()==1){
            return "The collection "+this.name+" has "+this.elements.size()+" element:\n"+help;
        }
        return "The collection "+this.name+" has "+this.elements.size()+" elements:\n"+help;
    }
    
}
