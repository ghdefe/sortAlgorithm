
/**
 * 冒泡排序
 * 从后往前，逐渐缩小范围
 */
public class bubbleSort {
    public static int[] sort(int[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (args[j] > args[j+1]){
                    int temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
        return args;
    }
}
