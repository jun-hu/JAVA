import java.text.SimpleDateFormat;
import java.util.*;

public class prac10_5 {

    public prac10_5() {


    }
    public static void main(String[] args) {
        String str = "입력,문장,확인";
        StringTokenizer st = new StringTokenizer(str, ",",true); // str: 입력 문장, " ": 토큰
        //st.countTokens(); // 토큰의 개수 리턴
        //st.hasMoreTokens(); // 잔여 토큰 확인
        //st.nextToken(); // 다음 토큰 리턴

        while(st.hasMoreTokens()){
            String data = st.nextToken();
            System.out.println(data);

        }
        //System.out.println(st.countTokens());
        //System.out.println(st.hasMoreTokens());
        //System.out.println( st.nextToken());
        //if(data.equals("!")) System.out.println("#");
        //else if (data.equals("@")) System.out.println("$");
        //else System.out.println(data);
    }
}
