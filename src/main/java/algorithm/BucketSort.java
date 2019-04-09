package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 桶排序
 *
 * 核心算法
 *      假设输入数据服从均匀分布，将数据分到有限数量的桶里，
 *      每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排）。
 *
 *
 * 图片地址：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015232107090-1920702011.png
 *
 * @author blackey
 * @date 2019/4/8
 */
public class BucketSort extends Sort {

    @Override
    void sort(int[] arr) {
        if (arr ==
                null &&
                arr.length ==
                        0) {
            return;
        }

        //这里默认为10，规定待排数[0,100)
        int bucketNums = 10;
        //桶的索引
        List<List<Integer>> buckets = new ArrayList<List<Integer>>();

        for (int i = 0; i <
                10; i++) {
            //用链表比较合适
            buckets.add(new LinkedList<Integer>());
        }

        //划分桶
        for (int i = 0; i <
                arr.length; i++) {
            buckets.get(f(arr[i])).add(arr[i]);
        }

        //对每个桶进行排序
        for (int i = 0; i <
                buckets.size(); i++) {
            if (!buckets.get(i).isEmpty()) {
                //对每个桶进行快排
                Collections.sort(buckets.get(i));
            }
        }

        //还原排好序的数组
        int k = 0;
        for (List<Integer> bucket : buckets) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }
    }

    public static int f(int x) {
        return x /
                10;
    }

    public static void main(String[] args) {
        new BucketSort().sort(Sort.arr);
    }
}
