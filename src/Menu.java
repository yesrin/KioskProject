import java.util.ArrayList;

public class Menu {

    private String name;
    private String detail;


    public Menu(String name, String detail){
        this.name = name;
        this.detail = detail;
    }



    public void show(){
    System.out.printf("%-15s | %s\n", name, detail);
}

    public void OrderMenu(){
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다");
    }
    public String getName() {
        return name;
    }
    public String getDetail() {
        return detail;
    }

}
