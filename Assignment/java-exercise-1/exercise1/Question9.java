package exercise1;

public class Question9 {
      enum house{

          A(2100000),
          B(300000),
          C(540000);
          public int price;
          house (int price) {
              this.price = price;
            }
            public static void getPrice(){
                for(house h: house.values())
                    System.out.println(h.price);
            }
      }

    public static void main(String[] args) {
        System.out.println("house with their prices");
        house.getPrice();
    }
}
