public class MethodArray {
    public static void main(String[] args) {
        method();
        Multiple();
        Laptop();
        Addnumbers();
        DisplayResult();
    }

    public static void method() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Method : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void Multiple() {
        String[] array = {"Amruta", "Arya", "Anurag"};

        System.out.print("Multiple: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void Laptop() {
        double[] array = {1.5, 2.7, 3.9};

        System.out.print("Laptop: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void Addnumbers() {
        char[] array = {'a', 'b', 'c'};

        System.out.print("Addnumbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void DisplayResult() {
        boolean[] array = {true, false, true};

        System.out.print("DisplayResult: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
