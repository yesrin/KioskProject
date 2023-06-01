import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
    ArrayList<String> orderList = new ArrayList<String>();

    public void addOrder(Product product) {
            Scanner sc = new Scanner(System.in);
            product.show();
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1.확인          2.취소");
//            if (sc.nextInt() == 1) {
//                System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
//                shoppingBag.add(product);
//            }
    }

}
