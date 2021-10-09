
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
   private HashMap<String, ArrayList<String>> list;
   
   public StorageFacility(){
       this.list=new HashMap<>();
   }
   
   public void add(String unit, String item){
       this.list.putIfAbsent(unit, new ArrayList<>());
       this.list.get(unit).add(item);
   }
   
   public ArrayList<String> contents(String storageUnit){
       return this.list.getOrDefault(storageUnit, new ArrayList<>());
   }
   
   public void remove(String storageUnit, String item){
       if(this.list.get(storageUnit).contains(item)){
           this.list.get(storageUnit).remove(item);
       }
   }
   
   public ArrayList<String> storageUnits(){
       ArrayList<String> keys =new ArrayList<>();
       for(String s: this.list.keySet()){
           if(!this.list.get(s).isEmpty()){
               keys.add(s);
           }
       }
       return keys;
   }
   
}
