import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дату.");
        String x = console.nextLine();
        if ((x.matches("^(0?[1-9]|[12][0-9]|3[01])([-./])(0?[1-9]|1[012])([-./])((1?9)\\d\\d|[2-9]\\d\\d\\d)$")))
            System.out.print("Дата корректна.");
        else System.out.print("Дата некорректна.");
    }
}