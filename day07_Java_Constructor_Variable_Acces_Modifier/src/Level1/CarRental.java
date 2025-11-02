class CarRental {
    String customerName, carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        double dailyRate = 1000; // fixed rate
        return dailyRate * rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays +
                ", Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Alice", "Sedan", 5);
        rental.display();
    }
}

