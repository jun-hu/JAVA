import java.text.SimpleDateFormat;
import java.util.Date;

public class prac10_2 {

    public prac10_2() {
        //Date today= new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.println(dateForm.format(new Date()));
    }
    public static void main(String[] args) {
        prac10_2 prac= new prac10_2();
    }
}
