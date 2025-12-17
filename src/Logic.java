
import java.util.Arrays;

public class Logic {

    public static double stringToNumberCalc(String input) // the main logic for the calculator.
    {
        int operatorLength = input.length() + 1; // initializing the length of the operator array with the length of the input.
        double result = 0;
        char sign = ' ';
        char[] operators = new char[operatorLength]; // An array to hold our operators +, -, /, *
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(0) == '-')
            {
                sign = '-'; // check to see if the nuber is negative.
            }
            if(input.charAt(i) == '+' || input.charAt(i) == '-' && i != 0 || input.charAt(i) == '/' || input.charAt(i) == '*' && i != 0) {
                operators[i] = input.charAt(i); // scan input for one or multiple operators.
            }
        }
        String[] inputStream = input.split("[/,*,+,\\-,]"); // Splits the numbers by the operators 11+22 goes to 11, 22
        double[] numbers = new double[inputStream.length]; // Numbers are stored here.
        boolean doNotReapeat = false; // value used to determine weather this is the second operation being preformed.
        for(int i = 0; i < inputStream.length; i++)
        {
            if(inputStream[0].equals("") && sign == '-' && !doNotReapeat)
            {
                inputStream[1] = sign + inputStream[1];
                doNotReapeat = true;
                continue;
            }
            numbers[i] = Double.parseDouble(inputStream[i]); // the if statement above is used to add the negative sign to the front number if the input has a negative number.
        }

        boolean notFirst = false;
        int iterator = 1;
        int j = 0;
        if(inputStream[0].equals(""))
        {
            j = 1; // In the event that the first number is a negative an empty space will occur to remedy this we will skip over the empty spot.
        }
        for(int i = 0; i < operators.length; i++)
        {
            if(operators[i] == '+') // checks if the operator is a plus sign
            {
                if(notFirst) // if this isn't the first operation the next number is added to the result
                {
                    result = result + numbers[iterator];
                    iterator++;
                }
                else {
                    result = numbers[j] + numbers[j+1]; // if this is the first operation the two numbers in front are added together to make the result
                    notFirst = true; // notFirst is updated to true for the rest of the operation
                    j++; // the i iterator will increase the operators array every cycle
                    iterator++; // the iterator variable will go through the numbers array
                }
            }
            if(operators[i] == '-') // checks if the operator is a minus sign
            {
                if(notFirst) // if this isn't the first operation the result is subtracted from by the next number
                {
                    result = result - numbers[iterator];
                    iterator++;
                }
                else {
                    result = numbers[j] - numbers[j+1]; // if this is the first operation the first two numbers are operated on and a result is made
                    notFirst = true; // now it's not the first operation
                    j++; // increment the operators array
                    iterator++; // increment the numbers array
                }
            }
            if(operators[i] == '/') // checks if the operator is a / division sign
            {
                if(notFirst) // if this isn't the first operation the generated result is divided again
                {
                    result = result / numbers[iterator];
                    iterator++;
                }
                else {
                    result = numbers[j] / numbers[j+1]; // if this is the first operation the front two numbers are divided and a result is generated
                    notFirst = true; // no longer the first operation
                    j++; // increment the operations array
                    iterator++; // increment the numbers array
                }
            }
            if(operators[i] == '*') // checks if the operator is a * multiplication sign
            {
                if(notFirst) // if this isn't the first operation the result is multiplied
                {
                    result = result * numbers[iterator];
                    iterator++;
                }
                else {
                    result = numbers[j] * numbers[j+1]; // if this is the first operation the two front numbers are multiplied
                    notFirst = true; // no longer the first operation
                    j++; // increment the operators
                    iterator++; // increments the numbers
                }
            }
        }
        System.out.println(input); // debugging: prints the input to the console
        System.out.println(operators); // debugging: prints the operators array to console
        System.out.println(Arrays.toString(numbers)); // debugging: prints out all numbers obtained from the input to console.
        double cleanResult = Math.round(result * 100.0) / 100.0; // rounds the answer to the nearest number, should probably be removed or fixed so answers can be exact
        return cleanResult; // the result changed to double is returned.
    }

}
