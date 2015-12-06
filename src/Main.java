import builder.*;
import children.Children;
import iceCream.*;

/**
 * Created by Dariya on 29.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Children child1 = new Children();
        child1.childData();
       // child1.iWant();

        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        IceCream iceCream1 = iceCreamFactory.getIceCream(TypeOfIceCream.valueOf("ORGANIC"));
        child1.setIceCream(iceCream1);
        System.out.println("child1"+iceCream1.toString());

        Children child2 = new Children();
        child2.childData();
        IceCream iceCream2 = iceCreamFactory.getIceCream(TypeOfIceCream.valueOf("ICE_POP"));
        child2.setIceCream(iceCream2);

        System.out.println("child2"+iceCream2.toString());

        System.out.println("chage: ");
        child1.change(child2);
        //System.out.println("1st ice-cream: " + iceCream1);
    }
}
