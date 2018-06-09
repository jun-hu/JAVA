import java.util.Random;

public class prac10_1 {


    public prac10_1() {
        Random r = new Random();
        r.setSeed(r.nextLong());
        int num = r.nextInt();
        System.out.println(num);
    }
    public static void main(String[] args) {
        prac10_1 prac= new prac10_1();
    }
}
