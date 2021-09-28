import lombok.AllArgsConstructor;
import lombok.Getter;

        @AllArgsConstructor
        @Getter
public class Food {
        private final String name;
        private final String type;
        private final int price;

        @Override
            public String toString(){
            return name;
        }
}
