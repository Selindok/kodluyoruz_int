

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    protected Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (salary < 1000) {
            tax = 0;
        } else {
            tax = (3 * salary) / 100;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = 30 * (workHours - 40);
        }

        return bonus;

    }

    public double raiseSalary() {
        double raise = 0;
        int years = 2021 - hireYear;
        if (years < 10) {
            raise = ((salary * 5) / 100) + this.bonus() - this.tax();
        } else if (years > 9 && years < 20) {
            raise = ((salary * 10) / 100) + this.bonus() - this.tax();
        } else if (years > 19) {
            raise = ((salary * 15) / 100) + this.bonus() - this.tax();
        }

        return raise;
    }

    public double finalSalary() {
        double fin = this.salary;
        fin = this.salary + this.raiseSalary();

        return fin;
    }

    @Override
    public String toString() {
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Employee working hours per week: " + this.workHours);
        System.out.println("Employee hire year: " + this.hireYear);
        System.out.println("Employee tax: " + this.tax());
        System.out.println("Employee bonus: " + this.bonus());
        System.out.println("Employee salary raise amount in TL: " + this.raiseSalary());
        System.out.println("Employee net salary with bonus and tax: " + this.finalSalary());

        return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
                + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

}
