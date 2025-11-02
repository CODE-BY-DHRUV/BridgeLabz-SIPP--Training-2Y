public class Main {
    public static void main(String[] args) {
        Product A = new RecycledProduct() {
            @Override
            double getDistcountedPrice(int price) {
                return 0;
            }
        } ;
       Product B = new OrganicProduct() {
           @Override
           double getDistcountedPrice(int price) {
               return 0;
           }
       };
       Cart.getCartCount(23);


    }
}
