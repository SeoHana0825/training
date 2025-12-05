package SelfTraining.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {

        List<Double> history = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            double num1, num2;

            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }
            System.out.print("연산자를 입력하세요 (+,-,&,/): ");
            String op = scanner.next();

            try {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }
            if (op.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다");
            }
            double result = 0;
            switch (op) {
              case "+": result = num1 + num2; break;
              case "-": result = num1 - num2; break;
              case "*": result = num1 * num2; break;
              case "/": result = num1 / num2; break;
              default:
                System.out.println("지원하지 않는 연산자입니다");
        }
            System.out.println("결과: " + result);

            history.add(result); // 숫자만 저장
            System.out.println("저장: " + history);

            System.out.println("계속 계산하시겠습니까? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) break;
            }
            System.out.println("계산기를 종료합니다");
            scanner.close();
        }
    }