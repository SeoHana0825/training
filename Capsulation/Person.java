package chapter2.Capsulation;

public class Person {

    // 먼저 private 속성 지정해 놓고 (왠만해서는 고정)
    // 생산자에서 속성을 불러와서 main 에서 불러서 사용해도 됨
    // secret : 캡슐화

    // 속성
    private String name;
    private String secret;


    // secret 문서를 빼고 싶으면 빼도 됨
    // 생산자
    public Person(String name) {
        this.name = name;

    }


    // 기능
    public void methodA() {}
    private void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
}
