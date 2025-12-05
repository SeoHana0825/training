package SelfTraining.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Part3 {

    // 3단계 예외처리 추가
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                //3단계 예외처리 try-catch
                double num1, num2;

                try{
                    System.out.println("첫 번째 숫자를 입력하세요: ");
                    //double num1 = scanner.nextDouble(); // 1단계 -> 3단계 예외처리 들어가면서 상단에서 선언
                    num1 = scanner.nextDouble();
                } catch(InputMismatchException e){
                    System.out.println("숫자를 입력해주세요");
                    scanner.nextLine();
                    continue;
                }
                System.out.println("연산자를 입력하세요 (+,-,*,/): ");
                String op = scanner.next();

                //3단계 예외처리 try-catch 다시 시작
                //double num2 상단 선언
                try {
                    System.out.println("두 번째 숫자를 입력하세요: ");
                    //double num2 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                } catch(InputMismatchException e){
                    System.out.println("숫자를 입력해주세요");
                    scanner.nextLine();
                    continue;
                }
                if (op.equals("/") && num2 == 0) { // 만약 연산자 (op) 나누기 그리고 두 번째 숫자를 0으로 할 때, 0으로 나눌 수 없다.
                    System.out.println("0으로 나눌 수 없습니다");
                }

                // 2단계 숫자 2개, 연산자 입력했을 때 결과값 출력 코드
                double result = 0;
                switch (op) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                    default:
                        System.out.println("지원하지 않는 연산자입니다.");
                }
                System.out.println("결과: " + result);
                break;
            }
            scanner.close();
    }
}