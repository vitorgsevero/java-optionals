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

        //Optional empty
        final Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        final Optional<Object> hello = Optional.ofNullable(null);
        
        //orElse
        final Object orElse = empty.orElse("If it's empty this message should be printed");
        System.out.println(orElse);

    }

    public static Optional<Integer> numberConverter(String numberStr){
        final Integer value = Integer.valueOf(numberStr);
        return Optional.of(value);
//        return Optional.empty();
    }




}
