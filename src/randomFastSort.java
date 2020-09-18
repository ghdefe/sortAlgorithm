import java.util.Random;

/**
 * 快速排序
 * 快速排序首先选择第一个元素，将第一个元素作为分界点
 * 定义左右指针，先移动右指针，找到比分界元素小的，把该元素放到第一个位置（空位）
 * 然后移动左指针，找到比分界大的，放到右指针空出的位置上。
 * 依次弄完后，分为两个部分，递归使用该算法
 */
public class randomFastSort {
    public static int[] sort(int[] args) {
        return sort(args,0,args.length-1);
    }

    public static int[] sort(int[] args,int left,int right) {
        if (left >= right){
            return args;
        }
        int _left = left,_right = right;
        int divide = left + (int)( (right-left) * new Random().nextFloat());
        int temp = args[divide];  //分界点
        while (left != right) {
            while (left != right && args[right] >= temp) {
                right--;
            }
            args[divide] = args[right];
            divide = right;
            while (left != right && args[left] <= temp){
                left++;
            }
            args[divide] = args[left];
            divide = left;
        }
        args[left] = temp;
        sort(args,_left,left-1);
        sort(args,left+1,_right);
        return args;
    }
}
