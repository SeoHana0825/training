package Quest;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberManager {

    public static void main(String[] args) {

        // 10개 숫자로 배열 초기화
        int [] number = {17,25,30,13,97,28,93,5,66,84};

        // 최대값, 최소값 찾기
        int max = number[0];
        int min = number[0];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            // 최대값, 최소값, 합계 계산 코드 작성
            if (number[i] > max) {
            }
            if (number[i] < min) {
            }
            sum += number[i];

        }

        // 평균 계산
        double average = (double) sum / number.length;

        // 짝수만 ArrayList에 저장
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : number) {

            //짝수만 판별
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        // 결과 출력
        System.out.println("==== 숫자 관리 프로그램 ====");
        System.out.println("전체숫자 : " + Arrays.toString(number));
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("합계 : " + sum);
        System.out.println("평균값 : " + average);
        System.out.println("짝수 : " + evenNumbers);



    }
}
