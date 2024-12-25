package casting;

public class Casting1 {

    public static void main(String[] args) {
//        작은 그릇에 있던 것을 큰 그릇에 옮기는 것은 아무 문제도 발생하지 않는다.

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // long에 int 대입
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // double에 int 대입
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue = " + doubleValue);

    }
}
