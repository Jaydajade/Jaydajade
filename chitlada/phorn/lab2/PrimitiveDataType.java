package chitlada.phorn.lab2;

public class PrimitiveDataType {

    public static void main(String[] args){
        String Student_id = "663040656-7";
        String First_name = "Phornphatsorn";
        

        System.out.println("Student ID : "+Student_id);  
        System.out.println("First name : "+First_name);  
        System.out.println("Byte Value: "+Student_id.substring(8,9)+Student_id.substring(10, 11));
        System.out.println("Short Value: "+Student_id.substring(7,9)+Student_id.substring(10, 11) );
        System.out.println("Int Value: "+Student_id.substring(4,9)+Student_id.substring(10, 11));
        System.out.println("Long Value: "  +Student_id.substring(2,9)+Student_id.substring(10, 11));  
        System.out.println("Float Value: 0."+Student_id.substring(8,9)+Student_id.substring(10, 11)); 
        System.out.println("Double Value: 0." +Student_id.substring(2,9)+Student_id.substring(10, 11));
        System.out.println("Char Value: "+First_name.substring(0,1));
   
        int num = Integer.parseInt(Student_id.substring(10, 11));
        if (num % 2 == 0) {
            System.out.println("false");
        }
            
        else {
            System.out.println("true");
        }

    
    }
}