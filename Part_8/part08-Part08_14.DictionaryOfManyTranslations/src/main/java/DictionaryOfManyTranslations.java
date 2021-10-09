
import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> list;
    
    public DictionaryOfManyTranslations(){
        this.list=new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.list.putIfAbsent(word, new ArrayList<>());        
        this.list.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return this.list.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.list.remove(word);
    }
    
}
