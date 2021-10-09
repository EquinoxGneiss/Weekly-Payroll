
package NewSalaryPay;


public class Payroll {
    private String name;
    private String idNumber;
    private String tardinessWarning;
    private double ratePerHour;
    private double hoursWorkedMonday;
    private double hoursWorkedTuesday;
    private double hoursWorkedWednesday;
    private double hoursWorkedThursday;
    private double hoursWorkedFriday;
    private double totalHoursWorked;
    private double overTimeMonday;
    private double overTimeTuesday;
    private double overTimeWednesday;
    private double overTimeThursday;
    private double overTimeFriday;
    private double totalOverTime;
    private double overTimeRate;
    private double tardiness;
    private double tardinessDeduction;
    
    
    public String getName (){
        return name;
    }
    
    public String getIdNumber (){
        return idNumber;
    }
    
    public String getTardinessWarning(){
        return tardinessWarning;
    }
    
    public double getRatePerHour (){
        return ratePerHour;
    }
    
    public double getTardiness(){
        return tardiness;
    }
    
    public double getTardinessDeduction(){
        return tardinessDeduction;
    }
    
 //Hours Worked   
    public double getHourWorkedMonday (){
        return hoursWorkedMonday;
    }
    public double getHourWorkedTuesday (){
        return hoursWorkedTuesday;
    }
    public double getHourWorkedWednesday (){
        return hoursWorkedWednesday;
    }
    public double getHourWorkedThursday (){
        return hoursWorkedThursday;
    }
    public double getHourWorkedFriday (){
        return hoursWorkedFriday;
    }
    public double getTotalHoursWorked (){
        return totalHoursWorked;
    }
    
    
 //Over Time   
    public double getOverTimeMonday(){
        return overTimeMonday;
    }
      public double getOverTimeTuesday(){
        return overTimeTuesday;
    }
      public double getOverTimeWednesday(){
        return overTimeWednesday;
    }
        public double getOverTimeThursday(){
        return overTimeThursday;
    }
          public double getOverTimeFriday(){
        return overTimeFriday;
    }
    public double getTotalOverTime (){
        return totalOverTime;
    }    
    public double getOverTimeRate (){
        return overTimeRate;
    }
    
    
    public void setName (String givenName){
        name = givenName;
    }
    
    public void setIdNumber (String givenIdNumber){
        idNumber = givenIdNumber;
    }
    
    public void setRatePerHour (double givenRatePerHour){
        ratePerHour = givenRatePerHour;
    }
    
    public void setTardiness(double givenTardiness){
        tardiness = givenTardiness;
    }
    
    public void setTardinessWarning(String givenTadrinessWarning){
        tardinessWarning = givenTadrinessWarning;
    }
    
    public void setTardinessDeduction(double givenTardinessDeduction){
        tardinessDeduction = givenTardinessDeduction;
    }
    
    //Set Hours Worked
    public void setHourWorkedMonday (double givenHourWorkedMonday){
        hoursWorkedMonday = givenHourWorkedMonday;
    }
    public void setHourWorkedTuesday (double givenHourWorkedTuesday){
        hoursWorkedTuesday = givenHourWorkedTuesday;
    }
    public void setHourWorkedWednesday (double givenHourWorkedWednesday){
        hoursWorkedWednesday = givenHourWorkedWednesday;
    }
    public void setHourWorkedThursday (double givenHourWorkedThursday){
        hoursWorkedThursday = givenHourWorkedThursday;
    }
    public void setHourWorkedFriday (double givenHourWorkedFriday){
        hoursWorkedFriday = givenHourWorkedFriday;
    }
    public void setTotalHourWorked (double givenTotalHourWorked){
        totalHoursWorked = givenTotalHourWorked;
    }
    
    //Set Overtime
    public void setOvertimeMonday (double givenOverTimeMonday){
        overTimeMonday = givenOverTimeMonday;    
    }
    public void setOvertimeTuesday (double givenOverTimeTuesday){
        overTimeTuesday = givenOverTimeTuesday;    
    }
    public void setOvertimeWednesday (double givenOverTimeWednesday){
        overTimeWednesday = givenOverTimeWednesday;    
    }
    public void setOvertimeThursday (double givenOverTimeThursday){
        overTimeThursday = givenOverTimeThursday;    
    }
    public void setOvertimeFriday (double givenOverTimeFriday){
        overTimeFriday = givenOverTimeFriday;    
    }
    public void setTotalOverTime(double givenTotalOverTime){
        totalOverTime = givenTotalOverTime;
    }
     public void setOverTimeRate(double givenOverTimeRate){
        overTimeRate = givenOverTimeRate;
    }
    
     
    
    public double calculateWeeklyPay(){
        return totalHoursWorked * ratePerHour;
    }
    
    public double calcaulateGrossPay(){
        return  (totalHoursWorked * ratePerHour)+(totalOverTime * (ratePerHour*1.5));
    }
    
    public double calculateOverTimePay(){
        return totalOverTime * (ratePerHour*1.5);
    }
    
    public double calculateTardiness(){
        if (totalHoursWorked < 40)
            tardiness = 40 - totalHoursWorked;
        return tardiness;
    }
    
    public double calculateTardinesDeduction(){
        if (tardiness > 0)
        tardinessDeduction =( totalHoursWorked / 1.0 * tardiness ) ;
        return tardinessDeduction;
    }
    
    public Payroll (String givenName, String givenIdNumber){
        name = givenName;
        idNumber = givenIdNumber;
        ratePerHour = 200.5;
        totalHoursWorked = 40;
        overTimeRate = 75.45;
        tardiness = 0;
        tardinessDeduction = 0.0;
    }

}

    