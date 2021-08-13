
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
    
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        int m=0;
        String s=null;
        for(int i=0;i<this.elements.size();i++){
            if(this.elements.get(i).length()>m){
                m=this.elements.get(i).length();
                s=this.elements.get(i);
            }
        }
        return s;
    }

}
