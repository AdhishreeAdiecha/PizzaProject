import java.util.ArrayList;
import java.util.List;

public class Consumer extends Person {


    Pizza orderPizza(Chef c)
    {
        PizzaStyle pizzaStyle = new PizzaStyle();

        List<String> toppings = new ArrayList<String>();
        System.out.println("Ordering Pizza");

        pizzaStyle.setPizzaName("5 pepper");
        pizzaStyle.setCrustName("thin crust");
        pizzaStyle.setSize("small");

        pizzaStyle.getToppings().add("cheese");
        pizzaStyle.getToppings().add("olives");
        pizzaStyle.getToppings().add("jalepano");

        System.out.println(pizzaStyle);
        Pizza pizza = c.makePizza(pizzaStyle);

        System.out.println("Pizza is ready to serve ");
        return pizza;
    }



    public void eat(Pizza pizza)

    {
        System.out.println(pizza);
    }


}
