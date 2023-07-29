interface compute{
   double Add(double a, double b);
   double Subtract(double a, double b);
   double Multiply(double a, double b);
   double Divide(double a, double b);
}
class integerMode implements compute{
    public double add(double a, double b) {
        if(a>65536 || b>65536)
        throw new ArithmeticException("Numer is too large");
        return (int) a+b;
    }
    public double Multiply(double a, double b) {
        return (int) a*b;
    }
    public double Subtract(double a, double b) {
        if(a<-65536)
        throw new ArithmeticException("Number is too smaler");
        return (int) a-b;
    }
    public double Divide(double a, double b) {
        if(b==0)
        throw new ArithmeticException("You cannot devide by zero");
        return (int) a+b;
    }

    @Override
    public double Add(double a, double b) {
        return 0;
    }    
}
    class DoubleMode implements compute{
        private double a,b;
     public DoubleMode(double a,double b){
         this.a=a;
         this.b=b;
     }
    public double add(double a, double b) {
        if(a>65536||b>65536)
        throw new ArithmeticException("Numer is too large");
        return  a+b;
    }
    public double Multiply(double a, double b) {
        return  a*b;
    }
    public double Subtract(double a, double b) {
        if(a<-65536)
        throw new ArithmeticException("Number is too smaler");
        return  a-b;
    }
    public double Divide(double a, double b) {
        if(b==0)
        throw new ArithmeticException("You cannot devide by zero");
        return  a+b;
    }
    @Override
    public double Add(double a, double b) {
        return 0;
    }
}
public class Contener{
    public static void main(String[] args) {
        compute s = new integerMode();
        try{                
             System.out.println(s.Divide(5, 0));
        }
        catch(ArithmeticException e)
        {
             System.out.println(e);
        }            
    }
}
