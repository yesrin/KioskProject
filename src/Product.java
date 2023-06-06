
public class Product extends Menu {
    //상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
    Double price;


    Product(String name, Double price, String description) {
        super(name, description);
        this.price = price;
    }

}
