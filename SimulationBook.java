package Quest;

import java.util.Scanner;

public class SimulationBook {
    public static void main(String[] args) {


        //독서

        Scanner scanner = new Scanner(System.in);

        int page = 350;
        System.out.println("얼마나 읽었니?: ");
        page = scanner.nextInt();

        if (page <= 10 ) {
            System.out.println("목차 읽었네, 시작이 반이잖아!");

        }else if (page < 173 && page > 11) {
            System.out.println("반 읽었다! 완결이 궁금하지 않아?");

        } else if (page < 270 && page > 174) {
            System.out.println("거의 다 왔다");

        } else if (page <= 350) {
            System.out.println("다 읽었다! 해내버렸잖아?");

        } else {
            System.out.println("0~350 사이 정수만 입력하세요");

        }
    }
}


