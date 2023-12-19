public class UC_6 {
    public static void main(String[] args) {
        int monthly_wage_value;
        int wage_value;
        int hour_wage = 20;
        int hours = 0;
        int days = 0;

        while (hours <= 100 && days <= 20) {
            hours = hours + 8;
            days= days+1;
        }
        System.out.println(hours);
        
        monthly_wage_value = hour_wage * hours * days;

        System.out.println(monthly_wage_value);

    }
}