public class Chef extends Person{


    private Flour flour = new Flour();
    private Water water = new Water();
    private Sauce sauce = new Sauce();
    private Oil oil = new Oil();
    private Salt salt = new Salt();

    private String chefName;

    private Dough prepareDough(Salt salt, Flour flour , Water water , Oil oil)
    {

        System.out.println("Dough is ready ");
        return new Dough();
    }

    private Base makeCrust(Dough dough)
    {
        System.out.println("Base/crust is ready");
        return new Base();
    }



    public Pizza makePizza(PizzaStyle pizzaStyle)
    {


        getFlour().setName("Corn flour");
        getWater().setWater("200 ml hot water");
        getOil().setName(" 50 ml vegetable oil");
        getSalt().setSalt("salt");


        Dough dough=prepareDough(getSalt(), getFlour(), getWater(), getOil());

        Base crust=makeCrust(dough);


        crust.setFlour(getFlour());
        crust.setWater(getWater());
        crust.setOil(getOil());
        crust.setSalt(getSalt());
        crust.setCrustName(pizzaStyle.getCrustName());
        crust.setSize(pizzaStyle.getSize());

        crust.applySauce(getSauce());


        for (String topping: pizzaStyle.getToppings())
        {
            crust.addTopping(new Topping(topping));
        }


        BakedFood bakedFood = bake(crust);

        Pizza pizza = (Pizza) bakedFood;
        pizza.setName(pizzaStyle.getPizzaName());

        return pizza;
    }

    private BakedFood bake(Base crust) {

        Oven oven = new Oven();

        oven.powerOn();
        oven.put(crust);
        oven.setTemperature(250);
        oven.setTime(10);
        oven.poweroff();

        return oven.take();
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

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
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

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }
}
