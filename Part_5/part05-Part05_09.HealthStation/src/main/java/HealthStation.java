
public class HealthStation {

    private int n;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int w=person.getWeight();
        n++;
        return w;
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int weighings(){
        return n;
    }
}
