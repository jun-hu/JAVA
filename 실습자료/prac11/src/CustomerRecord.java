import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//고객정보를 읽어 각 필드의 내용을 출력한다.
public class CustomerRecord {
    public CustomerRecord() {
        try {
            FileReader fr = new FileReader(new File("C:\\file_customer.txt"));
            BufferedReader br = new BufferedReader(fr);

            List<String> list= new ArrayList<>() ;
            String str;
            while((str=br.readLine())!=null) {
                list.add(str);
                String[] info=str.split(" ");

                System.out.println("Name: "+info[0]);
                System.out.println("Age: "+info[1]);
                System.out.println("Number: "+info[2]);
                System.out.println("E-mail: "+info[3]);
                System.out.println("----------------");
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        CustomerRecord c = new CustomerRecord();
    }
}
