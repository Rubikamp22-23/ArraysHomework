public class SmallestNumberWithLoop {
    public static void main(String[] args) {
        //Tihs program gives us the smallest number in the array.
        double numbres[] = { 4, 95.4, 29.4, -25.9, 42, 823, -4};

        double min = numbres[0];
        for (int i = 0; i < numbres.length; i++) {
            if(numbres[i] <min)
                min = numbres[i];}
        System.out.println("Smallest number is " + min);
    }
}

