 package AndrewChen;

public class AChenLib {

    public static int sumUpTo(int num) {
        //Created variable for the sum of the numbers
        int sum = 0;
        //Number must be above 0 to start
        if (num > 0) {
            //Loops until index reaches the intended number
            for (int i = 0; i <= num; i++) {
                //Add index to the sum
                sum = sum + i;
            }
        } else {
            //Returns original number if it is not above 0
            return num;
        }
        // Returns the sum of all the numbers
        return sum;
    }

    public static Boolean isPalindrome(String str) {
        //Created empty string as an output
        String out = "";
        //Checks if length of string is above 0
        if (str.length() > 0) {
            //Loops until i reaches the beginning letter of the word
            for (int i = str.length() - 1; i >= 0; i--) {
                //Each letter returned is concatenated into the empty string
                out = out + str.substring(i, i + 1);
            }
        } else {
            //If the string input characters are below zero prompt this message
            System.out.println("This string contains no characters.");
        }
        //Returns true or false
        return (out.equals(str));
    }

    public static String dateStr(String str) {
        //Stores the month in a variable
        String month = str.substring(0, 2);
        //Stores the date in a variable
        String date = str.substring(3, 5);
        //Concatenates all the variables and dashes into a string called "out"
        String out = date + "-" + month + "-" + str.substring(6);
        //Returns output string
        return out;
    }

    public static String cutOut(String mainStr, String subStr){
        //Creates an integer variable and adds the length of substring to the position of the first instance the substring is mentioned
        int x = mainStr.indexOf(subStr) + subStr.length();
        //Returns main string from index of x and onwards
        return mainStr.substring(x);
    }

    public static String multiplicationTable(int x, int n) {
        //Creates temp variable for products
        int temp = 0;
        //Loops for the range of n
        for (int i = 0; i <= n; i++) {
            //Multiplies x and index until i is equal to n
            temp = x * i;
            //Prints each base times index
            System.out.println(x + " times " + i + " is " + temp);
        }
        return "Final value is " + temp;
    }
}
