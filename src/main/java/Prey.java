public class Prey extends Animal {

    private int calories;
    private double nutritionalValue;

    public Prey(String name, String species, int weight, int calories, double nutritionalValue) {
        super(name, species, weight);
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
        return (this.calories / nutritionalValue) * 2;
    }
}
