public class task4 {
    public static void main(String[] args) {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = 0;
        // Нужно расмотреть два случая, когда количество элементов четное, и когда не четное, за счет доп переменной можем делать замену стремясь к середине, проверила работу на четном количестве

        if (reverseFullName.length%2 == 0){
            for (int i = 0; i < (reverseFullName.length/2); i++) {
            a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = a;
        }
        }
        if (reverseFullName.length%2 != 0){
            for (int i = 0; i < (reverseFullName.length/2+1); i++) {
            a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = a;
        }
        }
        System.out.print(reverseFullName);
    }
}
