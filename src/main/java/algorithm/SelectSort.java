package algorithm;

/**
 * 选择排序
 *
 * 核心思想：
 *      从一堆无序数组中找出最小（大）的，和数组第一个交换位置，依次循环即可。n个数字n-1趟即可排序完成
 *
 * @author blackey
 * @date 2019/4/3
 */
public class SelectSort extends Sort {

    @Override
    void sort(int[] arr) {
        //创建临时空间，和最大索引的下标
        int maxindex, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            maxindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //判断是否是最大值
                if (arr[j] <  arr[maxindex]) {
                    maxindex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }

    }
}
