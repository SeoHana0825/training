package SelfTraining;

import java.util.Scanner;

public class GradeCalculator_Self {

    public static void main(String[] args) {

        // if 점수를 직접 입력하게 된다면?
        System.out.println("===성적 계산기===");

        Scanner scanner = new Scanner(System.in);

        // 사용자에게 안내 메시지를 먼저 출력
        System.out.println("당신의 평균 점수는 얼마입니까?: ");

        // 입력 값을 변수에 저장
        int useraverage = scanner.nextInt();

        //scanner 사용을 마치고 닫아주기
        scanner.close();

        System.out.println("---결과---");

        // 사용자가 입력한 점수를 시준으로 등급 판단
        if (useraverage >= 90 && useraverage <= 100) {
            System.out.println("A");

         } else if (useraverage  >= 80) {
        System.out.println("B");

    }else if (useraverage  >= 70) {
        System.out.println("C");

    }else if (useraverage  >= 60) {
        System.out.println("D");

        }else if (useraverage  >= 0) {
            System.out.println("F");

    } else {
            System.out.println("0~100 사이 정수만 입력하세요");


            int[] scores = {55, 68, 72, 89, 90};

            int total = 0;
            for (int i = 0; i < scores.length; i++) {
                total = total + scores[i];
            }
            double average = total / scores.length;
        }


    }
}
