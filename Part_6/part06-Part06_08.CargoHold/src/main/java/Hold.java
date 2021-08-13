
import java.util.ArrayList;

public class Hold {

    private int maxw;
    private ArrayList<Suitcase> list;

    public Hold(int maxw) {
        this.maxw = maxw;
        this.list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcases() + suitcase.totalWeight() <= this.maxw) {
            list.add(suitcase);
        } else {
            return;
        }

    }

    public int weightOfSuitcases() {
        int weight = 0;
        for (Suitcase s : list) {
            weight += s.totalWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Suitcase s : list) {
            s.printItems();
        }

    }

    @Override
    public String toString() {
        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (list.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (list.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = list.size() + " suitcases";
        }
        return suitcaseOutput + weightOutput;
    }
}
