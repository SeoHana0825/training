package chapter2.Capsulation.V2;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();

        // 무분별한 세터 예시
//        robot.setLeftLeg(true);
//        robot.setRightLeg(true);
//        robot.setLeftArm(true);
//        robot.setRightArm(true);
//

        // 의미있는 세터
        robot.walk(true);

    }
}
