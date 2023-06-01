import java.util.ArrayList;

public class Product extends Menu {
    //상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
    private final double menuPrice;

    private ArrayList<Product> productMenu = new ArrayList<Product>(); // product메뉴판

    public Product(String name, String detail, double menuPrice) {
        super(name, detail);
        this.menuPrice = menuPrice;

    }
    public void LoadProduct() {
    Product shackBurger = new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
    Product smokeShack = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
    Product shroomBurger = new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
    Product cheeseBurger = new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 5.4);
    Product hamBurger = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 6.9);
        productMenu.add(shackBurger);
        productMenu.add(smokeShack);
        productMenu.add(shroomBurger);
        productMenu.add(cheeseBurger);
        productMenu.add(hamBurger);

    }
    @Override
    public void show(){
        System.out.printf("%-15s | %s\n", getName(), getDetail(), menuPrice);
    }
}
