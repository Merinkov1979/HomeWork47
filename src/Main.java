public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

//task 1
        int sum = 0;
        for (int spendingDay : arr) {
            sum += spendingDay;
            System.out.printf("Сумма трат за месяц составила %s рублей",sum);



            //task 2



                }
        int maxSpending = 0;
        int minSpending = 0;
        for ( int i = 0; i < arr.length; i++) {
            if ( minSpending > arr[1]) {
                maxSpending = arr[1];
            } else if (maxSpending < arr[1] ) {
                maxSpending = arr[1];

            }
            System.out.println("Максимальная сумма трат за день составила " + minSpending + " рублей.");


        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
