package builder;

import iceCream.IceCream;

/**
 * Created by Dariya on 30.11.2015.
 */
public class IceCreamFactory {
    public IceCream getIceCream(TypeOfIceCream typeOfIceCream) {
        IceCreamBuilder builder = typeOfIceCream.getBuilder();
        builder.createIceCream();
        builder.buildColor();
        builder.buildShape();
        builder.buildSize();
        builder.buildTaste();
        builder.buildWeight();
        return builder.getIceCream();
    }

    public IceCream getIceCream(TypeOfIceCream typeOfIceCream, int color,String shape,int size,String taste, int weight) {
        IceCreamBuilder builder = typeOfIceCream.getBuilder();
        builder.createIceCream();
        builder.buildColor(color);
        builder.buildShape(shape);
        builder.buildSize(size);
        builder.buildTaste(taste);
        builder.buildWeight(weight);
        return builder.getIceCream();
    }
}
