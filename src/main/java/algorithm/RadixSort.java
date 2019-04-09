package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 基数排序
 *
 * 核心算法：
 *      基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。有时候有些属性是有优先级顺序的，
 *      先按低优先级排序，再按高优先级排序。最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
 *
 * 图片地址：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015232453668-1397662527.gif
 *
 * @author blackey
 * @date 2019/4/8
 */
public class RadixSort extends Sort {

    @Override
    void sort(int[] arr) {
        if (arr == null && arr.length == 0) {
            return;
        }
        int maxBit = getMaxBit(arr);

        for (int i = 1; i <= maxBit; i++) {
            //分配
            List<List<Integer>> buf = distribute(arr, i);
            //收集
            collecte(arr, buf);
        }
    }

    /**
     * 分配
     *
     * @param arr  待分配数组
     * @param iBit 要分配第几位
     * @return
     */
    public static List<List<Integer>> distribute(int[] arr, int iBit) {
        List<List<Integer>> buf = new ArrayList<List<Integer>>();
        for (int j = 0; j < 10; j++) {
            buf.add(new LinkedList<Integer>());
        }
        for (int i = 0; i <
                arr.length; i++) {
            buf.get(getNBit(arr[i], iBit)).add(arr[i]);
        }
        return buf;
    }

    /**
     * 收集
     *
     * @param arr 把分配的数据收集到arr中
     * @param buf
     */
    public static void collecte(int[] arr, List<List<Integer>> buf) {
        int k = 0;
        for (List<Integer> bucket : buf) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }

    }

    /**
     * 获取最大位数
     *
     * @return
     */
    public static int getMaxBit(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            int len = (ele + "").length();
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    /**
     * 获取x的第n位，如果没有则为0.
     *
     * @param x
     * @param n
     * @return
     */
    public static int getNBit(int x, int n) {

        String sx = x + "";
        if (sx.length() < n) {
            return 0;
        } else {
            return sx.charAt(sx.length() -  n) - '0';
        }
    }

}
