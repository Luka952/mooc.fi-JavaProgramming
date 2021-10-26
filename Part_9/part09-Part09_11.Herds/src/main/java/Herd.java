
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String ret = "";

        for (Movable m : this.list) {
            ret += m.toString() + "\n";
        }

        return ret;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.list) {
            m.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }

}
