import java.io.*;


public class CustomerBackup {
    FileInputStream fis;
    public CustomerBackup() {
        String file = "C:\\file_customer.txt";
        try {
            fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            //dis.readByte()로 한 바이트씩 읽음
            FileOutputStream fos = new FileOutputStream("C:\\Users\\junhukang\\Desktop\\output.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            while( true){
                byte ch = dis.readByte();
                dos.write(ch);
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (EOFException eof){
            System.out.print("normal termination");
        }catch (IOException io) {
            System.err.println("I/O error occurred: " + io);
        }

        //dos.writeByte()로 한 바이트씩 저장

    }
    public static void main(String args[]) {
        CustomerBackup c = new CustomerBackup();
    }
}
