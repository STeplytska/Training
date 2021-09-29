import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Testrunner {

    final List<Food> fruitsAndVegetable = Arrays.asList(new Fruit("Apple", 12), new Vegetable("Pea", 23),
            new Vegetable("corn", 54), new Vegetable("spinach", 40), new Fruit("strawberry", 89),
            new Fruit("peach", 27), new Fruit("plum", 9323), new Fruit("raspberries", 2323),
            new Vegetable("cabbage", 33), new Vegetable("Tomato", 44), new Vegetable("pepper", 444), new Vegetable("Onion", 444),
            new Vegetable("carrot", 66), new Vegetable("Cherry", 120), null);

    @Test
    void testFruitMixTask() {
        fruitsAndVegetable.forEach(System.out::println);
        System.out.println("Result : " + getApple(fruitsAndVegetable));
    }

    private String getApple(final List<Food> fruitsAndVegetable) {
        return fruitsAndVegetable
                .stream()
                .filter(f -> "Apple".equalsIgnoreCase(f.getName()))
                .findFirst()
                .map(Food::getName)
                .orElseThrow(() -> new IllegalStateException("ooo not have apple"));
    }

    @Test
    void testFruitTask() {
        System.out.println("List fruits: \n" + getFruits(fruitsAndVegetable));
    }

    @Test
    void testVegetableTask() {
        System.out.println("List vegetable: \n");
        getVegetable(fruitsAndVegetable).forEach(System.out::println);
    }

    private List<String> getFruits(final List<Food> fruitsAndVegetable) {
        return fruitsAndVegetable
                .stream()
                .filter(Objects::nonNull)
                .filter(f -> "Fruit".equalsIgnoreCase(f.getType()))
                .map(Food::getName)
                .collect(Collectors.toList());

//        if(result.isEmpty()) {
//            throw  new IllegalStateException("ooo not have apple");
//        }
    }

    private List<String> getVegetable(final List<Food> fruitsAndVegetable) {
        return fruitsAndVegetable
                .stream()
                .filter(Objects::nonNull)
                .filter(f -> "Vegetable".equalsIgnoreCase(f.getType()))
                .map(Food::getName)
                .collect(Collectors.toList());
    }
}