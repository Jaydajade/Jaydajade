package chitlada.phorn.lab2;

/*
 * The patient infomation program
 * This program accept 3 arguments
 * The output is
 * Patient's name: patient_name
 * Patient's age: patient_age
 * Patient's Gender: patient_age
 * 
 * Name: Phornphatsorn Chitladaphorn
 * Student ID: 663040656-7
 * Sec:1
 */

public class Patient {
    public static void main(String[] args) {
        if (args.length !=3){
            System.err.println("Error: Invalid number of arguments. Please provide exactly three arguments");
        }
        else{
            System.out.println("Patient's name: "+args[0]); 
            System.out.println("Age: "+args[1]);
            System.out.println("Gender: "+args[2]);
        }
    }


    
}
