package pl.myprojects;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int userNumber = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Podaj liczbę: ");
            userNumber = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println("Wprowadzone dane nie są liczbą całkowitą typu int");
        }
        Divisors divisors = new Divisors();
        System.out.println(divisors.findDivisors(userNumber));
    }
}

