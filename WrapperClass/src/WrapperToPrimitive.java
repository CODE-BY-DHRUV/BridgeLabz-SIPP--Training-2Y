public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double primitiveDouble = dObj;      // unboxing
        int primitiveInt = (int)(double)dObj; // cast

        System.out.println("Double object: " + dObj);
        System.out.println("double primitive: " + primitiveDouble);
        System.out.println("int primitive: " + primitiveInt);
    }
}

