package sec01.Linear;

//제네릭을 활용한 스택
public class GStack<T> {

    int tos; //1번부터 시작하는 정수값(인덱스 넘버와 별개!)
    Object[] stck; //스택에 요소를 저장할 공간 배열

    public GStack() {
        tos = 0;
        stck = new Object [10];
    }

    //삽입용 메서드
    public void push(T item) {
        if(tos == 10)
            return;
//        tos++;
        stck[tos] = item; //0번 인덱스
        tos++; //반복문에서 사용할 순서 정수값(1부터 시작)
    }

    //출력용 메서드
    public T pop() {
        if(tos==0)
            return null;
        tos--;
        return (T)stck[tos];
    }

    public static void main(String[] args) {
        GStack<String> stringGStack = new GStack<>();
        stringGStack.push("Busan");
        stringGStack.push("Jeju");
        stringGStack.push("Seoul");


        for(int i=0; i<3; i++) {
            System.out.println(stringGStack.tos);
            System.out.println(stringGStack.pop());
        }
    }
}
