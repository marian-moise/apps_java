package Section3_BigO;

public class BigO_2 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        System.out.println(anotherFunChallange(array1));

    }

    public static String anotherFunChallange(int[] input) {
        int a = 5;//O(1)
        int b = 10;//O(1)
        int c = 50;//O(1)
        String whoAmI = "I don't know";//O(1)

        for (int i = 0; i < input.length; i++) {
            int x = i + 1;//O(n)
            int y = i + 2;//O(n)
            int z = i + 3;//O(n)

        }

        for (int j = 0; j < input.length; j++) {
            int p = j * 2;//O(n)
            int q = j * 2;//O(n)
        }
        return whoAmI;//O(1)
    }
    //5 + 5n
    //adica O(1 + n)
}

