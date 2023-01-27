import ITCompany.*;
public class Main2 {
    public static void main(String[] args) {

        Employee stocker = new Employee("Sidhant", "Stocker");
        Employee cheifManager = new Employee("Sahil", "Cheif Manager");
        Employee AssistantManager = new Employee("kamlesh", "Assistant Manager");
        Employee Salesman = new Employee("Sahil", "Sailsman");


        Store store = new Store();
        store.setEmployee(stocker,0);
        store.setEmployee(cheifManager,1);
        store.setEmployee(AssistantManager,2);
        store.setEmployee(Salesman,3);

        System.out.println(store);
        try {
            store.open();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
