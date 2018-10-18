public class Pizza {
    private String topping;
    private int calories;
    private double nutritionalValue;

    public Pizza(String topping, int calories, double nutritionalValue) {
        this.topping = topping;
        this.calories = calories;
        this.nutritionalValue = nutritionalValue;
    }

    public String getTopping() {
        return topping;
    }

    public int getCalories() {
        return calories;
    }

    public double getNutritionalValue() {
        return this.nutritionalValue;
    }

    public double effectOnWeight() {
        return (this.calories * nutritionalValue) / 100;
    }
}
