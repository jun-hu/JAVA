import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

public class prac10_3 {

    public prac10_3() {


    }
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> v = new Vector<Integer>(10);
        //System.out.println(v.size());
        //System.out.println(random.nextInt(200)-100);
        for(int i=0; i<v.capacity();i++){
            v.addElement(random.nextInt(200)-100);
            System.out.print(v.get(i)+" ");
        }
    }
}
