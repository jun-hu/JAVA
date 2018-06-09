package pb2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class pb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("a.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");
		}
	}

}
