
import java.util.HashMap;


public class Abbreviations {
    private HashMap<String,String> abb;
    
    public Abbreviations(){
        this.abb=new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abb.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.abb.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abb.get(abbreviation);
    }
}
