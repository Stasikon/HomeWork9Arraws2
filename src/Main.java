public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }
    public static void task1() {
        System.out.println("Задание 1 ");
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Сумма трат за месяц составила "+arr[i]+" рублей");

        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int minBox = arr[0];
        for (int current : arr) {
            if (current < minBox) {
                minBox = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minBox+" рублей");
        int maxBox = arr[29];
        for (int current : arr) {
            if (current > maxBox) {
                maxBox = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxBox + " рублей");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double averageBox;
        int sumAverage = 0;
        for (int j : arr){
            sumAverage += j;
        }
        averageBox = sumAverage/arr.length;
        System.out.println("Средняя сумма трат за день составила " + averageBox + " рублей");
        }


    public static void task4() {
        System.out.println("Задание 4");
        int [] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100_000)+100_000;
        }
        return arr;
    }
    }
