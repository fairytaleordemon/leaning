package algorithm;

/**
 * 归并排序
 *
 * 核心思想
 *      将乱序的数组取下标0，1 进行比较、2，3进行比较、4、5进行进行比较、6、7进行比较
 *      再两两合并，0、1、2、3进行排序。4、5、6、7进行排序
 *      再进行合并、0、1、2、3、4、5、6、7进行归并得到最终序列。
 *
 *
 * 图片链接：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230557043-37375010.gif
 * https://camo.githubusercontent.com/29cee6111676d88550fc6c9671c558d77731a691/687474703a2f2f7374617469632e636f646563656f2e636f6d2f696d616765732f323031362f30332f64663834373833363264396234323931336530323265666639346434336562342e706e67
 *
 *
 * @author blackey
 * @date 2019/4/3
 */
public class MergeSort extends Sort {

    @Override
    void sort(int[] arr) {
        mergeSort(arr,0,arr.length - 1);
    }

    void mergeSort(int[] arr,int left,int right){
        System.out.println("当前左指针是left = "+ left + "右指针 right =" + right);
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        System.out.println("执行归并左边，左指针是left = "+ left + "右指针 right =" + right);
        mergeSort(arr,left,mid);
        System.out.println("执行归并右边，左指针是mid = "+ (mid+1) + "右指针 right =" + right);
        mergeSort(arr,mid + 1,right);
        System.out.println("开始进行合并操作");
        merge(arr, left, mid ,right);
    }

    void merge(int[] arr,int left,int mid, int right){
        System.out.println("》》》》左指针是left = "+ left + "中间指针是mid = "+ (mid+1) + "右指针 right =" + right);
        int[] temp = new int[right - left + 1];

        int i = left;
        //由于数组是从0开始，所以需要mid + 1
        int j = mid + 1;
        int k = 0;

        //先将区间内的数据比较，将较大的前置
        while (i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        //进行merge，将区间段剩余数据填充
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        //重新把数据再填充给arr数组
        for(int p=0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        new MergeSort().sort(Sort.arr);
    }
}
