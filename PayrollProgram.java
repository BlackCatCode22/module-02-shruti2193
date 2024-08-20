import java.util.Scanner;

public class PayrollProgram {
    public static void main(String[] args) {

        System.out.printf("\n\n ..... Welcome to the payroll program.....");
        // variables used int this program.

String userName = "";
int hoursWorked = 0;
int overtimeHours = 0;
int anotherNumber;
int payRate = 0;
int weeklyPayWithoutOvertime = 0;
double hrlyPayRate = 0.0;
double overtimepay =0.0;

// Say hello to the user and get the pay information.
        // Get the user's name
        // Create a scanner object to get input from the user.
        Scanner myscannerObj = new Scanner(System.in);
//Get the user's name
        System.out.println("\n please enter your name: ");
        userName = myscannerObj.nextLine();
        System.out.println("Hello !" + userName + " how are you today ?");
        // get weekly hours worked from the user.
        // output statement prompting the user for hrs worked
        System.out.println("\n Please enter how many hours you worked this week (please use whole numbers)");
        // Use the scanner object to get input from this prompt, and store what was returned
        hoursWorked = myscannerObj.nextInt();
        System.out.println("\n Please enter hourly pay rate(please use whole numbers)");
        payRate = myscannerObj.nextInt();
        // create an output statement to the used echoing the user's input.
        System.out.println("\n Hey" + userName + " you worked: " + hoursWorked +" this week!" );
        //Proccessing
        overtimeHours= hoursWorked - 40;
        if (hoursWorked>40) {
            overtimepay = overtimeHours * payRate * 1.5;
        }
        else {
            overtimepay = 0;
        }
        // calculate weekly regular pay
        if (hoursWorked>40) {
            weeklyPayWithoutOvertime = hrlyPayRate * 
        }






    }
}