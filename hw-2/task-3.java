import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на ноль: " + ex);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null: " + ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера: " + ex);
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
