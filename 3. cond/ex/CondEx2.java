package cond.ex;

public class CondEx2 {

/*주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
거리가 1km 이하이면 : "도보"
거리가 10km 이하이면 : "자전거"
거리가 100km 이하이면 : "자동차"
거리가 100km 이하이면 : "비행기"*/

    public static void main(String[] args) {
        int distance = 0;
        String s = null;

        distance = 50;

        if (distance <= 1) {
            s = "도보";
        } else if (distance <= 10) {
            s = "자전거";
        } else if (distance <= 100) {
            s = "자동차";
        } else if (distance > 100) {
            s = "비행기";
        }
        System.out.println(s + "를 이용하세요.");
    }
}
