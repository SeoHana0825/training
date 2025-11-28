package chapter2.Capsulation.V2;

// 로보트를 걷게 만들자!
public class Robot {
        private boolean leftLeg;
        private boolean rightLeg;

        private boolean leftArm;
        private boolean rightArm;

        // 기타 등등의 속성들이 있다고 가정

    // 무분별한 세터
//        public void setLeftLeg(boolean leftLeg){
//            this.leftLeg = leftLeg;
//        }
//        public void setRightLeg(boolean RightLeg){
//            RightLeg = RightLeg;
//        }
//        public void setLeftArm(boolean leftArm){
//            this.leftArm = leftArm;
//        }
//        public void setRightArm(boolean RightArm){
//            RightArm = RightArm;
//        }

    //의미있는 세터 -> 하나로 묶어주면 한개로 셋팅 가능
    public void walk (boolean power) {
        this.leftLeg = power;
        this.rightLeg = power;
        this.leftArm = power;
        this.rightArm = power;
    }
}
