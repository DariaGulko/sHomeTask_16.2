package builder;

import iceCream.IceCream;
import iceCream.Sherbet;

/**
 * Created by Dariya on 29.11.2015.
 */
public class SherbetBuilder extends IceCreamBuilder {
    @Override
    void buildTaste() {
        iceCream.setTaste("Fruits");
    }

    @Override
    void buildShape() {
        iceCream.setShape("Cone");
    }

    @Override
    void buildColor() {
        int random = (int) (Math.random() * 200);
        iceCream.setColor(random);
    }

    @Override
    void buildWeight() {
        int random = (int) (Math.random() * 150);
        iceCream.setWeight(random);
    }


    @Override
    public void buildColor(int color) {
        super.buildColor(color);
    }

    @Override
    void buildSize() {
        int random = (int) (Math.random() * 5);
        iceCream.setSize(random);
    }

    @Override
    public void buildTaste(String taste) {
        super.buildTaste(taste);
    }

    @Override
    public void buildShape(String shape) {
        super.buildShape(shape);
    }

    @Override
    public void buildWeight(int weight) {
        super.buildWeight(weight);
    }

    @Override
    public void buildSize(int size) {
        super.buildSize(size);
    }
}
