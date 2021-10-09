package NewSalaryPay;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class newSalaryPay {

    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            
            
            String userName;
            String userId;
            String tardinessWarning = null;
            double userRatePerHour;
            double userHoursWorkedMon;
            double userHoursWorkedTue;
            double userHoursWorkedWed;
            double userHoursWorkedThu;
            double userHoursWorkedFri;
            double userTotalHoursWorked;
            double userOverTimeMon = 0;
            double userOverTimeTue = 0;
            double userOverTimeWed = 0;
            double userOverTimeThu = 0;
            double userOverTimeFri = 0;
            double userTotalOverTime;
            
            
            
            System.out.println("** Calculate Employee Salary per week **");
            System.out.println("Input Employees Data first...\n");
            System.out.print("Employee Name: ");
            userName = input.nextLine();
            System.out.print("Employee ID: ");
            userId = input.nextLine();
            
            System.out.println("********** TIME IN **********");
            
            System.out.print("Monday: ");
            userHoursWorkedMon = input.nextDouble();
                    if (userHoursWorkedMon == 8){
                        System.out.print("Today, you can do overtime work if you want! \nHow many hours? ");
                    userOverTimeMon = input.nextDouble();
                    } else {
                        System.out.println("No overtime today!");
                    }  
            System.out.print("\nTuesday: ");
            userHoursWorkedTue = input.nextDouble();
                    if (userHoursWorkedTue == 8){
                        System.out.print("Today, you can do overtime work if you want! \nHow many hours? ");
                    userOverTimeTue = input.nextDouble();
                    }else {
                        System.out.println("No overtime today!");
                    } 
            System.out.print("\nWednesday: ");
            userHoursWorkedWed = input.nextDouble();
                    if (userHoursWorkedWed == 8){
                        System.out.print("Today, you can do overtime work if you want! \nHow many hours? ");
                    userOverTimeWed = input.nextDouble();
                    }else {
                        System.out.println("No overtime today!");
                    } 
            System.out.print("\nThursday: ");
            userHoursWorkedThu = input.nextDouble();
                    if (userHoursWorkedThu == 8){
                        System.out.print("Today, you can do overtime work if you want! \nHow many hours? ");
                    userOverTimeThu = input.nextDouble();
                    }else {
                        System.out.println("No overtime today! ");
                    } 
            System.out.print("\nFriday: ");
            userHoursWorkedFri = input.nextDouble();
                    if (userHoursWorkedFri == 8){
                        System.out.print("Today, you can do overtime work if you want! \nHow many hours? ");
                    userOverTimeFri = input.nextDouble();
                    }else {
                        System.out.println("No overtime today! ");
                    } 
                    
            userTotalHoursWorked = userHoursWorkedMon + userHoursWorkedTue + userHoursWorkedWed + userHoursWorkedThu + userHoursWorkedFri;
            userTotalOverTime = userOverTimeMon + userOverTimeTue + userOverTimeTue + userOverTimeWed + userOverTimeThu + userOverTimeFri;
                             
            System.out.print("\nPay Per Hour: ");
            userRatePerHour = input.nextDouble();
                    
                    
            Payroll employee1 = new Payroll(userName, userId);
            employee1.setRatePerHour(userRatePerHour);
            employee1.setHourWorkedMonday(userHoursWorkedMon);
            employee1.setHourWorkedTuesday(userHoursWorkedTue);
            employee1.setHourWorkedWednesday(userHoursWorkedWed);
            employee1.setHourWorkedThursday(userHoursWorkedThu);
            employee1.setHourWorkedFriday(userHoursWorkedFri);
            employee1.setTotalHourWorked(userTotalHoursWorked);
            employee1.setTotalOverTime(userTotalOverTime);
               
            
            System.out.println("**********************************");
            System.out.println("Overtime Rate: "+employee1.getOverTimeRate());
            System.out.println("OVERTIME (hrs): "+ employee1.getTotalOverTime());
            System.out.println("**********************************");
            System.out.println("Employees ID       : " + employee1.getIdNumber());
            System.out.println("Employees Name     : " + employee1.getName());
            System.out.println("Total Hours worked : " + employee1.getTotalHoursWorked());
            System.out.println("Employees Tardines : " + employee1.calculateTardiness());
            System.out.println("**********************************");
            System.out.println("WEEKLY SALARY...");
            System.out.println("**********************************");
            System.out.println("Tardiness Deduction : "+ employee1.calculateTardinesDeduction());
            System.out.println("Overtime Pay  : " + employee1.calculateOverTimePay());
            System.out.println("Weekly income : " + employee1.calculateWeeklyPay());
            System.out.println("Gross income  : " + employee1.calcaulateGrossPay());
            System.out.println("**********************************");
            tardinessWarning = String.format("HR: You reached %.2f hours of tardiness Mr. %s ", employee1.calculateTardiness(), employee1.getName());
            String noTardiness = String.format("HR: Low tardiness this week, You deserve a raise!");
             if (employee1.calculateTardiness() > 5){        
                    JOptionPane.showMessageDialog(null,tardinessWarning ,"Warning", JOptionPane.WARNING_MESSAGE);
             }else{
                 JOptionPane.showMessageDialog(null,noTardiness);
             }
             
             System.exit(0);
    }
     
}
