package task7;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
      // ваш код
        for (String it : items){
            String[] i = it.split(", ");
            System.out.printf("%-10s %-7s %-8s", i[0],i[1],i[2]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}