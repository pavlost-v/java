package task3;

public class helper {
    private int var;
    private int sum;
    public helper(int x, int s) {
        this.var = x;
        this.sum = s;
    }
    public int getVar() {
        sum += var;
        return var;
    }
    public int getSum(){
        return sum;
    }
    public void setSum(int t) {
        sum += t;
    }
}
