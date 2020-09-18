public class shellSort {
    public static int[] sort(int[] list) {
// 按插入排序的话，最好分成一组一组来插入。但是也可以比较方便地，不用分成每一组来处理，而是遍历gap后的每一个元素，然后再分组处理

        for (int gap = list.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.length; i++) {
                int j = i;
                // 循环条件成立时，即是还没找到正确的位置，交换
                while (j - gap >= 0 && list[j] < list[j-gap]) {
                    // 交换
                    int temp = list[j - gap];
                    list[j - gap] = list[j];
                    list[j] = temp;
                    // 向前走
                    j -= gap;
                }

            }
        }
        return list;
    }

}
