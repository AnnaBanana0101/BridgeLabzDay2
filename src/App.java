import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");

        Random rand = new Random();
        String done = "N";

        EmployeeWage employeeWage = new EmployeeWage();

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Company details: ");

            int hwf, hwp, days;
            System.out.println("Hourly Wage for Full-Time Employees: ");
            hwf = sc.nextInt();
            System.out.println("Hourly Wage for Part-Time Employees: ");
            hwp = sc.nextInt();
            System.out.println("Total Working days in a Month: ");
            days = sc.nextInt();


            CompanyEmpWage company = new CompanyEmpWage(hwf, hwp, days);

            int employeeType = rand.nextInt(2); // Randomly generate employee type part time or full time
            int attendance = rand.nextInt(2); // Randomly generate present or absent

            int daily_wage;
            int monthly_wage;

            //EmployeeWage employeeWage = new EmployeeWage(employeeType, company.days);// Initialize employee wage object
            employeeWage.companyList.add(company);

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

            System.out.println("Company List:");
            System.out.println(employeeWage.companyList);

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Are you done? Y/N");
            done = sc1.nextLine();

        } while(done.equals("N"));

    }
        
}
