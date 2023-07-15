package adapter.peopleRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
random Name
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println();

        char charA = 'a';
        int a = (int) charA;
//        System.out.println(a);
        char charZ = 'z';
//        System.out.println((int) charZ);

        Random random = new Random();
        for (int k = 0; k < 8; k++) {
            StringBuilder stringBuilder = new StringBuilder();
            List<Integer> integers = new ArrayList<>();
            int i = random.nextInt(26) + 65;
            integers.add(i);
            int length = random.nextInt(8) + 1;
            for (int j = 0; j < length; j++) {
                int letter = random.nextInt(26) + 97;
                integers.add(letter);
            }

            for (int m = 0; m < integers.size(); m++) {
                int temp = integers.get(m);
                char sign = (char) temp;
                stringBuilder.append(sign);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
