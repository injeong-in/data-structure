//package sec02.Search;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//public class BFSearch {
//
//
//
//
//}
//
//class Graph {
//    class Node {
//        int data;
//        boolean marked;
//        LinkedList<Node> adjacent;
//
//        Node(int data) {
//            this.data = data;
//            this.marked = false;
//            adjacent = new LinkedList<>();
//        }
//    }
//
//    //그래프 만들기
//    Node[] nodes;
//    public Graph(int size) {
//        nodes = new Node[size];
//        for (int i = 0; i < size; i++) {
//            nodes[i] = new Node(i);
//        }
//}
//    //두 노드의 관계를 지어주는 함수
//    void addEdge(int i1, int i2) {
//        Node n1 = nodes[i1];
//        Node n2 = nodes[i2];
//        if(!n1.adjacent.contains(n2)) {
//            n1.adjacent.add(n2);
//        }
//        if(!n2.adjacent.contains(n1)) {
//            n2.adjacent.add(n1);
//        }
//    }
//    void dfs() {
//        dfs(0);
//    }
//
//    void dfs(int index) {
//        Node root = nodes[index];
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        root.marked = true;
//        while(!stack.isEmpty()) {
//            Node r = stack.pop();
//            for(Node n : r.adjacent) {
//                if(n.marked == false) {
//                    n.marked = true;
//                    stack.push(n);
//                }
//            }
//            visit(r);
//        }
//    }
//
//    void bfs() {
//        bfs(0);
//    }
//
//    void bfs(int index) {
//        Node root = nodes[index];
//        Queue<Node> queue = new Queue<Node>();
//        queue.enqueue(root);
//        root.marked = true;
//        while(!queue.isEmpty()) {
//            Node r = queue.dequeue();
//            for(Node n : r.adjacent) {
//                if(n.marked == false) {
//                    n.marked = true;
//                    queue.enqueue(n);
//                }
//            }
//            visit(r);
//        }
//    }
//
//
//
//    void visit(Node n) {
//        System.out.println(n.data + " ");
//        }
//    }
//
