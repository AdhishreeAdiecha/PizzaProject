public class Temp {


/*
    package pizza;

import java.util.List;

    public class Chef extends Person{


        Flour flour = new Flour();
        Water water = new Water();
        Sauce souce = new Sauce();
        Oven oven = new Oven();
        Oil oil = new Oil();
        Salt salt = new Salt();


        private Dough prepareDough(Salt s, Flour f , Water w , Oil o)
        {
            System.out.println("Dough is ready");
            return new Dough();
        }

        private Base makeCrust(Dough d)
        {
            System.out.println("Base/crust is ready");
            return new Base();
        }

        private BaseAppliedSauce applySauce(Base c , Sauce s)
        {
            System.out.println("Base with applying souce is ready");
            return new BaseAppliedSauce();
        }

        private BaseAppliedTopping addTopping(BaseAppliedSauce b, Topping t) {
            System.out.println("base with applying toppings is ready");
            return new BaseAppliedTopping();
        }

        public Pizza makePizza(PizzaStyle pizzaStyle)
        {
            Dough dough=prepareDough(salt,flour,water,oil);

            Base crust=makeCrust(dough);

            BaseAppliedSauce baseAppliedSouce=applySauce(crust,souce);

            for (String toppings:t) {
                baseAppliedSouce = addTopping(baseAppliedSouce, new Topping(toppings));
            }

            BakedFood bakedFood = bake((BaseAppliedTopping) baseAppliedSouce);

            return (Pizza) bakedFood;
        }

        private BakedFood bake(BaseAppliedTopping baseAppliedTopping) {
            oven.powerOn();
            oven.put(baseAppliedTopping);
            oven.setTemperature(250);
            oven.setTime(10);
            oven.poweroff();

            return oven.take();
        }
    }

*/

}
