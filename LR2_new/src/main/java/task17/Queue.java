package task17;

public class Queue {
    private static class Node {
        String text;
        Node next;

        public Node(String str) {
            text = str;
        }
    }

    public class Iterator {
        Node curNode;

//        public Iterator() {
//            curNode = head;
//        }

        public boolean hasNext() {
            return curNode != null;
        }

        public Node next() {
            Node tmp = curNode;
            if (curNode != null) {
                curNode = curNode.next;
            }
            return tmp;
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
    public Iterator crIt() {
        Iterator it = new Iterator();
        it.curNode = head;
        return it;
    }


    public void add(String str) {
        Node n = new Node(str);
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
        Iterator itr = iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().text);
        }
    }
    private Node head;
    private Node tail;

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add("str");
        q.add("str");
        q.print();

        q.remove();
        q.print();



    }
}
