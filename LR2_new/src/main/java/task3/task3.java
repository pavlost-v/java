package task3;

public class task3 {
    public static void main(String[] args) {
        helper h = new helper(1,0);
        System.out.println(h.getSum());
        int tmp = h.getVar();
        System.out.println(h.getSum());
        h.setSum(3);
    }
}


