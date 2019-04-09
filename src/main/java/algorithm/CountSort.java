package algorithm;

import java.util.Arrays;

/**
 * 计数排序
 *      计数排序要求输入的数据必须是有确定范围的整数
 *
 * 核心思想
 *      找出数据中最大和最小的元素
 *      重新分配一个新的数组空间，空间的坐标是数据中最大和最小元素的差。
 *      将与数据下标相同的值放入该坐标中
 *
 * 图片地址：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015231740840-6968181.gif
 *
 * @author blackey
 * @date 2019/4/4
 */
public class CountSort extends Sort {

    @Override
    void sort(int[] arr) {
        if (arr ==  null || arr.length == 0) {
            return;
        }

        int max = max(arr);
        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new CountSort().sort(Sort.arr);
    }
}
