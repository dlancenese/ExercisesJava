import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() throws ParseException {
        Date d = new SimpleDateFormat("MM/dd/yyyy").parse(birthDate);
        int y = d.getYear();
        return 123 - y;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
