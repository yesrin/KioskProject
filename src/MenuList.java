import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MenuList {

    private Map<String, List<Menu>> menus;
    private Map<String, List<Product>> menuItems;
    private List<Product> cart;
    MenuList(){
        menus = new HashMap<>();
        menuItems = new HashMap<>();
        cart = new ArrayList<>();

        MenuListItems();
    }

    public void MenuListItems(){
        List<Menu> mainMenus = new ArrayList<>();
        mainMenus.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        mainMenus.add(new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림"));
        mainMenus.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));
        mainMenus.add(new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));

        List<Menu> orderMenus = new ArrayList<>();
        orderMenus.add(new Menu("Order", "장바구니를 확인 후 주문합니다."));
        orderMenus.add(new Menu("Cancel", "진행중인 주문을 취소합니다."));

        menus.put("Main", mainMenus);
        menus.put("Order", orderMenus);

        List<Product> burgersMenus = new ArrayList<>();
        burgersMenus.add(new Product("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenus.add(new Product("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenus.add(new Product("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        burgersMenus.add(new Product("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenus.add(new Product("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<Product> frozenCustardMenu = new ArrayList<>();
        frozenCustardMenu.add(new Product("Frozen Custard Menu Item 1", 1.4, "Frozen Custard Menu Item 1 설명"));
        frozenCustardMenu.add(new Product("Frozen Custard Menu Item 2", 1.0, "Frozen Custard Menu Item 2 설명"));
        frozenCustardMenu.add(new Product("Frozen Custard Menu Item 3", 1.6, "Frozen Custard Menu Item 3 설명"));
        frozenCustardMenu.add(new Product("Frozen Custard Menu Item 4", 2.1, "Frozen Custard Menu Item 4 설명"));

        List<Product> drinksMenu = new ArrayList<>();
        drinksMenu.add(new Product("Drinks Menu Item 1", 1.0, "Drinks Menu Item 1 설명"));
        drinksMenu.add(new Product("Drinks Menu Item 2", 1.0, "Drinks Menu Item 2 설명"));

        List<Product> beerMenu = new ArrayList<>();
        beerMenu.add(new Product("Beer Menu Item 1", 3.0, "Beer Menu Item 1 설명"));
        beerMenu.add(new Product("Beer Menu Item 2", 4.0, "Beer Menu Item 2 설명"));

        menuItems.put("Burgers", burgersMenus);
        menuItems.put("Frozen Custard", frozenCustardMenu);
        menuItems.put("Drinks", drinksMenu);
        menuItems.put("Beer", beerMenu);
    }

    public List<Menu> getMenus(String key) {return menus.get(key);
    }
    public List<Product> getMenuItems(String key) {
        return menuItems.get(key);
    }


}