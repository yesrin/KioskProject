public class Product extends Menu {
    //상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
    private final double[] menuPrice={6.9,8.9,9.4,6.9,5.4};

    public Product(){
        for(int i=0; i<menuPrice.length ; i++) {
            System.out.println( i+1+"."+" "+super.bugerMenu[i]+"| W"+menuPrice[i]+"|"+super.bugerDetail[i]);
        }

    }
}
