public class HourlyEmployee extends Employee{
    public double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }
}
