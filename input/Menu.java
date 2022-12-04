package input;

import utils.Strings;

import java.util.Scanner;

public class Menu {

    public static int MenuSelector() {

        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println(Strings.WELCOME_GREETINGS);
        System.out.println(Strings.OPTION_SELECT);
        System.out.println(Strings.DIRECT_OPTION);
        System.out.println(Strings.XML_OPTION);

        selection = input.nextInt();
        return selection;

    }
}
