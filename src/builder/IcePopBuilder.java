package builder;

import iceCream.IceCream;
import iceCream.IcePop;

import java.util.Random;

/**
 * Created by Dariya on 29.11.2015.
 */
public class IcePopBuilder extends IceCreamBuilder {

    @Override
    void buildTaste() {
        iceCream.setTaste("Kiwi");
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

    @Override
    void buildShape() {
        iceCream.setShape("Cone");
    }

    @Override
    public void buildColor(int color) {
        super.buildColor(color);
    }

    @Override
    void buildColor() {
        int random = (int) (Math.random()*100);
        iceCream.setColor(random);
    }
    @Override
    void buildWeight() {
        int random=(int)(Math.random()*100);
        iceCream.setWeight(random);
    }

    @Override
    void buildSize() {
        int random=(int)(Math.random()*5);
        iceCream.setSize(random);
    }
}
