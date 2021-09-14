package DesertIsland;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] options = new String[10];

        System.out.println("Nævn 10 ting du vil tage med til en øde ø: ");
        for (int i = 0; i < 10;i++){
            options[i] = input.nextLine();
            }

        for (int i = 0; i < options.length; i++) {
            System.out.print(options[i] + ", ");
        }

    }
}
