package ITCompany;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        if (name == null || name.isEmpty() || position == null || position.isEmpty()){
            throw  new IllegalArgumentException("Name and position can not be empty");
        }
            this.name = name;
        this.position = position;
    }

    public Employee(Employee Source) {
        this.name = Source.name;
        this.position = Source.position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
                + "Position: " +this.position+"\n";
    }

}
