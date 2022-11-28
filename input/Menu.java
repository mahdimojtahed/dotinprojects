package input;

import java.util.Scanner;

public class Menu {
    public static int MenuSelector() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello Dear DOTIN Costumer :)");
        System.out.println("how do you want to enter your data ?");
        System.out.println("1 - Direct Input");
        System.out.println("2 - XML File");
        selection = input.nextInt();



        return selection;
    }

}
