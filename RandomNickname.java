package Quest;

import java.util.Random;

public class RandomNickname {

    private String[] firstList = {"기절초풍", "멋있는", "재미있는"};
    private String[] secondList = {"도전적인", "노란색의", "바보같은"};
    private String[] thirdList = {"돌고래", "개발자", "오랑우탄"};

    public String createRandomNickname() {
        Random rand = new Random();

        // 첫번째 랜덤 선택
        String first = firstList[rand.nextInt(firstList.length)];
        // 두번째 랜덤 선택
        String second = secondList[rand.nextInt(secondList.length)];
        // 세번째 랜덤 선택
        String third = thirdList[rand.nextInt(thirdList.length)];
        // 마지막 세 개의 문자열 배열하여 반환
        return first + second + third;
    }

    public static void main(String[] args) {
        System.out.println("=== 돌려돌려 랜덤 닉네임 ===");

        RandomNickname nickname = new RandomNickname();

        String randomNickname = nickname.createRandomNickname();
                System.out.println("생성된 닉네임 : " + randomNickname);

    }
}