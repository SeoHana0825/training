package chapter2.Capsulation;

public class Main {

    public static void main(String[] args) {

        // 생성자 호출
        // 생성자 접근 제어자가 private 면 불러올 수 없음 (원문에서만 볼 수 있음)
        Person person = new Person("meimei");


        // 인스턴스 변수 접근
        // person.name = "gygim";
        // person.secret = "??"; 씨크릿이라서 접근 x

        // 인스턴스 메서드 접근
        // person.methodA();
        // person.methodB();   씨크릿이라서 접근 x

        // 게터 (불러오기)
        // String a = person.nema;  접근이 아예 안됨 이때 게터를 사용
        String name = person.getName();
        System.out.println("이름: " + name);

        // 세터 (변경)
        person.setName("Steve");
        String name2 = person.getName();
        System.out.println("이름: " + name2);




    }
}
