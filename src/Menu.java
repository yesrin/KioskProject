public class Menu {
    public final String[] name ={"Burgers ", "Frozen Custard", "Drinks ", "Beer"};
    public final String[] detail={"앵거스 비프 통살을 다져만든 버거","매장에서 신선하게 만드는 아이스크림","매장에서 직접 만드는 음료","뉴욕 브루클린 브루어리에서 양조한 맥주"};

    public  final String[] bugerMenu={"ShackBurger","SmokeShack","Shroom Burger","Cheeseburger","Hamburger"};
    public final String[] bugerDetail={"토마토, 양상추, 쉑소스가 토핑된 치즈버거",
            "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
            "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
            "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
            "비프패티를 기반으로 야채가 들어간 기본버거"
    };

    public void MenuList(){
        for(int i=0; i< 4; i++) {
            System.out.println( i+1+"."+" "+name[i]+" |"+detail[i]);
        }
    }
    public void OrderMenu(){
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다");
    }
}
