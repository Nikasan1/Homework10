public class Homework10 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int index = 0;
        int number = 1;
        for (; index < 100; index++) {
            a[index] = number;
            if ((number < 40 & number % 5 == 4) | (number > 50) & (number < 90) & number % 5 == 4 |(number < 140 & number % 5 == 4) | (number > 150) & (number < 190) & number % 5 == 4) {
                index--;
            } else if (((number >= 40) & (number < 50)) | ((number >= 90) & (number < 100))|((number >= 140) & (number < 150))) {
                index--;
            } else {
                System.out.print("Порядковий номер шатлу: " + index + " ");
                System.out.println("Число шатлу: " + a[index]);
            }
            number++;
        }


    }
}
