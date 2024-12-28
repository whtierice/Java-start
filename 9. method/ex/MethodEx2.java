package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {

        macro(3);
        macro(5);
        macro(7);
    }

    public static void macro(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello, world!");
        }
    }
}
