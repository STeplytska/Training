package printVegatableOrFruits;

import java.util.List;
import java.util.stream.Collectors;

public class Vegetable extends Harvest{

    public Vegetable(List<String> harvest) {
        this.harvest = harvest;
    }

    @Override
    public List<String> choose() {
        return harvest
                .stream()
                .filter(item -> !fruitsList.contains(item))
                .collect(Collectors.toList());
    }
}
