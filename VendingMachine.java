package Quest;

import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        // 1. 음료 메뉴 표시하기 map<문자열, 숫자>
        Map<String, Integer> beverages = Map.of("사이다", 1700, "콜라", 1900, "식혜", 2500, "솔의눈", 3000);
        System.out.println("=== 자판기 메뉴 ===");

        for (Map.Entry<String, Integer> entry : beverages.entrySet()) {
            System.out.println("〇 " + entry.getKey() + " " + entry.getValue()+"원");
        }
        System.out.println("----------");

        // 2. 사용자가 좋아하는 음료 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 음료를 선택하세요: ");
        String choice = scanner.nextLine();

        if (!beverages.containsKey(choice)) {
            System.out.println("목록에 없는 음료일 경우 실행이 종료됩니다");
            scanner.close();
            return;
        }

        // 3. 음료 메뉴에 따른 지불 금액 안내
        int beveragesPrice = beverages.get(choice);
        System.out.println("선택하신 음료는" + choice + " " + beveragesPrice + "원 입니다");
        System.out.println("지불할 금액을 투입해주세요");

        // 4. 사용자가 지불할 금액 입력
        int coin = scanner.nextInt();

        if (coin < beveragesPrice) { // 돈이 부족할 경우
            int remain = beveragesPrice - coin; // 가격 - 투입액

            System.out.println("--------------");
            System.out.println("투입 금액: " + coin + "원");
            System.out.println("부족 금액: " + remain + "원 입니다.");
            System.out.println("돈이 부족합니다.");
            System.out.println("거래를 취소합니다.");

            scanner.close();
            return;

        } else { // 돈이 충분하거나 많을 경우
            int change = coin - beveragesPrice;

            System.out.println("--------------");
            System.out.println("투입 금액: " + coin + "원");
            System.out.println("잔돈: " + change + "원");
            System.out.println("감사합니다.");
        }
            scanner.close();
        }
    }
