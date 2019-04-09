package algorithm;

/**
 * 冒泡排序
 *
 * 核心思想：
 *      比较两个相邻的元素，较大的后移。进行重复循环即可。
 *      需要注意的是，每一次循环都需要对数组减一，因为每次遍历出来最大的已经在最后一个了。无需再进行遍历。
 *
 * https://images2017.cnblogs.com/blog/849589/201710/849589-20171015223238449-2146169197.gif
 *
 * @author blackey
 * @date 2019/4/3
 */
public class BubbleSort extends Sort {

    @Override
    void sort(int[] arr) {
        for (int i = 0; i <
                arr.length -
                        1; i++) {
            //len - 1 - i 减一是数组的变量角标从0开始
            // - i 是因为遍历一次后，最大值已经产出，无需在向上遍历
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
