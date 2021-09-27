import org.junit.jupiter.api.Test;

import java.util.*;

class Vegetable {

    @Test
    void testRunner() {

        List<String> frutitsAndVegetablle = Arrays.asList("Apple", "Pea", "corn", "spinach", "strawberry", "peach", "plum", "raspberries", "cabbage",
                "Tomato", "pepper", "Onion", "carrot");
        List<String> fruitsList = Arrays.asList("apple", "strawberry", "peach", "banana", "plum", "apricot", "raspberries");
        List<String> vegetable = new ArrayList<>();
        List<String> fruits = new ArrayList<>();
        List<String> fruits2 = new ArrayList<>();

        frutitsAndVegetablle
                .forEach(listItem-> {
                    fruitsList
                            .forEach(fruitItem ->{
                        if(listItem.toLowerCase().equals(fruitItem)) fruits.add(listItem);
                    });
                });
        System.out.println("FRUITS list:");
        System.out.println(fruits);


        //forEach not support "break" so for therefore, to split into two arrays, so that values not repeat, there's using method FOR
        for (String s : frutitsAndVegetablle) {
            int numberFruits = 0;
            for (String value : fruitsList) {
                if (s.toLowerCase().equals(value)) {
                    fruits2.add(s);
                    numberFruits = 1;
                    break;
                }
            }
            if (numberFruits != 1) vegetable.add(s);
        }
         System.out.println("Lists fruits and vegetable:");
            System.out.println(fruits2);
            System.out.println(vegetable);

        ArrayList<String> fruit3 = new ArrayList<>();
        ArrayList<String> vegetable2 = new ArrayList<>();

        Map<String, String> frutitsAndVegetablleMap = new HashMap<>();
        frutitsAndVegetablleMap.put("Apple", "fruit");
        frutitsAndVegetablleMap.put("Pea", "vegetable");
        frutitsAndVegetablleMap.put("strawberry", "fruit");

        frutitsAndVegetablleMap.forEach((key,value)->{
            if(value == "fruit") fruit3.add(key);
            else vegetable2.add(key);
        });

        System.out.println("List fruits and vegetable from map:");
        System.out.println(fruit3);
        System.out.println(vegetable2);
    }
}
