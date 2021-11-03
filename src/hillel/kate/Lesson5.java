package hillel.kate;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int valve0 = 1;
        int valve1 = 1;
        int valve2;
        System.out.print(valve0 + " " + valve1 + " ");
        for (int i = 3; i < 11; i++) {
            valve2 = valve0 + valve1;
            System.out.print(valve2 + " ");
            valve0 = valve1;
            valve1 = valve2;
        }
        System.out.println();

        int i;
        int q;
        for ( i = 0; i < 9; i++) {
            for ( q = 0; q < 9; q++) {
                System.out.println(i * q + " \t " );
                System.out.println();
            }
        }
    }
}

class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите операцию: ");
        int x;
        String operation;
        int y;
        try (Scanner scanner = new Scanner(System.in)) {
            x = scanner.nextInt();
            operation = scanner.next();
            y = scanner.nextInt();
        }
        while(x != 0 && y != 0){

            if(operation.equals("+")){
                System.out.println(x + y);
            }
            else if(operation.equals("-")){
                System.out.println(x - y);
            }

            else if(operation.equals("*")){
                System.out.println(x * y);
            }

            else if(operation.equals("/")){
                System.out.println(x / y);
            }

            else if(operation.equals("%")){
                System.out.println(x % y + y);
            }
            else {
                System.out.println("Операция не выполняется.");
            }
            System.out.println("Продолжить работу?: ");

        }

    }



        }

