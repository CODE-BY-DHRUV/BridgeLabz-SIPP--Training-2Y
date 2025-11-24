 class PropagationDemo {
    public static void methodB() {
        try {
            int x = Integer.parseInt("abc"); // NumberFormatException handled
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException in methodB");
        }

        String s = null;
        s.length(); // NullPointerException → NOT handled → propagates
    }

    public static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception propagated to methodA: " + e);
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
