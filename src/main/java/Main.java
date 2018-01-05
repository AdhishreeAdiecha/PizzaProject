public class Main {

    public static void main(String args[])
    {


        Chef chef = new Chef();
        chef.setName("Dominoz");

        Consumer consumer = new Consumer();
        consumer.setName("Adhishree");

        Pizza pizza = consumer.orderPizza(chef);

        consumer.eat(pizza);


    }
}
