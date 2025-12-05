package Quest.Method;

public class Student251114 {

    // 1. 속성 선언 (=필드 선언)
    String name;
    String studentId;
    int grade;
    double gpa;

    public Student251114(String name, String studentId, int grade, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        this.gpa = gpa;
    }


    // 2. study 메서드 구현
    public void study () {
        System.out.println("열심히 공부하고 있습니다!");
    }

    // 3. showInfo 메서드 구현
    public void showInfp () {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("학년: " + grade );
        System.out.println("학점: " + gpa);
    }

    // 4. isHonorStudent 메서드 구현 (학점 3.5 이상 판별 코드 작성)
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
}


