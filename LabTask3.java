interface Payable{
    double getPaymentAmount();
}
abstract class Employee implements Payable{
    private String firstName,lastName,ssn;
    public Employee(String f,String l,String S){
        setFirstName(f);   
        setLastName(l);
        setSsn(S);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSsn() {
        return ssn;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
   
    public String toString() {
        
        return firstName + " "+ lastName+"\n"+ssn;
    }
}
class salariedEmploye extends Employee{
    public salariedEmploye(String f, String l, String S,double ws) {
        super(f, l, S);
       weeklySalary=ws;
    }
    double weeklySalary;     
    public double getPaymentAmount() {
        
        return weeklySalary;
    }   
    public String toString() {
       
        return  super.toString()+"\n"+weeklySalary;
    }    
}
public class LabTask3 {
    public static void main(String[] args) {
        Payable f = new salariedEmploye("Sakib", "Khan", "02150",10000);
        System.out.println(f.toString()); 
    }
}
