class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department);
    }
}

 class MainEmployee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 101;
        m.department = "IT";
        m.setSalary(75000);

        m.displayDetails();
        System.out.println("Salary: " + m.getSalary());
    }
}

