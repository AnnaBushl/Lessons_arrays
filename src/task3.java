public class task3 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float middle = 0f;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        middle = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей.");
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
