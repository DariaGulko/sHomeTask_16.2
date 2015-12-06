package builder;


/**
 * Created by Dariya on 30.11.2015.
 */
public enum TypeOfIceCream {

    ICE_POP {
        {
            this.builder=new IcePopBuilder();
        }
    },
    ORGANIC{
        {
         this.builder=new OrganicBuilder();
        }
    },
    SHERBET{
        {
            this.builder=new SherbetBuilder();
        }
    },
    SUNDAE{
        {
            this.builder=new SundaeBuilder();
        }
    };

    protected IceCreamBuilder builder;
    public IceCreamBuilder getBuilder(){
        return builder;
    }
}
