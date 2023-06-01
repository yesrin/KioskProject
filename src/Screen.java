public class Screen {
    public void showMainScreen(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("[ SHAKESHACK MENU ]");
        Menu menu=new Menu();
        menu.MenuList();
        menu.OrderMenu();
    }
}
