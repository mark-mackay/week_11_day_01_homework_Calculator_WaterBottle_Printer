public class Calculator {

    public Calculator(){

    }

    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1,int num2){
        return num1 * num2;
    }
    public double divide(int num1,int num2){
        if (num2 != 0) {
            double floatNum1 = (double) num1;
            double floatNum2 = (double) num2;
            return floatNum1 / floatNum2;
        }
        else {
            return 0.00;
        }

    }

}
