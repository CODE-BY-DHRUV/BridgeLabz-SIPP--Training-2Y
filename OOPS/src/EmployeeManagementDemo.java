import java.util.*;
    abstract class Employee {
        private String employeeId;
        private String name;
        private double baseSalary;

        public Employee(String employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }


        public String getEmployeeId() { return employeeId; }
        public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getBaseSalary() { return baseSalary; }
        public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }


        public abstract double calculateSalary();
        public void displayDetails() {
            System.out.printf("ID: %s | Name: %s | Base Salary: %.2f | Calculated Salary: %.2f%n",
                    employeeId, name, baseSalary, calculateSalary());
        }
    }

    interface Department {
        void assignDepartment(String dept);
        String getDepartmentDetails();
    }

    class FullTimeEmployee extends Employee implements Department {
        private String department;
        private double bonus; // additional for full-time employees

        public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
            super(id, name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return getBaseSalary() + bonus;
        }

        @Override
        public void assignDepartment(String dept) { this.department = dept; }
        @Override
        public String getDepartmentDetails() { return department; }
    }

    class PartTimeEmployee extends Employee implements Department {
        private String department;
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(String id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
            super(id, name, baseSalary); // baseSalary might be 0 or a pro-rata value
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        @Override
        public void assignDepartment(String dept) { this.department = dept; }
        @Override
        public String getDepartmentDetails() { return department; }
    }

    public class EmployeeManagementDemo {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            FullTimeEmployee f1 = new FullTimeEmployee("F001", "Alice", 50000, 5000);
            f1.assignDepartment("Engineering");
            PartTimeEmployee p1 = new PartTimeEmployee("P001", "Bob", 0, 80, 200);
            p1.assignDepartment("Support");

            employees.add(f1);
            employees.add(p1);


            for (Employee e : employees) {
                e.displayDetails();
                if (e instanceof Department) {
                    System.out.println(" Dept: " + ((Department) e).getDepartmentDetails());
                }
            }
        }
    }


