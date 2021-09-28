public class Teacher {
    String name;
    double salary;
    double tax = 0.07;

    public Teacher(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;

    }

}
