import java.util.Random;

public class EmployeeWage {

    // private int attendance;
    private int type;
    private int daily_hours;
    private int days;
    private int daily_wage;
    private int hourly_wage;
    private int monthly_wage;

    public EmployeeWage(int type) {
        this.type = type;
        daily_hours = 8;
        days = 20;
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

    public void getAttendance(int attendance) {

        if (attendance == 0)
            System.out.println("Attendance: Absent");
        else if (attendance == 1)
            System.out.println("Attendance: Present");
    }

    public int getDailyWage(int type) {

        switch (type) {

            case 0:
                hourly_wage = 8;
                daily_wage = hourly_wage * daily_hours;
                break;
            case 1:
                hourly_wage = 20;
                daily_wage = hourly_wage * daily_hours;
        }

        return daily_wage;
    }

    public int getMonthlyWage(int type) {
        switch (type) {

            case 0:
                hourly_wage = 8;
                daily_wage = hourly_wage * daily_hours;
                monthly_wage = daily_wage * days;
                break;
            case 1:
                hourly_wage = 20;
                daily_wage = hourly_wage * daily_hours;
                monthly_wage = daily_wage * days;
        }

        return monthly_wage;
    }
}