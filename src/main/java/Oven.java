public class Oven {

    private BakedFood bakedFood;

    public void put(BakableFood b)
    {
        System.out.println("Base inside oven");
        setBakedFood(b.bake());
    }

    public BakedFood take()
    {
        System.out.println("Take baked food out ");
        return getBakedFood();
    }

    public void setTime(int time)
    {
        System.out.println("Set time "+time+" minutes ");
    }

    public void setTemperature(int temperature)
    {
        System.out.println("Set temperature"+temperature+" C");
    }

    public void powerOn()
    {
        System.out.println("Oven - power on");
    }

    public void poweroff()
    {
        System.out.println("Oven - power off");
    }

    public BakedFood getBakedFood() {
        return bakedFood;
    }

    public void setBakedFood(BakedFood bakedFood) {
        this.bakedFood = bakedFood;
    }
}
