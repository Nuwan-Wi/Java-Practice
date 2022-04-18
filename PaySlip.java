public class PaySlip {
    private int empNum;
    private String empName;
    private double basicSal;
    public double overTime;
   
    
    public void getEmpNum(int empNum){
       this.empNum = empNum;
    }
    public void getEmpName(String empName){
        this.empName = empName; 
    }
    public void getBasicSal(double basicSal){
        this.basicSal = basicSal;
    }
    public void getOverTime(double overTime){
        this.overTime = overTime;
    }

    public void setBasicSal(){
        System.out.printf("Basic Sallery of employee %s employee number %d has basic salery Rs.%.2f.\n", empName, empNum, basicSal);
     } 
     public void setOvertime(){
         double netSal = basicSal + overTime;
         System.out.printf("net Sallery = Rs.%.2f.",netSal);
     }

     public static void main(String[] args) {
         PaySlip obj = new PaySlip();
         obj.getEmpName("Nuwan");
         obj.getEmpNum(001);
         obj.getBasicSal(10000.00);
         obj.getOverTime(2000);
         obj.setBasicSal();
         obj.setOvertime();

     } 
}
