package method;

public class MethodRetunrn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    // if문이 실행되지 않았을 때 반환값을 정의하지 않았는데, 메서드를 정의할 때 반환자료형을 지정해놨으므로 컴파일 오류 발생
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        return false;
    }
}
