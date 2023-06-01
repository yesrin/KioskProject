import java.util.ArrayList;
import java.util.Scanner;

public class Screen {

    public static ArrayList<Menu> mainMenu = new ArrayList<Menu>(); // 매인메뉴판

    public void LoadMenu() { //카테고리메뉴와 상품메뉴를 리스트에 담기
        Menu burgersMenu = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
        Menu frozencustardMenu = new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        Menu drinksMenu = new Menu("Drinks", "매장에서 직접 만드는 음료");
        Menu beerMenu = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        mainMenu.add(burgersMenu);
        mainMenu.add(frozencustardMenu);
        mainMenu.add(drinksMenu);
        mainMenu.add(beerMenu);
    }
    public void ConnectScreen(){
        LoadMenu();
        showMainScreen(mainMenu);//메인화면 보여주기
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        Kiosk kiosk=new Kiosk();
        kiosk.movedProduct(name); //movedProduct로 이동
    }
    public void showMainScreen(ArrayList<Menu> menuList){

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("[ SHAKESHACK MENU ]");
        for(Menu menu : menuList) {
            menu.show();
        }
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다");
    }
}
