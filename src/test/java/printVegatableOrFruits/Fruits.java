package printVegatableOrFruits;

import java.util.List;
import java.util.stream.Collectors;

public class Fruits extends Harvest{

    public Fruits(List<String> harvest) {
        this.harvest = harvest;
    }

    @Override
    List<String> choose() {
        return harvest
                .stream()
                .filter(item -> fruitsList.contains(item))
                .collect(Collectors.toList());
    }
}
