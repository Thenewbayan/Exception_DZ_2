import java.util.Scanner;

// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с 
// сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить 
// результат деления.
// Обратите внимание, что в обоих задачах используются собственные исключения, 
// которые наследуются от класса Exception. Это позволяет нам определить специфическую причину 
// ошибки и передать информацию об ошибке для последующей обработки.

public class Task2 {
    public double division(double a, double b) {
        //создаем свое исключение если оно возникнет в методе9
        if (b == 0)
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        return a / b;

    }

    class DivisionByZeroException extends RuntimeException {//создаем свой эксепшн

        public DivisionByZeroException(String message) {
            super(message);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2 result = new Task2();
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        //в блоке трай кэч проводим проверку и обработку если оно возникает, в методе описание, а проброс здесь
        //вроде так
        try {
            System.out.println("Result: "+result.division(a, b)); 
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
