package Quest;

public class OneToHundredTimesTable {
    public static void main(String[] args) {

        // 구구단 출력하기
        int num = 1;
        for (num = 2; num <= 9; num++) {
            for(int i = 1; i <= 9; i++) {
                System.out.println(num + "x" + i + "=" + num*i);
            }

        }

    }
}
