abstract class RecycledProduct extends Product{
    double getDiscountedPrice(int b){
        double RecycledProductDiscount = 0.05 * b;
        return RecycledProductDiscount;
    }

    /*@Override
    public String toString(int product_id, String name , int price , int discountedPrice) {
        return "This is the " + product_id + "and name is " + name + "with price of " + price + "and discounted price is" + discountedPrice;
    }*/
    @Override
    public String toString() {
        return super.toString();
    }

}
