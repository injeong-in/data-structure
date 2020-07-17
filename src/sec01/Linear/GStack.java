package sec01.Linear;

public class GStack<T> {

    int tos;
    Object[] stck; //스택에 요소를 저장할 공간 배열

    public GStack() {
        tos = 0;
        stck = new Object [10];
    }

    public void push(T item) {
        if(tos == 10)
            return;
//        tos++;
        stck[tos] = item;
        tos++;
    }

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
//            if(stringGStack.pop() == null) return;
            System.out.println(stringGStack.tos);
            System.out.println(stringGStack.pop());
        }
    }
}
