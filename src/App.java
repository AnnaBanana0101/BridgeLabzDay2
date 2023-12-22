import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");

        Random rand = new Random();

        Company company = new Company(30, 9, 25);

        int employeeType = rand.nextInt(2); // Randomly generate employee type part time or full time
        int attendance = rand.nextInt(2); // Randomly generate present or absent

        int daily_wage;
        int monthly_wage;

        EmployeeWage employeeWage = new EmployeeWage(employeeType, company.days);// Initialize employee object
        employeeWage.getEmployeeType(employeeType);

        System.out.println("Hourly Wage: "+ employeeWage.getHourlyWage(employeeType, company));
        System.out.println(" ");

        System.out.println("For any random day: ");

        employeeWage.getAttendance(attendance);
        //daily_wage = employeeWage.getDailyWage(employeeType, attendance);
        daily_wage = company.getDailyWage(employeeType, attendance);
        System.out.println("Daily Wage: " + daily_wage);
        System.out.println(" ");

        System.out.println("For a month based on the number of presents: ");

        //monthly_wage = employeeWage.getMonthlyWage(employeeType, company);
        monthly_wage = company.employeeWageBuilder(employeeType);
        System.out.println("Monthly Wage: " + monthly_wage);

    }
}
