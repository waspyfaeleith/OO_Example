import java.util.ArrayList;

public class Carnivore extends Animal {

    private ArrayList<Prey> stomachContents;

    public Carnivore(String name, String species, int weight) {
        super(name, species, weight);
        this.stomachContents = new ArrayList<>();
    }

    public void eat(Prey food) {
        this.stomachContents.add(food);
        this.changeWeight(food.weightIncrease());
    }

    public int numberOfItemsInStomach() {
        return this.stomachContents.size();
    }

}
