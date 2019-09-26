import java.util.Objects;

public class Ex6Item {
    private String description;
    private double price;

    public Ex6Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof Ex6Item)) {
            return false;
        }
        Ex6Item otherItem = (Ex6Item) other;
        return Objects.equals(description, otherItem.description) &&
                price == otherItem.price;
    }
}
