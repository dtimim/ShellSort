public class ShellSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{-44, 43, 38, 107, 63, 9, 34, 101, -71};
        sortBySelect(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }

    public static void sortBySelect(int[] array) {
        int length = array.length;
        int step = length / 2;
        while (step > 0) {
            for (int numberOfGroup = 1; numberOfGroup < length - step; numberOfGroup++) {
                int j = numberOfGroup;
                while (j >= 0 && array[j] > array[j + step]) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
    }
}

