import java.util.ArrayList;

public class Menu {

    private String menuType;
    private String detail;

    public Menu(String menuType, String detail){
        this.menuType = menuType;
        this.detail = detail;
    }



    public void show(){
    System.out.printf("%-15s | %s\n", menuType, detail);
}


    public String getDetail() {
        return detail;
    }

    public String getMenuType() {
        return menuType;
    }

}
