package printVegatableOrFruits;

import java.util.List;

abstract class Harvest {

    List<String> harvest;
    List<String> fruitsList = new FruitsList().getFruitsList();

    public List<String> getHarvest() {
        return harvest;
    }

    abstract List<String> choose();
}
