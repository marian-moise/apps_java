package Algorithms;

public class ExcelColumn {
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String s) {
        int columnNr = 0;
        for(char c : s.toCharArray()){
            columnNr = c-64 + columnNr*26;
        }
        return columnNr;
    }
}
