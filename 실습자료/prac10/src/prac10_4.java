import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

public class prac10_4 {

    public prac10_4() {


    }
    public static void main(String[] args) {
        Random random = new Random();
        Stack st = new Stack();
        //System.out.println(v.size());
        //System.out.println(random.nextInt(200)-100);
        for(int i=0; i<3;i++){
           st.push(random.nextInt(200)-100);
        }
        for(int i=0; i<3;i++){
            System.out.print(st.pop()+" ");
        }
    }
}
