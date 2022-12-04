import handlers.DirectOptionHandler;
import handlers.XMLOptionHandler;
import input.Menu;
import utils.Strings;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        int selection = Menu.MenuSelector();
        switch (selection) {
            case 1:
                try {
                    DirectOptionHandler.DirectEnterHandler();
                } catch (Exception e) {
                    System.out.println(Strings.CHECK_INPUT);
                }
                break;
            case 2:
                try {
                    XMLOptionHandler.XMLEnterHandler();
                } catch (FileNotFoundException exception) {
                    System.out.println(Strings.FILE_NOT_FOUND);
                } catch (Exception e) {
                    System.out.println(Strings.CHECK_NUMBER);
                }
                break;
        }
    }
}
