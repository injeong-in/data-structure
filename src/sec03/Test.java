package sec03;

import java.util.LinkedList;

class HashTable {

    class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        String value() {
            return value;
        }

        void value(String value) {
            this.value = value;
        }
    }
    //Node클래스



    LinkedList<Node>[] data;

    HashTable(int size) {
        this.data = new LinkedList[size];
    }


    //해쉬코드 생성 메서드
    int getHashCode(String key) {
        int hashcode = 0;
        for(char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    //해쉬코드를 받아서 배열방의 인덱스로 변환하는 메서드
    int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;
        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        if(list==null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }

    String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null? "Not found" : node.value();
    }
}


public class Test {

    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("반","갑");
        System.out.println(h.get("반"));

        String str = "반갑습니다";
        int hashCode =0;

        for(char c : str.toCharArray()) {
            hashCode += c;
        }
        System.out.println(hashCode);
        int hashCode2 =0;
        char[] c =  str.toCharArray();
        for(int i=0; i<c.length; i++) {
            hashCode2 += c[i];
        }
        System.out.println(hashCode2);

        for(int i=0; i<c.length; i++) {
            hashCode2 = c[i];
            System.out.println(hashCode2);
        }

    }
}
