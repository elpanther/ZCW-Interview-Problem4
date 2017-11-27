package io.zipcoder;

public class Problem4 {


   // private String[] userInputString = new String[];
        static final int Westeros = 256;
        static boolean dothrakiDefense(String wildFire)
        {
            int[] count = new int[Westeros];

            for (int i = 0; i < wildFire.length();  i++)
                count[wildFire.charAt(i)]++;
            int odd = 0;
            for (int i = 0; i < Westeros; i++)
            {
                if ((count[i] & 1) != 0)
                    odd++;

                if (odd > 1)
                    return false;
            }
            return true;
        }


    }
