package printVegatableOrFruits;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fruits {

    List<String> fruits;
    List<String> harvest;
    List<String> fruitsList = new FruitsList().getFruitsList();

    public Fruits(List<String> harvest) {
        this.harvest = harvest;
    }

    public List<String> getFruits() {
        return this.chooseFruits();
    }

    public List<String> chooseFruits(){
        return fruits = harvest
                            .stream()
                            .filter(item -> fruitsList.toString().contains(item.toLowerCase()))
                            .collect(Collectors.toList());
    }
}
