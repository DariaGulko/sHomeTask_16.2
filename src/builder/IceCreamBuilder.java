package builder;

import iceCream.IceCream;

/**
 * Created by Dariya on 30.11.2015.
 */
public abstract class IceCreamBuilder {
    protected IceCream iceCream;

    public IceCream getIceCream() {
        return iceCream;
    }

    public void createIceCream() {
        iceCream = new IceCream();
    }

    abstract void buildTaste();
    public void buildTaste(String taste){iceCream.setTaste(taste);};

    abstract void buildShape();
    public void buildShape(String shape){iceCream.setShape(shape);}

    abstract void buildColor();
    public void buildColor(int color) {
        iceCream.setColor(color);
    }

    abstract void buildWeight();
    public void buildWeight(int weight){iceCream.setWeight(weight);};

    abstract void buildSize();
    public void buildSize(int size){iceCream.setSize(size);}

}
