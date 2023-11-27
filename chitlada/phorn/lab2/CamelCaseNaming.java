package chitlada.phorn.lab2;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Error: Please provide exactly two arguments");
           return ; 
        }
    String first_name = args[0];
    String last_name = args[1];

     
    
    System.out.println("Camel Case Result: "+first_name.substring(0,1).toUpperCase()+first_name.substring(1).toLowerCase()+last_name.substring(0,1).toUpperCase()+last_name.substring(1).toLowerCase());
    }
    
}
