package printVegatableOrFruits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class VegetableFilter {

    List<String> fruitsAndVegetable = Arrays.asList("Apple", "Pea", "corn", "spinach", "strawberry", "peach", "plum", "raspberries", "cabbage",
            "Tomato", "pepper", "Onion", "carrot");
    @Test
    void printFruits (){
        Harvest fruits = new Fruits(fruitsAndVegetable);
        System.out.printf("\n \n List fruits: \n %s", fruits.choose());
    }

    @Test
    void printVegetable (){
        Harvest vegetables = new Vegetable(fruitsAndVegetable);
        System.out.printf("\n List vegetable: \n %s", vegetables.choose());
    }
}
