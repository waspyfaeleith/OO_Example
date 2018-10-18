public class EdiblePlant extends Plant {
    private int calories;
    private double nutritionalValue;

    public EdiblePlant(String name, int calories, double nutritionalValue) {
        super(name);
        this.calories = calories;
        this.nutritionalValue = nutritionalValue;
    }

    public int getCalories() {
        return calories;
    }

    public double getNutritionalValue() {
        return nutritionalValue;
    }

    public double weightIncrease() {
        return (this.calories * nutritionalValue) / 1000;
    }

}
