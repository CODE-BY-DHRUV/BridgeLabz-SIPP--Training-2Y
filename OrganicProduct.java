abstract class OrganicProduct extends Product{

    double getDiscountedPrice(int a){
        double discount = 0.1 * a ;
        return discount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
