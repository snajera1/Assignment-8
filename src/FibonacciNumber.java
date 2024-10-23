public class FibonacciNumber {
    public static void main(String[] args) throws Exception {

        try { //Tries to calculate the fibonacci sequence up until the number the user inputted in a command line argument
            int fNum = Integer.parseInt(args[0]); //Converts the main string array 

            if (fNum < 0) { //If the number is less than zero, an exception is forcefully thrown with a warning message to the user
                throw new Exception("You must enter a positive number!");
            }

            int num1 = 0; //Variables that calculate the numbers in the fibonacci sequence
            int num2 = 1;
            int currentNum = num2;

            int count = 2; //Control variable that counts the location in the fibonacci sequence. Starts at 2 because the places 0 and 1 are already accounted for through conditional statements

            if (fNum == 0) { //Checks if the user wants the number at place 0 in the fibonacci sequence and prints the result
                System.out.println(0);
            } else if (fNum == 1) { //Checks if the user wants the number at place 1 in the fibonacci sequence and prints the result
                System.out.println(1);
            } else { 
                while (count < fNum) { //While loop that runs until the counter gets to the place the fibonacci sequence that the user gave
                    num1 = num2; //Sets num1 and num2 to be the values of the previous two numbers to the current place so they can be added to give the number in the current place
                    num2 = currentNum;
                    currentNum = num1 + num2;
                    count++;
                }
                System.out.println(currentNum); //Prints the number at the place in the fibonacci sequence the user gave
            }
        } catch (Exception e) { //Catches any exceptions and prints the error message
            e.printStackTrace();
        }
    }
}
