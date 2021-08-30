package Interviu;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(convertToInteger("0000-14a58cb"));
    }

    public static int convertToInteger(String str) {
        if (str.length() < 1) {
            return 0;
        }

        if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            if (str.charAt(0) != ' ' && str.charAt(0) != '-'
                    && str.charAt(0) != '+') {
                return 0;
            }
        }

        str.trim();

        double result = 0;
        char flag = '+';
        int counter = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (counter > 1) {
                return 0;
            }
            if (str.charAt(i) == '.' || str.charAt(i) == ',') {
                break;
            }
            if (str.charAt(i) == '-') {
                flag = '-';
                counter++;
            }
            if (str.charAt(i) == '+') {
                flag = '+';
                counter++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result = result * 10 + str.charAt(i) - '0';
            }
            if (str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9') {
                return 0;
            }
        }

        if (flag == '-') {
            result = -result;
        }

        if (result >= Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else if (result <= Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        return (int)result;
    }
}
