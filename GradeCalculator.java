package Quest;

public class GradeCalculator {

    public static void main(String[] args) {

        // 점수 배열 생성 : 5개 과목의 점수를 배열로 저장 (임의의 점수 입력)
        int[] scores = {55, 68, 72, 89, 90};

        // 총합과 평균 계산 1. for문 사용하여 총합 계산
        int total = 0;
        for (int i = 0; i < scores.length; i++) {

        total = total + scores[i];
        }

        // 2. 평균 = 총합 / 과목수
        double average = (double)total / scores.length;

        // 학점 결정
        char grade = 'F';
        if(average >= 90) {
            grade = 'A';

        } else if (average >=80) {
            grade = 'B';

        } else if (average >=70) {
            grade = 'C';

        } else if (average >=60) {
            grade = 'D';
        } else {

        }

        System.out.println("===성적 계산기===");
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + average);
        System.out.println("학점 : " + grade);

    }
}
