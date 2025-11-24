class Prototype implements Cloneable {
    int id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Prototype p1 = new Prototype();
        p1.id = 100;

        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned ID: " + p2.id);
    }
}
