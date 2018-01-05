import java.util.ArrayList;
import java.util.List;

public class PizzaStyle {


    private String pizzaName;
    private String crustName ;
    private String size;
    private List<String> toppings = new ArrayList<String>();



    @Override
    public String toString() {
        return
                "pizzaName='" + getPizzaName() + '\'' +
                ", crustName='" + getCrustName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", toppings=" + getToppings() +
                '}';
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
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

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
