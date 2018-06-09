import java.io.*;
import java.util.ArrayList;
import java.util.List;

class customer_object implements Serializable {
    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void printCustomer(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("num: "+num);
        System.out.println("address: "+address);
    }

    public customer_object(String name, String age, String num, String address) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.address = address;
    }

    private String name;
    private String age;
    private String num;
    private String address;

}
public class CustomerObject {
    public CustomerObject() throws IOException, ClassNotFoundException {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\junhukang\\Desktop\\output.txt");
            //FileInputStream fis = new FileInputStream("C:\\file_customer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //ObjectInputStream ois = new ObjectInputStream(fis);
            List<customer_object> customerlist = new ArrayList<>();
            //customer_object cus = new customer_object();
            FileReader fr = new FileReader(new File("C:\\file_customer.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            List<String> li = new ArrayList<>();
            while ((line = br.readLine()) != null) {

                String [] str=line.split(" ");
                oos.writeObject(new customer_object(str[0],str[1],str[2],str[3]));
            }
        } catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        }
    }
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        CustomerObject c = new CustomerObject();
    }

}