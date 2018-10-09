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
        String cutoff = mainStr.substring(0, position) + mainStr.substring(position + subStr.length());
        return cutoff;
    }

    public static boolean isFibonnaci(int input) {
        int sum = 0;
        int x = 0;
        int y = 1;
        while (sum <= input) {
            x = y;
            y = sum;
            sum = x + y;
        }
        return (input == sum - x);
    }

    public static int sumupTo(int input) {
        int sum = 0;
        for (int z = 0; z <= input; z++) {
            sum = sum + z;
        }
        return sum;
    }
}

