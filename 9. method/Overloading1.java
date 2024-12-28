package method;

// 매개변수의 개수가 다른 경우

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b){
        System.out.println("1번호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번호출");
        return a + b + c;
    }
}
