import java.util.InputMismatchException;
import java.util.Scanner;

public class FractionalInput {
    public static void main(String[] args) {
        float value = getInputValue();
        System.out.println("Вы ввели: " + value);
    }

    public static float getInputValue() {
        Scanner scanner = new Scanner(System.in);
        float inputValue = 0.0f;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Введите дробное число: ");
                inputValue = scanner.nextFloat();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
                scanner.nextLine(); 
            }
        }

        return inputValue;
    }
}
