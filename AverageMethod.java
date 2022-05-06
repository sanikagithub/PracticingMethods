public class AverageMethod {
    public static void main(String[] args) {       
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;
        System.out.println("Sum is: " + sum(num1, num2, num3));  
        System.out.println("Average is: " + average(num1, num2, num3));

    }
   
    public static double sum(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
    public static double average(int num1, int num2, int num3) {
        return sum(num1,num2,num3)/3;
        
    }
}

