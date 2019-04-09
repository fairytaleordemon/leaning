package algorithm;

/**
 * 希尔排序（缩小增量排序）
 * 核心思想：
 *      即初始化一个增量X，每次进行比较下标为0到0+X。如果后者较小，则进行交换。
 *      下标加一进行比较
 *      比较完X次后，令X=X-1，再进行上述操作。
 *
 * https://images2018.cnblogs.com/blog/849589/201803/849589-20180331170017421-364506073.gif
 *
 *
 * @author blackey
 * @date 2019/4/3
 */
public class ShellSort extends Sort {


    @Override
    void sort(int[] arr) {
        int len = arr.length;
        int gap = len / 2;

        //先取增量序列，这里使用7
        for (; gap > 0; gap = gap / 2) {
            System.out.println("希尔排序第 " + gap + " 次");
            for (int i = gap; i < len; i++) {
                int j = i;
                int current = arr[i];
                while (j - gap >= 0 && current < arr[j - gap]) {
                    System.out.println("希尔排序内循环j等于：" + j);
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = current;
            }
        }
    }
}
