package sec02.Generic;


public class GenericExam<E> {

    String str = "나는";

    E push(E element) {

        return element;
    }






    public static void main(String[] args) {
        GenericExam<String> ge;
        ge = new GenericExam<>();
        ge.str = ge.push("Black pink in your area");

        System.out.println(ge.str);

        Integer id = new Integer(1);
        System.out.println(id);
        System.out.println(id.intValue());

    }
}
