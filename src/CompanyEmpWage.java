import java.util.Random;

public class CompanyEmpWage {

    public int hourly_wage_full;
    public int hourly_wage_part;
    public int days;
    public int hourly_wage;
    public int daily_wage;
    public int monthly_wage;

    public CompanyEmpWage(int hwf, int hwp, int days) {
        hourly_wage_full = hwf;
        hourly_wage_part = hwp;
        this.days = days;
    }

    public int getDailyWage(int type, int attendance) {
        
        if(attendance==1)
        {
                switch (type) {

                case 0:
                    hourly_wage = hourly_wage_full;
                    daily_wage = hourly_wage * 8;
                    break;
                case 1:
                    hourly_wage = 20;
                    daily_wage = hourly_wage *8;
            }
        }
        else if (attendance == 0)
        {
            daily_wage = 0;
        }
        return daily_wage;
    }

    public int employeeWageBuilder(int type)
    {
        int present_days = 0;
        int i=0;

        for(i=0; i<days; i++)
        {
            int attendance = new Random().nextInt(2);
            daily_wage = getDailyWage(type, attendance);

            if(attendance==1)
                present_days++;

            switch (type) {

            case 0:
                hourly_wage = hourly_wage_part;
                daily_wage = hourly_wage * 8;
                monthly_wage = daily_wage * present_days;
                break;
            case 1:
                hourly_wage = hourly_wage_full;
                daily_wage = hourly_wage * 8;
                monthly_wage = daily_wage * present_days;
            }

        }
        System.out.println("Number of days present: "+present_days);
        return monthly_wage;
    }
}