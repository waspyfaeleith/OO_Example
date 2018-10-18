public class EdiblePlant extends Plant {
    private double nutritionalValue;

    public EdiblePlant(String name, double nutritionalValue) {
        super(name);
        this.nutritionalValue = nutritionalValue;
    }

    public double getNutritionalValue() {
        return nutritionalValue;
    }

    public double effectOnWeight() {
        return nutritionalValue / 100;
    }
}
