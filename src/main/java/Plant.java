public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String grow() {
        return "getting bigger...";
    }

    public String getName() {
        return name;
    }
}
