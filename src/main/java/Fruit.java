import java.util.List;

public class Fruit extends Food {

    public Fruit(String name, int price) {
        super(name,"Fruit", price);
    }

    private String getFruits(final List<Food> fruitsAndVegetable) {
        return fruitsAndVegetable
                .stream()
                .filter(f -> f instanceof Fruit)
                .findFirst()
                .map(Food::getName)
                .orElseThrow(()-> new IllegalStateException("ooo not have apple"));
    }
}
