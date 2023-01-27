package HashMapEx1;

import java.util.HashMap;
import java.util.Map;

public class ManagerClass {

    public static void main(String[] args) {


        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("Sidhant", 22, "Civil");
        Employee e2 = new Employee("Sahil", 27, "CS");
        Employee e3 = new Employee("Kamlesh", 55, "Arts");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

        for (Map.Entry<Integer,Employee> m : emp.entrySet()){
            int key =m.getKey();
            Employee E = m.getValue();
            System.out.println(key+ " : Info");
            System.out.println(E.getName() + ", " + E.getAge() + ", " + E.getDepartment());
        }

    }
}