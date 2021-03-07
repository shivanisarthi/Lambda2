import java.util.function.Function;

public class LongIntegerImpl implements LongInteger{

      public static Function<Long,Long> nextEven = n -> apply(n);

    private static Long apply(Long n) {
        return (n % 2 == 0 ? n + 2 : n + 1);
    }



}
