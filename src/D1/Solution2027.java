package D1;

public class Solution2027 { // 대각선 출력하기

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.print("#");
            for(int k = 5 - (i + 1); k > 0; k--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

}
