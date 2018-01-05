import java.util.ArrayList;
import java.util.List;

public class Base implements BakableFood {

    private String crustName;
    private String size;

    private Flour flour;
    private Water water;
    private Oil oil;
    private Salt salt;

    private List<Topping> toppings = new ArrayList<Topping>();


    public void applySauce(Sauce sauce)
    {
        System.out.println("Base with applying sauce is ready");
    }


    void addTopping(Topping t) {

        getToppings().add(t);
        System.out.println("base with applying toppings is ready"+t);
    //    System.out.println("topping array "+toppings);

    }


    @Override
    public BakedFood bake() {

        Pizza pizza = new Pizza();
        pizza.setBase(this);

        return pizza;

    }

    @Override
    public String toString() {
        return "Base{" +
                "crustName='" + getCrustName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", flour=" + getFlour() +
                ", water=" + getWater() +
                ", oil=" + getOil() +
                ", salt=" + getSalt() +
                ", toppings=" + getToppings() +
                '}';
    }

    public String getCrustName() {
        return crustName;
    }

    public void setCrustName(String crustName) {
        this.crustName = crustName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public Salt getSalt() {
        return salt;
    }

    public void setSalt(Salt salt) {
        this.salt = salt;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
