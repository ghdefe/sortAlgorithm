/**
 * 插入排序
 * 插入排序从前往后走，将当前元素插入到已排序好的元素的合适位置
 */
public class insertSort {
    public static int[] sort(int[] args) {
        for (int i = 1; i < args.length; i++) {
            for (int j = i; j > 0; j--) {
                if (args[j] < args[j-1]){
                    int temp = args[j];
                    args[j] = args[j-1];
                    args[j-1] = temp;
                }
            }
        }
        return args;
    }
}
