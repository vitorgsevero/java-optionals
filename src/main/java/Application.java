import java.util.Optional;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        String s = "1";
        Optional<Integer> number = numberConverter(s);
        //is present
        System.out.println(number.isPresent());
        //if present
        number.ifPresent(System.out::println);
        //or elseThrow
        numberConverter(s).orElseThrow(() -> new NullPointerException("Empty value."));

        //Using streams
        Stream.of(13, 2, 3)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static Optional<Integer> numberConverter(String numberStr){
        final Integer value = Integer.valueOf(numberStr);
        return Optional.of(value);
//        return Optional.empty();
    }
}
