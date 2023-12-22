import java.util.ArrayList;
import java.util.Random;

public class EmployeeWage {

    // private int attendance;
    private int type;
    private int daily_hours;
    private int daily_wage;
    private int days;
    private int hourly_wage;
    private int monthly_wage;

    public ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

    public EmployeeWage() {
        // this.type = type;
        // this.days = days;
        //this.daily_wage = daily_wage;
        daily_hours = 8;
    }

    public void getEmployeeType(int type) {
        switch (type) {
            case 0:
                System.out.println("Employee Type: Part-time Worker");
                break;
            case 1:
                System.out.println("Employee Type: Full-time Worker");
                break;
        }
    }

    public int getHourlyWage(int type, CompanyEmpWage company)
    {
        int hourly_wage=0;

        switch (type) {
            case 0:
                hourly_wage = company.hourly_wage_part;
                break;
            case 1:
                hourly_wage = company.hourly_wage_full;
                break;
        }

        return hourly_wage;
    }

    public void getAttendance(int attendance) {

        if (attendance == 0)
            System.out.println("Attendance: Absent");
        else if (attendance == 1)
            System.out.println("Attendance: Present");
    }

    // public int getDailyWage(int type, int attendance) {

    //     if(attendance==1)
    //     {
    //             switch (type) {

    //             case 0:
    //                 hourly_wage = 8;
    //                 daily_wage = hourly_wage * daily_hours;
    //                 break;
    //             case 1:
    //                 hourly_wage = 20;
    //                 daily_wage = hourly_wage * daily_hours;
    //         }
    //     }
    //     else if (attendance == 0)
    //     {
    //         daily_wage = 0;
    //     }
        

    //     return daily_wage;
    // }

    // public int getMonthlyWage(int type, CompanyEmpWage company) {

    //     int present_days = 0;
    //     int i=0;

    //     for(i=0; i<days; i++)
    //     {
    //         int attendance = new Random().nextInt(2);
    //         daily_wage = getDailyWage(type, attendance);

    //         if(attendance==1)
    //             present_days++;

    //         switch (type) {

    //         case 0:
    //             hourly_wage = company.hourly_wage_part;
    //             daily_wage = hourly_wage * daily_hours;
    //             monthly_wage = daily_wage * present_days;
    //             break;
    //         case 1:
    //             hourly_wage = company.hourly_wage_full;
    //             daily_wage = hourly_wage * daily_hours;
    //             monthly_wage = daily_wage * present_days;
    //         }

    //     }
    //     System.out.println("Number of days present: "+present_days);
    //     return monthly_wage;
    // }
}