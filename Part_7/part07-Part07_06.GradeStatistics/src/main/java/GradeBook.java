
import java.util.ArrayList;


class GradeBook {
   private ArrayList<Integer> points;
   
   public GradeBook(){
       this.points=new ArrayList<>();
   }
   
   public void add(int p){
       this.points.add(p);
   }
   
   public String average(){
       int sum=0;
       double r=0;
       for(int pt: points){
           sum+=pt;
       }
       r=sum*1.0/this.points.size();
       return r+"";
   }
   
   public String passing(){
       int sum=0;
       double r=0;
       int n=0;
       for(int pt: points){
           if(pt>=50){
               sum+=pt;
               n++;
           }
       }
       if(n==0){
           return "-";
       }
       r=sum*1.0/n;
       return r+"";
   }
   
   public String pass(){
       int p=0;
       for(int pt:points){
           if(pt>=50){
               p++;
           }
       }
       double r=100.0*p/this.points.size();
       return r+"";
   }
   
   public void printGrades() {

        int[] grades = new int[6]; 

        for (int grade : points) {

            if (grade >= 90) {
                grades[0]++;
            } else if (grade <= 89 && grade > 79) {
                grades[1]++;
            } else if (grade <= 79 && grade > 69) {
                grades[2]++;
            } else if (grade <= 69 && grade > 59) {
                grades[3]++;
            } else if (grade <= 59 && grade > 49) {
                grades[4]++;
            } else if (grade <= 49) {
                grades[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gr = 5;

        for (int e : grades) {
            System.out.print(gr + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n");
            gr--;
        }

    }
   
   public void print(){
       System.out.println("Point average (all): "+this.average());
       System.out.println("Point average (passing): "+this.passing());
       System.out.println("Pass percentage: "+this.pass());
       
       this.printGrades();
   }
}
