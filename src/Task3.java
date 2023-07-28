import java.util.Scanner;

// Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с 
// сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с 
// сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с 
// сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с 
// сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

public class Task3 {
    public static void printSuccessfulResult(int a, int b, int c) {
        boolean flag = true;
        if (a > 100) {
            flag = false;
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0) {
            flag = false;
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a + b < 10) {
            flag = false;
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            flag = false;
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        if (flag) {
            System.out.println("Проверка пройдена успешно");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        try {
            printSuccessfulResult(a, b, c);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
//создаем наследников RuntimeException
class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class NumberOutOfRangeException extends RuntimeException {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends RuntimeException {
    public NumberSumException(String message) {
        super(message);
    }
}