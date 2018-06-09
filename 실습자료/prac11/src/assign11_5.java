import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class assign11_5 {
    public static void main(String[] args) throws IOException {
        
        Random r = new Random();
        RandomAccessFile rac = new RandomAccessFile("file_theater_reserve.txt", "rw");


        for(int i=0; i<500; i++){
            rac.seek(i*4);
            rac.writeInt(0);
        }
        boolean check=true;
        while (check){
            
            r.setSeed(r.nextLong());
            int customer_id = r.nextInt(15000);
            if((customer_id == 0) || (customer_id > 10000))
                check=false;
            r.setSeed(r.nextLong());
            int seat_id = r.nextInt(500)+1;

            rac.seek((seat_id-1) * 4);

            if((int)(rac.readInt()) == 0){

                rac.writeInt(customer_id);
            }

        }

        for(int i=0;i<500;i++){
            rac.seek(i * 4);
            int data = rac.readInt();
            if(data != 0)
                System.out.println("reservation_id : " + data);
        }
    }
}
