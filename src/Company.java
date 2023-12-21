
public class Company {

    public int hourly_wage_full;
    public int hourly_wage_part;
    public int days;

    public Company(int hwf, int hwp, int days) {
        hourly_wage_full = hwf;
        hourly_wage_part = hwp;
        this.days = days;
    }
}