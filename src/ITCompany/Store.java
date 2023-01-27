package ITCompany;

public class Store {
    Employee[] employees;

    public Store() {
        employees = new Employee[4];
    }

    public void setEmployee(Employee employee, int index) {
        this.employees[index] = new Employee(employee);
    }

    public Employee getEmployee(int index) {
        return new Employee(this.employees[index]);
    }


    public void open() throws IllegalAccessException {
        for (Employee employee : employees) {
            if (employee == null) {
                throw new IllegalAccessException("You must be full Staffed before opening the store");

            }
        }
        System.out.print("Welcome to the store it is open for business");


    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] != null) {
                System.out.println();
                temp += employees[i].toString();
                temp += "\n\n";
            }
            else {
                temp += "No Employee, please enter";
                temp += "\n\n";
            }
        }
        return temp;
    }


}
