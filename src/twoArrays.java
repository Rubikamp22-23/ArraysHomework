import java.util.Arrays;

public class twoArrays {
    public static void main(String[] args) {
        //This program prints 2 reports together (names and grades) and then shows the students' status according to their grades.
        String[] names = new String[4];
        names[0] = "Bahar";
        names[1] = "Nafas";
        names[2] = "Sima";
        names[3] = "Shadi";

        double[] scores = {18.5, 4.25, 20, 11};

        for (int i = 0; i < names.length; i++) {
            if (scores[i] > 14) {
                System.out.println(names[i] + "'s score is " + scores[i] + " and she passed the exam.");
            } else {
                System.out.println(names[i] + "'s score is " + scores[i] + " and she failed the exam.");
            }
        }
    }
}