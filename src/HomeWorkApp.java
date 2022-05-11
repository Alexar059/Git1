public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if (a == 2) {
            System.out.println("Сумма положительная");
        }

        if (b == 3) {
            System.out.println("Сумма положительная");
        }
    }


    public static void printColor() {
        int value = 5;
        if (value < 0) {
            System.out.println("красный");
        }
        if (value < 100) {
            System.out.println("желтый");
        }
        if (value > 100) {
            System.out.println("зеленый");
        }
    }


    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        if (a < b) {
            System.out.println("a < b");
        }

    }
}
