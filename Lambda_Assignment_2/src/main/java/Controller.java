import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        System.out.println("enter a long Integer");
        Scanner sc = new Scanner(System.in);
        Long longInput = sc.nextLong();
        Long nextEvenNumber = LongIntegerImpl.nextEven.apply(Long.valueOf(longInput));
        System.out.println("Next Even number => " +nextEvenNumber);
    }


}
