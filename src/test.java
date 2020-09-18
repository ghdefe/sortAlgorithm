import java.util.*;

public class test {
    public static void main(String[] args) {
        int temp[] = random_order_array(100000);
        int test[] = temp;
//        System.out.println(Arrays.toString(temp));
        long now = System.currentTimeMillis();
        int[] sort = bubbleSort.sort(test);
        System.out.println("用时：" + (System.currentTimeMillis() - now));
//        System.out.println("冒泡排序" + Arrays.toString(sort));
        System.out.println(is_ordered_array(test));

        test = temp;
        now = System.currentTimeMillis();
        sort = selectSort.sort(test);
        System.out.println("用时：" + (System.currentTimeMillis() - now));
//        System.out.println("选择排序" + Arrays.toString(sort));
        System.out.println(is_ordered_array(test));

        test = temp;
        now = System.currentTimeMillis();
        sort = insertSort.sort(test);
        System.out.println("用时：" + (System.currentTimeMillis() - now));
//        System.out.println("插入排序" + Arrays.toString(sort));
        System.out.println(is_ordered_array(test));

//        test = temp;
//        now = System.currentTimeMillis();
//        sort = fastSort.sort(test);
//        System.out.println("用时：" + (System.currentTimeMillis() - now));
////        System.out.println("快速排序" + Arrays.toString(sort));
//        System.out.println(is_ordered_array(test));

//        test = random_order_array(10000);
//        now = System.currentTimeMillis();
//        sort = randomFastSort.sort(test);
//        System.out.println("用时：" + (System.currentTimeMillis() - now));
//        System.out.println("随机快排" + Arrays.toString(sort));
//        System.out.println(is_ordered_array(test));

        test = temp;
        now = System.currentTimeMillis();
        sort = mergeSort.sort(test);
        System.out.println("用时：" + (System.currentTimeMillis() - now));
//        System.out.println("归并排序" + Arrays.toString(sort));
        System.out.println(is_ordered_array(test));


    }

    public static int [] random_order_array(int len){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < len; i ++){
            list.add(new Random().nextInt(50000));
        }
        Collections.shuffle(list);
        int [] array = new int [len];
        for (int i = 0; i < len; i ++)
            array[i] = list.get(i);
        return array;
    }


    public static boolean is_ordered_array(int [] array){
        for (int i = 1; i < array.length; i ++){
            if (array[i-1] > array[i])
                return false;
        }
        return true;
    }

}
