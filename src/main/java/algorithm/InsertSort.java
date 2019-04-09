package algorithm;

/**
 * 插入排序
 *
 * 核心思想：
 *      从第一个元素开始，该元素可以认为已经被排序；
 *      取出下一个元素，在已经排序的元素序列中从后向前扫描；
 *      如果该元素（已排序）大于新元素，将该元素移到下一位置
 *      重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 *      将新元素插入到该位置后；
 *      重复步骤2~5。
 *
 * 参考图片：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif
 *
 *
 * @author blackey
 * @date 2019/4/3
 */
public class InsertSort extends Sort {

    @Override
    void sort(int[] arr) {
        int len = arr.length;
        int preIndex, current;

        for (int i = 1; i < len; i++) {
            preIndex = i -  1;
            //取出当前需要排序的数据
            current = arr[i];
            //从当前节点向前查找，如果当前节点比前一个节点小，则坐标前移
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }
}
