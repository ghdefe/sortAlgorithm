/**
 * 选择排序
 * 选择排序从前往后，每次扫描找到最小的数的下标，然后交换放到前面，逐步缩小
 */
public class selectSort {
    public static int[] sort(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            int j = i+1;
            int min = i;
            for (; j < args.length; j++) {
                if (args[j] < args[min])
                    min = j;
            }
            int temp = args[i];
            args[i] = args[min];
            args[min] = temp;
        }
        return args;
    }
}
