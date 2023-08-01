import java.util.Random;
import java.util.Scanner;
public class Arrays3{
    public static void main(String[]args){
        Random gerador = new Random(123);
        if(Random.nextBoolean()) {
            System.out.println("0");
        }
        if(Random.nextBoolean()) {
            System.out.println("5");
        }
        if(Random.nextBoolean()) {
            System.out.println("O");
        }
}
}