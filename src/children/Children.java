package children;

import builder.IceCreamFactory;
import builder.TypeOfIceCream;
import iceCream.IceCream;

import java.util.Scanner;

/**
 * Created by Dariya on 29.11.2015.
 */
public class Children {
    private String name;
    private String wTaste;
    private String wShape;

    private int wColor;
    private int wSize;
    private int wWeight;
    private TypeOfIceCream wTypeOfIceCream;

    public Children setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
        return this;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    private IceCream iceCream;

    Scanner in = new Scanner(System.in);

    public void childData() {
        System.out.println("Enter your name");
        name = in.nextLine();
    }

    public void iWant() {
        System.out.println(name + ",what taste of ice-cream do you want?");
        wTaste = in.nextLine();
        System.out.println(name + ",what shape of ice-cream do you want?");
        wShape = in.nextLine();
        System.out.println(name + ",what color of ice-cream do you want?");
        wColor = in.nextInt();
        System.out.println(name + ",what size of ice-cream do you want?");
        wSize = in.nextInt();
        System.out.println(name + ",what weight of ice-cream do you want?");
        wWeight = in.nextInt();

        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        IceCream iceCream = iceCreamFactory.getIceCream(TypeOfIceCream.valueOf("ICE_POP"), wColor, wShape, wSize, wTaste, wWeight);
        System.out.println("Your ice-cream is ready! Bon appetite!" + iceCream);
    }

    public void change(Children child) {
        IceCream iceCream1 = child.getIceCream();
        IceCream iceCream2 = getIceCream();
        child.setIceCream(iceCream2);
        setIceCream(iceCream1);
        System.out.println("Its a new " + name + "'s ice-cream - " + iceCream);
        System.out.println("Its a new " + child.name + "'s ice-cream - " + child.iceCream);

    }
}
