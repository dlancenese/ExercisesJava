import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        HourlyEmployee tim = new HourlyEmployee("Tim", "11/11/1985",
                "01/01/2020", 18.75);
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("Overtime Pay = " + tim.getDoublePay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension = $" + joe.collectPay());
        System.out.println(joe);
    }
}