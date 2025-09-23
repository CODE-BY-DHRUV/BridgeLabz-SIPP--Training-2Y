public class Cart {
    final double tax_rate = 0.05;
    static int totalCartsCreated = 0;
    Cart(int a){
        a = a + 1;
    }


    public void additem(int id){
       System.out.println("an item was added into the cart having id" + id);
    }
    public void additem(int quantity , int id){
        System.out.println("multiple items are added");
    }
    public void additem(int product_id , int quantity , String name ){
         System.out.println("Added" + quantity + " units of Product ID" );
    }
    public static int getCartCount(int totalCartsCreated){
        return totalCartsCreated;
    }
    public void printCartItems(){
        System.out.println(this.getCartCount(totalCartsCreated));
    }



}
