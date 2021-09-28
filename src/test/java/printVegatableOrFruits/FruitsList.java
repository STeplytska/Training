package printVegatableOrFruits;

import java.util.Arrays;
import java.util.List;

public class FruitsList {

    List<String> fruitsList = Arrays.asList("apple", "strawberry", "peach", "banana", "plum", "apricot", "raspberries");

    public FruitsList() {
        this.fruitsList = fruitsList;
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }
}
