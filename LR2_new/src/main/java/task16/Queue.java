package task16;

public class Queue {
    private static class Node {
        String text;
        Node next;
        public Node (String str) {
            text = str;
        }
    }
    private Node head;
    private Node tail;

    public void add(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }
    public void remove() {
        if (head != null) {
            head = head.next;
            if (head == tail) {
                tail = null;
            }
        }
    }
    public void print() {
        Node t = head;
        while (t != null) {
            System.out.println(t.text);
            t = t.next;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(new Node("str1"));
        q.add(new Node("str2"));
        q.print();
        q.remove();
        q.print();
    }
}
