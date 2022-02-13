package Algorithms.RemoveSpecificCharacterFromString;

public class RemoveChar {
    public static void main(String[] args) {
        String s = "Ego Zenovius votum posui";
        //using custom method
        System.out.println(removeCharacter(s, 'v'));
        System.out.println(removeCharacter(s, ' '));
        //using replaceAll
        System.out.println(s.replaceAll("E", ""));
    }

    public static String removeCharacter(String s, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (c != s.charAt(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
