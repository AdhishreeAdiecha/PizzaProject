public class Salt {

    private String salt;

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    @Override
    public String toString() {
        return "Salt{" +
                "salt='" + getSalt() + '\'' +
                '}';
    }
}
