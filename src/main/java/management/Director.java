package management;

public class Director extends Manager{

    private Double budget;



    public Director(String name, String ni, Double salary, String departmentName, Double budget) {
        super(name, ni, salary, departmentName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public Double payBonus(){
        return super.getSalary()* 0.02;
    }
}
