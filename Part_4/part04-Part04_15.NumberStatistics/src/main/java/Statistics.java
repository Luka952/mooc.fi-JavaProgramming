
import java.util.ArrayList;

public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count=0;
        this.sum=0;
    }

    public void addNumber(int number) {
        this.count=this.count+1;
        this.sum+=number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count == 0) {
            return 0;
        } else {
            double s = sum;
            double c = count;
            return s / c;
        }
    }
}
