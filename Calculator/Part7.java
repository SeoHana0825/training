package SelfTraining.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {

        List<Double> history = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // 메뉴 시작 알림, 이동 메뉴 숫자 선택
        while (true) {
            System.out.println("=== 계산기 메뉴 ===");
            System.out.println("1. 계산하기");
            System.out.println("2. 계산 이력 보기");
            System.out.println("3. 이력 지우기");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int menu;

            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("원하시는 이동 페이지 숫자를 입력해주세요");
                scanner.nextLine();
                continue;
            }

            if (menu == 0) {
                System.out.println("계산기를 종료합니다");
                break;
            }

            switch (menu) {
                //1. 계산하기
                case 1:
                    double num1, num2 = 0;
                    String op;

                    try {
                        System.out.print("첫 번째 숫자를 입력하세요: ");
                        num1 = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해주세요");
                        scanner.nextLine();
                        continue;
                    }
                    System.out.print("연산자를 입력하세요 (+,-,&,/): ");
                    op = scanner.next();

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
                        continue;
                    }
                    if (num1 < 0) {
                        System.out.println("음수의 제곱근은 불가능합니다.");
                        continue;
                    }
                    double result = 0;

                    switch (op) {
                            case "+": result = num1 + num2; break;
                            case "-": result = num1 - num2; break;
                            case "*": result = num1 * num2; break;
                            case "/": result = num1 / num2; break;
                            case "%": result = num1 % num2; break;
                            case "^": result = Math.pow(num1, num2); break;
                            case "sqrt": result = Math.sqrt(num1); break;
                            default:
                                System.out.println("지원하지 않는 연산자입니다");
                        }
                    System.out.println("결과: " + result);

                    history.add(result); // 숫자만 저장

                    break;

                //2 이력보기
                case 2:
                    System.out.println("=== 계산 이력 ===");
                    if (history.isEmpty()) {
                        System.out.println("저장된 이력이 없습니다");
                    } else {
                        for (Double d : history) {
                            System.out.println(d);
                        }
                    }
                    break;

                //3. 이력삭제
                case 3:
                    history.clear();
                    System.out.println("저장된 이력이 모두 삭제되었습니다.");
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택해주세요");

            }

                    System.out.println("계속 계산하시겠습니까? (y/n): ");
                    String answer = scanner.next();
                    if (!answer.equalsIgnoreCase("y")) break;
            }
            System.out.println("계산기를 종료합니다");
            scanner.close();
        }
    }