package KiemTra;

public abstract class SalaryPolicy {
    float rate;
    float baseSalary;
    float Salary;

    public SalaryPolicy(float baseSalary,float Salary) {
        super();
        this.baseSalary = baseSalary;
        this.Salary = Salary;
    }







    public float getBaseSalary() {
        return baseSalary;
    }
}
