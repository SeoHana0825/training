package Quest;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CrossWord {

    // 1. 컴퓨터가 랜덤으로 영어단어를 선택
    // static 프로그램 전체 공유 사용
    private static String[] WORDS = {
            "airplane", "apple", "arm", "bakery", "banana", "bank", "bean", "belt", "bicycle", "biography", "blackboard",
            "boat", "bowl", "broccoli", "bus", "car", "carrot", "chair", "cherry", "cinema", "class", "classroom",
            "cloud", "coat", "cucumber", "desk", "dictionary", "dress", "ear", "eye", "fog", "foot", "fork",
            "fruits", "hail", "hand", "head", "helicopter", "hospital", "ice", "jacket", "kettle", "knife",
            "leg", "lettuce", "library", "magazine", "mango", "melon", "motorcycle", "mouth", "newspaper",
            "nose", "notebook", "novel", "onion", "orange", "peach", "pharmacy", "pineapple", "plate", "pot", "potato", "rain",
            "shirt", "shoe", "shop", "sink", "skateboard", "ski", "skirt", "sky", "snow", "sock", "spinach", "spoon",
            "stationary", "stomach", "strawberry", "student", "sun", "supermarket", "sweater", "teacher",
            "thunderstorm", "tomato", "trousers", "truck", "vegetables", "vehicles", "watermelon", "wind"
    };


    public static void main(String[] args) {

        // 1-1. 목록에서 단어 무작위로 선택하기 (랜덤 객체 생성) -> 랜덤 객체 활성화!! 이 부분에서 import java.until 이 생성됨
        Random random = new Random();

        // 1-2. 단어 목록의 길이(개수)를 이용해 무작위 인덱스 생성
        int wordIndex = random.nextInt(WORDS.length);

        // 1-3. 생성된 인덱스로 배열에서 단어를 선택
        // toLowerCase(Locale.ROOT); -> 정답 알파벳 모두 대문자로 변환
        String word = WORDS[wordIndex].toUpperCase(Locale.ROOT);

        // 1-4. 선택된 단어의 정보를 사용자에게 보여줌
        System.out.println("랜덤으로 단어가 선택되었습니다.");
        System.out.println("A 부터 Z 까지의 알파벳을 입력하세요.");

        for (int i = 0; i < word.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();

        // 1-5 현재까지 맞춘 단어 상태 저장
        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        // 1-6 이미 시도한 알파벳 저장
        String triedLetters = "";

        // 초기 화면 출력
        // System.out.println(String.valueOf(guessedWord).replace(" ", "").trim());

        // 2. 사용자는 A-Z 까지의 알파벳 중에서 하나를 입력
        Scanner scanner = new Scanner(System.in);

        // 2-1 사용자에게 입력 요청 (무한 반복 / 9번 틀리면 게임오버)
        final int MaxChances = 9;

        for (int chance = MaxChances; chance >= 0;) {

            if (chance == 0) {
                System.out.println("기회가 모두 소진되었습니다. 정답은 " + word + "였습니다.");
                break;
            }
            if (String.valueOf(guessedWord).equals(word)) {
                System.out.println("플레이어 승리! 정답은 " + word + "였습니다.");
                break;
            }

            System.out.println("==========");
            System.out.println("남은 기회: " + chance + "번");
            System.out.println("현재까지 시도한 알파벳: " + triedLetters);

            // 3가지 과정 처리
            // toUpperCase 대문자로 변환
            // trim() 앞뒤 공백제거 (실수로 스페이스바를 누르고 입력했을 때 글자수가 1개가 아니라고 인식되는 것을 방지)
            String input = scanner.nextLine().toUpperCase(Locale.ROOT).trim();


            // 2-2 입력 검증 확인
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("잘못된 입력입니다. A-Z 중 한 글자만 입력해 주세요");
                continue; // 기회 차감 없이 루프 처음으로 이동
            }
            String no = input.substring(0, 1);

            if (triedLetters.contains(no)) {
                System.out.println("이미 시도했던 알파벳입니다. 다른 알파벳을 입력해주세요");
                continue;
            }

            triedLetters += no; // 시도한 목록에 추가

            if (word.contains(no)) {
                System.out.println("정답에 포함된 알파벳입니다!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == no.charAt(0)) {
                        guessedWord[i] = no.charAt(0);
                    }
                }
            } else {
                System.out.println("정답에 포함되지 않습니다. 기회가 1회 차감됩니다.");
                chance-- ;
            }
            System.out.println(String.valueOf(guessedWord).replace(" ", "").trim());

            // scanner.close();
        }

    }
}