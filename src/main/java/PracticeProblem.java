/**

        * File: Lesson 5.6 Parralel Arrays
        * Author: Mansoor Muhammad
        * Date Created: May 8, 2026
        * Date Last Modified: May 8, 2026
        */

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static int getAge(String[] names, int[] ages, String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                return ages[i];
            }
        }

        return -1;
    }

    public static int[] createLengthArray(String[] arr) {
        int[] lengths = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lengths[i] = arr[i].length();
        }

        return lengths;
    }

    public static void swapPeople(String[] names, int[] ages, String name1, String name2) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < names.length; i++) {
            if (name1.equals(names[i])) {
                index1 = i;
            }

            if (name2.equals(names[i])) {
                index2 = i;
            }
        }

        String tempName = names[index1];
        names[index1] = names[index2];
        names[index2] = tempName;

        int tempAge = ages[index1];
        ages[index1] = ages[index2];
        ages[index2] = tempAge;
    }
}
