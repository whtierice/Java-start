package cond.ex;

public class CondEx4 {

/*요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
    어바웃타임 - 평점9
    토이스토리 - 평점8
    고질라 - 평점7*/

    public static void main(String[] args) {

        double rating = 7;
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
