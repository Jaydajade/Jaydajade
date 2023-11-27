package chitlada.phorn.lab2;

public class SimpleCalculator {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Error: Please provide exactly three arguments");
        }

        
        String num1 = args[0];
        String num2 = args[1];
        String A = args[2];
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);

        switch (A) {
            case "+":
                System.out.println(num1+"+"+num2+"="+ (num3 + num4));
                break;
            case "-":
                System.out.println(num1+"-"+num2+"="+ (num3 - num4));
                break;
            case "x":
                System.out.println(num1+"x"+num2+"="+ (num3 * num4));
            case "/":
                if (num2.equals("0")){
                System.out.println("Error: Division by zero is not allowed.");
            }   
               else{
                     System.out.println(num1+"/"+num2+"="+ (num3 / num4));
               }
                break;
            default:
                System.out.println("Invalid operator. Please use '+', '-', 'x', or '/'.");
                break;  
        }
        
    }
}
