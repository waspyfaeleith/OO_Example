import java.util.ArrayList;

public class Herbivore extends Animal {
    private ArrayList<EdiblePlant> stomachContents;

    public Herbivore(String name, String species, int weight) {
        super(name, species, weight);
        this.stomachContents = new ArrayList<>();
    }

    public void eat(EdiblePlant food) {
        this.stomachContents.add(food);
        this.changeWeight(food.effectOnWeight());
    }

    public int numberOfItemsInStomach() {
        return this.stomachContents.size();
    }
}
