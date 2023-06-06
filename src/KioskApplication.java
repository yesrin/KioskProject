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
    private static void displayBurgersMenu() {
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");

        System.out.println("[ Burgers MENU ]");
        List<Product> burgerItems = menuList.getMenuItems("Burgers");
        printMenuProduct(burgerItems);

        handleMenuProductInput(burgerItems);
    }
    private static void displayFrozenCustardMenu() {
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");

        System.out.println("[ Frozen Custard MENU ]");
        List<Product> frozenCustardItems = menuList.getMenuItems("Frozen Custard");
        printMenuProduct(frozenCustardItems);

        handleMenuProductInput(frozenCustardItems);
    }

    private static void displayDrinksMenu() {
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");

        System.out.println("[ Drinks MENU ]");
        List<Product> drinkItems =menuList.getMenuItems("Drinks");
        printMenuProduct(drinkItems);

        handleMenuProductInput(drinkItems);
    }
    private static void displayOrderMenu() {
        System.out.println("아래와 같이 주문 하시겠습니까?\n");
        menuList.displayCart();

        System.out.println("[ Total ]");
        System.out.println("W " + menuList.getTotalPrice() + "\n");

        System.out.println("1. 주문      2. 메뉴판");

        handleOrderMenuInput();
    }

    private static void displayBeerMenu() {
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");

        System.out.println("[ Beer MENU ]");
        List<Product> beerItems = menuList.getMenuItems("Beer");
        printMenuProduct(beerItems);

        handleMenuProductInput(beerItems);
    }
    private static void displayConfirmation(Product menuItem) {
        System.out.println(menuItem.name + "   | " + menuItem.price + " | " + menuItem.description);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        handleConfirmationInput(menuItem);
    }
    private static void displayOrderComplete() {
        int orderNumber = menuList.generateOrderNumber();
        System.out.println("주문이 완료되었습니다!\n");
        System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");

        resetCartAndDisplayMainMenu();
    }
    private static void resetCartAndDisplayMainMenu() {
        menuList.resetCart();
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        try {
            Thread.sleep(3000); // 3초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        displayMainMenu();
    }
    private static void handleConfirmationInput(Product menuItem) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            menuList.addToCart(menuItem);
            System.out.println("장바구니에 추가되었습니다.");
            displayMainMenu();
        } else if (input == 2) {
            displayMainMenu();
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            handleConfirmationInput(menuItem);
        }
    }
    private static void handleMainMenuInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                displayBurgersMenu();
                break;
            case 2:
                displayFrozenCustardMenu();
                break;
            case 3:
                displayDrinksMenu();
                break;
            case 4:
                displayBeerMenu();
                break;
            case 5:
                displayOrderMenu();
                break;
            case 6:
                handleCancelMenuInput();
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                handleMainMenuInput();
                break;
        }
    }
    private static void handleCancelMenuInput() {
        System.out.println("주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        handleCancelConfirmationInput();
    }
    private static void handleCancelConfirmationInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
           menuList.resetCart();
            System.out.println("주문이 취소되었습니다.");
            displayMainMenu();
        } else if (input == 2) {
            displayMainMenu();
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            handleCancelConfirmationInput();
        }
    }
    private static void handleMenuProductInput(List<Product> items) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input >= 1 && input <= items.size()) {
            Product selectedItem = items.get(input);
            displayConfirmation(selectedItem);
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            handleMenuProductInput(items);
        }
    }
    private static void handleOrderMenuInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            displayOrderComplete();
        } else if (input == 2) {
            displayMainMenu();
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            handleOrderMenuInput();
        }
    }

    private static int printMenu(List<Menu> menus, int num) {
        for (int i=0; i<menus.size(); i++) {
            System.out.println(num++ + ". " + menus.get(i).name + "   | " + menus.get(i).description);
        }
        return num;
    }
    private static void printMenuProduct(List<Product> products) {
        for (int i=0; i<products.size(); i++) {
            int num = i + 1;
            System.out.println(num + ". " + products.get(i).name + "   | " + products.get(i).price + " | " + products.get(i).description);
        }
    }
}
