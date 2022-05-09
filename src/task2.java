public class task2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]); Оставила данную строчку для проверки
            if (arr[i] < min){
                min = arr[i];

            }else {
                if (arr[i] > max){
                    max = arr[i];
                }
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

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
