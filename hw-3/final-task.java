import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите данные (Фамилия Имя Отчество Дата_рождения Номер_телефона Пол): ");
            String input = scanner.nextLine();
            
            String[] data = input.split(" ");
            if (data.length != 6) {
                throw new InvalidDataException("Неверное количество данных");
            }
            
            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];
            
            if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}") ||
                !phoneNumber.matches("\\d+") ||
                (gender.length() != 1 || !"mf".contains(gender))) {
                throw new InvalidDataException("Неверный формат данных");
            }
            
            String fileName = surname + ".txt";
            String userData = surname + firstName + middleName + birthDate + " " + phoneNumber + gender;

            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(userData + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (InvalidDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
