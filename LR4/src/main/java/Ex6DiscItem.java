public class Ex6DiscItem extends Ex6Item {
    private double discount;

    public Ex6DiscItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }
    public boolean equals(Object other) {
        if (other instanceof Ex6DiscItem) {
            return super.equals(other) && discount == ((Ex6DiscItem) other).discount;
        }
        else if (other instanceof Ex6Item) {
            return super.equals(other);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Ex6DiscItem x = new Ex6DiscItem("item", 10, 5);

        Ex6Item y = new Ex6Item("item", 10);

        Ex6DiscItem z = new Ex6DiscItem("item", 10, 10);

        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
    }
}
