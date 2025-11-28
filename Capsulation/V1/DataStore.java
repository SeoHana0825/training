package chapter2.Capsulation.V1;

// 핵시설 관리하는 개발자
public class DataStore {
    //"B"라는 문자열이 들어오면 핵폭발이!!
    private String store;

    // 무분별한 세터의 예시
    // private 로 작성되어있는 걸 굳이 꺼내서 입력시키면 의미가 x
    // 결국에 금지된 내용을 다시 불러서 입력하므로

//    public void setStore(String store) {
//        this.store = store;
//    }

    // 의미있는 세터의 예시
    // if-else 로직을 사용해서 불러냈을 때 안내문 입력
    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B가 입력되면 안됩니다");
        } else {
            this.store = store;
        }
    }
}
