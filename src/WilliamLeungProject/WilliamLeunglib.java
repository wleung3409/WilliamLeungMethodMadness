package WilliamLeungProject;

public class WilliamLeunglib {
    public static boolean palindrome(String input) {
        String backwards = "";
        ///create a new string so we can test if the input is the same as its backwards
        for (int x = input.length(); x > 0; x--) {
            ///using the input's length we can create a substring backwards
            backwards = backwards + input.substring(x - 1, x);
        }
        ///then test if it is a palindrome
        return (backwards.equals(input));
    }

    public static String dateStr(String input) {
        String day = input.substring(0, 2);
        String month = input.substring(3, 5);
        String year = input.substring(6);
        /// assign values, substrings, for the days,months and years
        String output = month + "-" + day + "-" + year;
        ///put them together in the format we want
        return output;
    }

    public static String cutOut(String mainStr, String subStr) {
        int position = mainStr.indexOf(subStr);
        /// first find where the subStr is located in the code
        String cutoff = mainStr.substring(0, position) + mainStr.substring(position + subStr.length());
        ///create a substring where it begins at 0 and the position, skips the subStr, and then continue, basically cutting it off
        return cutoff;
    }

    public static boolean isFibonacci(int input) {
        int sum = 0;
        int x = 0;
        int y = 1;
        /// set three variables, one sum, and the two to add up to that sum
        while (sum <= input) {
            x = y;
            y = sum;
            sum = x + y;
            /// set the sum to the highest fibonacci number given the input
        }
        return (input == sum - x);
        /// return true of false based on the previous fibonacci number
    }

    public static int sumupTo(int input) {
        int sum = 0;
        for (int z = 0; z <= input; z++) {
            sum = sum + z;
        }
        /// keeps adding until it reaches input, returns the sum of all numbers before it
        return sum;
    }
    public static String quadSolver(double a,double b, double c){
        double discriminant = b * b - 4 * a * c;
        if ((discriminant < 0)) {
            return "Complex Roots";
            /// the discriminant determines if the roots are complex or not, it also helps with setting up the next part
        }
        double x = (-1*b + Math.sqrt(discriminant))/(2*a);
        double y = (-1*b - Math.sqrt(discriminant))/(2*a);
        /// quadratic formula has two answers, + and - , I set and returned both values
        return x + "," +y;
        }
    }