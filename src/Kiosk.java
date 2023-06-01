import java.util.Scanner;

public class Kiosk {
    Kiosk(){
    }
    Screen screen=new Screen();
    public void ConnectScreen(){

        screen.showMainScreen();//메인화면 보여주기
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        Kiosk kiosk=new Kiosk();
        kiosk.movedProduct(name); //movedProduct로 이동
    }
    public void movedProduct(String name){

        if(name.equals("Bugers")||name.equals("1")){
            Product product= new Product();
        }

    }
}
