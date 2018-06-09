import java.util.StringTokenizer;

public class assign10_1 {
    public static void main(String[] args) {
        String str = "요즘 재계 분위기를 날씨에 비유하자면 ‘흐림’이다. 도널드 트럼프 미국 대통령이 점화한" +
                "글로벌 무역 전쟁 와중에 세탁기는 미국의 긴급수입제한조치(세이프가드), 태양광 발전" +
                "설비와 철강 등은 고율 관세의 덫에 걸렸다. 살얼음판을 걷고 있는 미ㆍ중 간 무역충돌이" +
                "거세지면 중간에 낀 우리 기업들의 피해는 더 커질 수밖에 없다. 국내에서는 지난해 인상" +
                "된 법인세율이 올해부터 적용되고, 최저임금 인상으로 인한 혼란, 오는 7월 도입되는 주" +
                "최대 52시간 근무 등 첩첩산중이다. 설상가상 그동안 수출을 이끌어온 스마트폰 디스플" +
                "레이 등이 휘청거리는데, 중국은 반도체 정도를 제외하면 거의 전 산업 분야에서 우리의" +
                "시장을 잠식해가고 있다. 이처럼 국내외적으로 리스크가 커져만 가는 상황에서 기업들은" +
                "‘체질개선’을 통해 미래를 준비 중이다. 4차 산업혁명의 조류에 확실히 올라타 경쟁의 판" +
                "도를 바꾸겠다는 각오다.";
        StringTokenizer st = new StringTokenizer(str, " ",true); // str: 입력 문장, " ": 토큰
        //st.countTokens(); // 토큰의 개수 리턴
        //st.hasMoreTokens(); // 잔여 토큰 확인
        //st.nextToken(); // 다음 토큰 리턴
        int count=0;
        while(st.hasMoreTokens()){
            String data = st.nextToken();
            if(!data.equals(" ")) {
                System.out.println(count + " " + data);
                count++;
            }
        }
        //System.out.println(st.countTokens());
        //System.out.println(st.hasMoreTokens());
        //System.out.println( st.nextToken());
        //if(data.equals("!")) System.out.println("#");
        //else if (data.equals("@")) System.out.println("$");
        //else System.out.println(data);
    }
}
