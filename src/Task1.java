import java.util.Scanner;

// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, 
// является ли оно положительным. Если число отрицательное или равно нулю, 
// программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".

public class Task1 {

    public static void InvalidNumberException(int number) {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number <= 0) {
            try {
                InvalidNumberException(number);
            } catch (InvalidNumberException e) {
                System.out.println("Ошибка: "+ e.getMessage());
            }
        }
        else{
        System.out.println("Число корректное");}

    }

}
