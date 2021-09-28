package printVegatableOrFruits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class VegetableFilter {

    List<String> fruitsAndVegetable = Arrays.asList("Apple", "Pea", "corn", "spinach", "strawberry", "peach", "plum", "raspberries", "cabbage",
            "Tomato", "pepper", "Onion", "carrot");
    @Test
    void printFruits (){
        Fruits fruits = new Fruits(fruitsAndVegetable);
        System.out.printf("\n \n List fruits: \n %s", fruits.getFruits());
    }

    @Test
    void printVegetable (){
        Fruits vegetables = new GetVegetable(fruitsAndVegetable);
        System.out.printf("\n List vegetable: \n %s", vegetables.getFruits());
    }
}
