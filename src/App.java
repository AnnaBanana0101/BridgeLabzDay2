import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");

        Random rand = new Random();

        int employeeType = rand.nextInt(2); // Randomly generate employee type part time or full time
        int attendance = rand.nextInt(2); // Randomly generate present or absent

        int daily_wage;
        int monthly_wage;

        EmployeeWage employeeWage = new EmployeeWage(employeeType);// Initialize employee object

        employeeWage.getEmployeeType(employeeType);
        employeeWage.getAttendance(attendance);

        daily_wage = employeeWage.getDailyWage(employeeType);
        monthly_wage = employeeWage.getMonthlyWage(employeeType);

        System.out.println("Daily Wage: " + daily_wage);
        System.out.println("Monthly Wage: " + monthly_wage);

    }
}
