import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class RandomCount {

    public static void main(String args[]) throws IOException {

        RandomAccessFile rac = new RandomAccessFile
                ("C:\\Users\\junhukang\\Desktop\\file_random_count.txt","rw");
        for(int i=0;i<257;i++){
            rac.writeInt(0);
        }
        Random random = new Random();
        for(int i=0;i<1000 ;i++){
            int accPointer = (int)(random.nextInt(255));
            rac.seek(accPointer*1);
            int num = rac.readInt();
            num++; rac.writeInt(num);
        }
        for( int i=0;i<256;i++){
            rac.seek(i*1);
            System.out.print(rac.read());
        }



    }
}
