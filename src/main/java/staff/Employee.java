package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private Double salary;

    public Employee(String name, String ni, Double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
        this.name = name;
    }}

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        if(raise >0){
            this.salary += raise;
        }

    }

    public Double payBonus(){
        return this.salary * 0.01;
    }


}
