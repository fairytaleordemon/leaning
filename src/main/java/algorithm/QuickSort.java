package algorithm;

/**
 * 快速排序
 *
 * 核心思想：
 *      先将待排序序列分成两个子序列
 *      从左至右，选出一个基数p。
 *      重新排序该序列，将比该值大的放在基数右边，比该值小的放在左边（分区）
 *      递归的遍历比基准值小的序列，和比基准值大的序列
 *
 *  图片链接：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230936371-1413523412.gif
 *
 * @author blackey
 * @date 2019/4/3
 */
public class QuickSort extends Sort{

    @Override
    void sort(int[] arr) {
        doQuickSort(arr,0,arr.length - 1);
    }

    static void doQuickSort(int[] arr, int left, int right) {
        if ( left >=right) {
            return;
        }
        int pivotPos = quickSort(arr, left, right);
        System.out.println("递归序列，左等于："+ left + "右等于" + right);
        doQuickSort(arr, left, pivotPos -
                1);
        System.out.println("递归序列右，左等于："+ left + "右等于" + right);
        doQuickSort(arr, pivotPos +
                1, right);
    }

    static int quickSort(int[] arr, int left, int right) {
        int index = left;
        int key = arr[index];


        while (left <
                right) {
            //找到比基准数字小的数字，记录下坐标准备交换
            while (left < right && arr[right] >= key) {
                right--;
            }
            //找到比基准数大的数字，记录下坐标准备交换
            while (left < right && arr[left] <= key) {
                left++;
            }

            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[index];
        arr[index] = temp;


        for (int result : arr) {
            System.out.print(result + ",");
        }
        System.out.println();
        return left;
    }
}
