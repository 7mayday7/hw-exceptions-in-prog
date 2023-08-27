import java.util.Scanner;

public class EmptyStringExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                throw new EmptyStringException("Пустые строки вводить нельзя!");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        } catch (EmptyStringException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}
