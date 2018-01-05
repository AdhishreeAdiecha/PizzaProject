public class Oil {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
