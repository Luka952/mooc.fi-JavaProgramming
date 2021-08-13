
import java.util.ArrayList;


public class Room {
   private ArrayList<Person> person;

   public Room(){
       this.person=new ArrayList<>();
   }
   
   public void add(Person person){
      this.person.add(person);
   }
   
   public boolean isEmpty(){
       return this.person.isEmpty();
   }
   
   public ArrayList<Person> getPersons(){
       return this.person;
   }
   
   public Person shortest(){
       if(this.person.isEmpty()){
           return null;
       }
       
       Person s=this.person.get(0);
       for(Person e:person){
         if(e.getHeight()<s.getHeight()){
             s=e;
         }
       }
       return s;
   }
   
   public Person take(){
       if(this.person.isEmpty()){
           return null;
       }
       Person s=shortest();
       this.person.remove(s);
       return s;
   }
   
}
