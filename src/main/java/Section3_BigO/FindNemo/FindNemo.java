package Section3_BigO.FindNemo;

import java.text.DecimalFormat;

public class FindNemo {
    //masurare performanta functie findNemo

    public static void main(String[] args) {

        String[] nemo = {"nemo"};
        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};
        String[] large = new String[10000];


        findNemo(everyone);
        //findNemoLarge(large);


    }

    public static void findNemo(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("running");
            if (args[i].equalsIgnoreCase("nemo")) {
                System.out.println("Found NEMO");
                break;
            }

        }
    }

    public static void findNemoLarge(String[] large) {
        double t0 = 0.000000000000000000000000000000000000000000000000000000000000000000;
        t0++;
        for (int i = 0; i < large.length; i++) {
            large[i] = "Found NEMO";
            System.out.println(large[i]);
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(10);

        System.out.println("Finding Nemo took " + df.format(t0) + " miliseconds");
    }


}

