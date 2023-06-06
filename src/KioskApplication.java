import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://github.com/thesun4sky/ShakeShackBurger  튜터님 예시용 코드
public class KioskApplication {
    static MenuList menuList = new MenuList();
    public static void main(String[] args) {
        MenuList menuList = new MenuList();
        displayMainMenu();
    }

    private static void displayMainMenu(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");

        System.out.println("[ SHAKESHACK MENU ]");
        List<Menu> mainMenus = menuList.getMenus("Main");
        int nextNum = printMenu(mainMenus, 1);

        System.out.println("[ ORDER MENU ]");
        List<Menu> orderMenus =menuList.getMenus("Order");
        printMenu(orderMenus, nextNum);

        handleMainMenuInput();

    }
}
