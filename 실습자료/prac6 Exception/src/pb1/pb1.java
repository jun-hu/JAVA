package pb1;

public class pb1 {

	public static void main(String[] args) {
		try {
			int[] ar= new int[] {0,100,200,300};
			for(int i=0;i<ar.length;i++) {
				if(i==2)
					throw new Exception();
				System.out.printf("ar[%d]=%d\n",i,ar[i]);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
			
		}

	}
}
