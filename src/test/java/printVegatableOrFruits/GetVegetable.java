package printVegatableOrFruits;

import java.util.List;
import java.util.stream.Collectors;

public class GetVegetable extends Fruits{
    List<String> vegetables;

    public GetVegetable(List<String> harvest) {
        super(harvest);
    }

    @Override
    public List<String> chooseFruits() {
        return vegetables = harvest
                .stream()
                .filter(item -> !fruitsList.toString().contains(item.toLowerCase()))
                .collect(Collectors.toList());
    }
}
