import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Kiosk {
    private ArrayList<Menu> mainMenu=new ArrayList<Menu>(); //메인메뉴
    private ArrayList<Product> productMenu = new ArrayList<Product>(); // product메뉴판(모든메뉴)
    private ArrayList<Product> TypeProductMenu = new ArrayList<Product>(); //타입별 메뉴판
    HashMap<String, ArrayList<Product>> hash = new HashMap<>();


    public void LoadMenu() { //카테고리메뉴와 상품메뉴를 리스트에 담기
        mainMenu.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        mainMenu.add(new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림"));
        mainMenu.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));
        mainMenu.add(new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));
    }
    public void LoadProduct() {
        productMenu.add(new Product("Bugers","ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        productMenu.add(new Product("Bugers","SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9));
        productMenu.add(new Product("Bugers","Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4));
        productMenu.add(new Product("Bugers","Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 5.4));
        productMenu.add(new Product("Bugers","Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 6.9));


        productMenu.add(new Product("Frozen Custard","Shakes", "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛 버터, 커피", 5.9));
        productMenu.add(new Product("Frozen Custard","Shake of the Week", "특별한 커스터드 플레이버", 6.5));
        productMenu.add(new Product("Frozen Custard","Red Bean Shake", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6.5));
        productMenu.add(new Product("Frozen Custard","Floats", "루트 비어, 퍼플 카우, 크림 시클", 5.9));
        productMenu.add(new Product("Frozen Custard","Cups & Cones", "바닐라, 초콜렛, Flavor of the Week", 4.9));
        productMenu.add(new Product("Frozen Custard","Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5.9));
        productMenu.add(new Product("Frozen Custard","Shack Attack", "초콜렛 퍼지소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드", 5.9));


        productMenu.add(new Product("Drinks","Shack-made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)", 3.9));
        productMenu.add(new Product("Drinks","Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.4));
        productMenu.add(new Product("Drinks","Fifty/Fifty", "레몬에이드와 아이스티의 만남", 3.5));
        productMenu.add(new Product("Drinks","Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2.7));
        productMenu.add(new Product("Drinks","Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4));
        productMenu.add(new Product("Drinks","Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1.0));

        productMenu.add( new Product("Beer","ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 9.8));
        productMenu.add( new Product("Beer","Magpie Brewing Co.", "설명 없음", 6.8));

    }
    public void showMain(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("[ SHAKESHACK MENU ]");
        int number=1;
        for(Menu item:mainMenu){
            System.out.print(number+".");
            item.show();
            number++;
        }
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다");
    }
//    public static<Product> int findArray(Product[] a, Product name)
//    {
//        return IntStream.range(0, a.length)
//                .filter(i -> name.equals(a[i]))
//                .findFirst()
//                .orElse(-1);    // 타겟을 찾지 못하면 -1 반환
//    }

    public void showProduct(String name){
//        ArrayList<Product> productMenu = new ArrayList<Product>();
        LoadProduct();
        String menuName;
//        String getIndex= productMenu.stream().filter(cookie -> cookie.getName().equals(name)).toString();
        menuName = productMenu.get(0).getName();
        for (Product item : productMenu) { //메뉴타입별로 출력
            if (menuName.equals(item.getType())) {
                TypeProductMenu.add(item);
                item.show();
            }
        }

    }

    public void TermenulController(){
        showMain();
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        showProduct(name);
    }

}
