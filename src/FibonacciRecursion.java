public class FibonacciRecursion {
    public static int fibonacci(int place) {  //Defines the recursive function that will calculate the fibonacci number at the given place in the sequence

        if (place == 0) { //Provides an end point for the function, it will stop looping once it has brought the given place variable down to 0
            return 0;
        } else if (place < 0 && place <= 2) { //Accounts for the user inputting 1 or 2, as they're both 1 and the recursive function can't account for them on its own
            return 1;
        }
        return fibonacci(place - 1) + fibonacci(place - 2); //The point of recursion, calls the function twice to get the sum of the numbers at the previous two places to calculate the number at the given place
    }

    public static void main(String[] args) {
        try {
            if (Integer.parseInt(args[0]) < 0) { //If the number is less than zero, an exception is forcefully thrown with a warning message to the user
                throw new Exception("You must enter a positive number!");
            }
            System.out.println(fibonacci(Integer.parseInt(args[0]))); //Prints out the result of the fibonacci function with the user input from the command line
        } catch (Exception e) { //Catches any exceptions and prints the error
            e.printStackTrace();
        }
    }
}
