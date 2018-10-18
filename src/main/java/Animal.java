public abstract class Animal {

    private String name;
    private String species;
    private double weight;

    public Animal(String name, String species, int weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public String sleep() {
        return "ZZZZ...";
    }

    public void changeWeight(double amount) {
        this.weight += amount;
    }
}
