import java.util.ArrayList;

public class Product extends Menu {
    //상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
    private final double menuPrice;
    private final String menuName;

    public Product(String menuType,String menuName, String detail, double menuPrice) {
        super(menuType, detail);
        this.menuPrice = menuPrice;
        this.menuName=menuName;
    }

    @Override
    public void show(){
        System.out.printf("%-15s | %s\n", getName(), getDetail(), menuPrice);
    }
}
