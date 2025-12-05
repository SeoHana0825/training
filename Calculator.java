package Quest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // 1. 스케너 기동
        Scanner scanner = new Scanner(System.in);

        // 2. 시스템 제목입력
        System.out.println("=== Java 계산기 ===");

        // 반복하기
        double num1; // 3. 숫자 지정해주기
        while (true) { //4. while 또는 for 시스템 반복실행 명령문 써주기
            try { //9. try-chach (예외처리문)으로 계산 덮어씌우기
                System.out.println("첫 번째 숫자를 입력해주세요: ");
                num1 = scanner.nextDouble(); // 스케너 입력하고 다음 단계로 넘어가게 .nextDouble(); 잊지 말기

                System.out.println("연산자를 입력해주세요(+, -, *, /, %, ^, s) : ");
                char ch = scanner.next().charAt(0);

                System.out.println("두 번째 숫자를 입력해주세요: ");
                double num2 = scanner.nextDouble();

                double result = 0; // 5. 계산 끝나고 결과값 도출 (진실) 명령

                if (ch == '+') { // 6. 조건문 실행 + 였을 때, - 였을 때, * 였을 때, / 였을 때
                    result = num1 + num2;

                } else if (ch == '-') {
                    result = num1 - num2;

                } else if (ch == '*') {
                    result = num1 * num2;

                } else if (ch == '/') {
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다!"); // 이거 없으면 안나옴
                        continue;
                    }
                    result = num1 / num2;

                } else if (ch == '%') {
                    result = num1 % num2;

                } else if (ch == '^') {
                    result = Math.pow(num1, num2);

                } else if (ch == 's') {
                    result = Math.sqrt(num1);

                } else { // 7. 숫자 또는 연산이 잘 못 됬을 때 제일 마지막 예외문
                    System.out.println("잘못된 연산자입니다.");
                    continue; // 8. 결과가 나와야하니까 다 입력한 뒤 이어지도록
                }
                System.out.println("결과: " + num1 + ch + num2 + "=" + result); //8. 결과값 도출
                System.out.println();

            }catch (InputMismatchException e) { //9. try-catch (예외처리문)으로 계산 덮어씌우기
                System.out.println("정확한 숫자를 입력해주세요.");

                scanner.nextLine(); // continue 가 있어도 next 만 한다면 끝나고 nextLine 으로 하면 다음단계로 넘어감
                continue;
            }
            // 10. 추가하고 싶은 것들 try-catch 예외문 "밖"으로 넣어서 이어지게 하기
            //  계속 진행할 건가요?
            System.out.println("계속 진행하시겠습니까? (y/n): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println();
                continue;
            }else {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        scanner.close();
    }

}
