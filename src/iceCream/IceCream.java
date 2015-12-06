package iceCream;

/**
 * Created by Dariya on 29.11.2015.
 */
public class IceCream {
    private String taste;
    private String shape;

    private int color;
    private int size;
    private int weight;

    public IceCream() {
        this.taste = taste;
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public String getShape() {
        return shape;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "taste='" + taste + '\'' +
                ", shape='" + shape + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}