/**
 * 归并排序，先把拆散所有，再归并
 */
public class mergeSort {
    public static int[] sort(int[] args) {
        divide(args, 0, args.length - 1);
        return args;
    }

    static void divide(int[] a, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        divide(a, left, mid);
        divide(a, mid + 1, right);
        merge(a, left, mid, right);

    }

    static void merge(int[] a, int left, int mid, int right) {
        int mid1 = mid + 1, left1 = left;
        int[] temp = new int[a.length];
        int location = left;
        while (left <= mid && mid1 <= right) {
            if (a[left] < a[mid1])
                temp[location++] = a[left++];
            else
                temp[location++] = a[mid1++];
        }
        while (left <= mid) {
            temp[location++] = a[left++];
        }
        while (mid1 <= right) {
            temp[location++] = a[mid1++];
        }

        for (int i = left1; i <= right; i++) {
            a[i] = temp[i];
        }
    }


}
