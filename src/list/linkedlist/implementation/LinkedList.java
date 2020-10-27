package list.linkedlist.implementation;

public class LinkedList {
        // 첫번째 노드를 가리키는 필드
        private Node head;
        private Node tail;
        private int size = 0;

        public LinkedList() {
            head = null;
        }

        //Node 삽입
        public void insertNode(Node preNode, Object data) {
            Node newNode = new Node(data); //새로운 노드 생성

            newNode.next = preNode.next;

            preNode.next = newNode;

        }

        public void insertNode(Object data) {
            Node newNode = new Node(data);
            if (head == null) {
                this.head = newNode;
            } else {
                Node tempNode = head;

                while (tempNode.next != null) {
                    tempNode = tempNode.next;
                }

                tempNode.next = newNode;
            }
        }

        public void deleteNode(Object data) {
                Node preNode = head;
                Node tempNode = head.next;

                if(data.equals(preNode.getData())) {
                    head = preNode.next;
                    preNode.next = null;
                } else {
                    while(tempNode != null) {
                        if(data.equals(tempNode.getData())) {
                            if(tempNode.next == null) {
                                preNode.next = null;
                            } else {
                                preNode.next = tempNode.next;
                                tempNode.next = null;
                            }
                            break;
                        } else {
                            preNode = tempNode;
                            tempNode = tempNode.next;
                        }
                    }
                }
            }

        public void deleteNode(){
                Node preNode;
                Node tempNode;

                if(head == null) {
                    return;
                }

                if(head.next == null) {
                    head = null;
                } else {
                    preNode = head;
                    tempNode = head.next;

                    while(tempNode.next != null) {
                        preNode = tempNode;
                        tempNode = tempNode.next;
                    }

                    preNode.next = null;

                }
            }

        public Node searchNode(Object data) {
            Node tempNode = this.head;

            while(tempNode != null) {
                if(data.equals(tempNode.getData())) {
                    return tempNode;
                } else {
                    tempNode = tempNode.next;
                }
            }

            return tempNode;
            }

        public void reverseList() {
            Node nextNode = head;
            Node currentNode = null;
            Node preNode = null;

            while(nextNode != null) {
                preNode = currentNode;
                currentNode = nextNode;
                nextNode = nextNode.next;
                currentNode.next = preNode;
            }
            head = currentNode;

            }

    // 연결 리스트에 저장된 모든 데이터를 출력
    public void printList() {
        Node tempNode = this.head;    // tempNode에 head가 가리키는 첫번째 노드를 할당

        // tempNode가 null이 아닐 때까지 반복하여 출력
        while(tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.next;    // temp 노드에 다음 노드(tempNode.link) 할당.
        }
        System.out.println();
    }


    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            String str = "wed";

            list.insertNode("sun");
            list.insertNode("mon");
            list.insertNode("tue");
            list.insertNode("wed");
            list.insertNode("thu");
            list.insertNode("fri");
            list.insertNode("sat");
            list.printList();

        System.out.println(list.searchNode(str).getData());
        list.printList();

        str = "sun";


        list.deleteNode(list.searchNode(str).getData());
        list.printList();

        list.reverseList();
        list.printList();
    }


        private class Node{
            // 데이터가 저장될 필드
            private Object data;
            // 다음 노드를 가리키는 필드
            private Node next;

            public Node(Object input) {
                this.data = input;
                this.next = null;
            }

            public Node(Object input, Node next) {
                this.data = input;
                this.next = next;
            }

            public Object getData() {
                return this.data;
            }




            // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
            public String toString(){
                return String.valueOf(this.data);
        }
    }

}



