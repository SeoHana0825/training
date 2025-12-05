package Quest.Method;

public class StudentTest251114 {

    public static void main(String[] args) {
        System.out.println("=== 학생 관리 시스템 ===");

        // 1. Student 객체 3개 생성 및 정보 설정
        Student251114 student1 = new Student251114("망고", "234578", 1,3.5);
        Student251114 student2 = new Student251114("우주", "256715",1, 3.0);
        Student251114 student3 = new Student251114("나라", "125674", 2, 3.8);

        // 2. 각 학생 정보 출력 및 메서드 테스트
        // 학생1
        System.out.println("[학생1]");

        student1.showInfp();
        System.out.println("우등생 여부: " + student1.isHonorStudent());

        student1.study();
        System.out.println();

        // 학생2
        System.out.println("[학생2]");

        student2.showInfp();
        System.out.println("우등생 여부: " + student2.isHonorStudent());

        student2.study();
        System.out.println();

        // 학생3
        System.out.println("[학생3]");

        student3.showInfp();
        System.out.println("우등생 여부: " + student3.isHonorStudent());

        student3.study();
        System.out.println();
    }
}
