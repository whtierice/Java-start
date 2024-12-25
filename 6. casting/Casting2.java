package casting;

public class Casting2 {
//    큰 범위를 작은 범위에 담을 땐 형변환을 직접 해줘야함.

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue);
    }
}
