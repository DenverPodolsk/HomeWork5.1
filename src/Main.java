public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int summa = 0;
        summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        System.out.println("Сума трат за месяц составила " + summa + " рублей");

// Задача 2

        int minimal = arr[0];
        int maximal = arr[0];
        for (int i = 0; i < arr.length; i++) ;
       int i =0;
        {
            if (arr[i] < minimal) ;
            {
                minimal = arr[i];
            }
            if (arr[i] > maximal) ;
            maximal = arr[i];
            System.out.println("Минимальная сумма трат за день составила" + minimal + "рублей");
            System.out.println("Максимальная сумма трат за день составила" + maximal + "рублей");
        }
        // Задача 3
        System.out.println("Средняя суммы затрат за месяц составила" + summa / arr.length);

        //Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--);
        System.out.print(reverseFullName[i]);
    }


}


