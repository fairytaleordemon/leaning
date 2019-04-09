package algorithm;

/**
 * 堆排序
 *      ​ 常见的二叉堆实现是数组形式，因为二叉堆的父子节点在数组中索引有明确的数学关系：
 *      Left(i) = i * 2, Right(i) = i * 2 + 1, i是当前节点索引，Left表达式求解当前节点的左子节点索引，Right表达式求解当前节点的右子节点索引。
 *
 * 核心思想
 *      先构建一个无序堆顶区，
 *      将叶子节点放入堆顶，如果不满足堆定义，则需要重新调整堆直至平衡。
 *      这时候堆顶元素则是最大的，重复2即可。
 *
 * 图片地址：https://images2017.cnblogs.com/blog/849589/201710/849589-20171015231308699-356134237.gif
 *
 * @author blackey
 * @date 2019/4/4
 */
public class HeapSort extends Sort {

    @Override
    void sort(int[] arr) {
        if(arr == null || arr.length == 0){
            return ;}

        //建立大顶堆
        for(int i=arr.length / 2; i>=0; i--) {
            heapAdjust(arr, i, arr.length-1);
        }

        for(int i=arr.length-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapAdjust(arr, 0, i-1);
        }
    }


    void heapAdjust(int[] arr,int start,int end){
        int temp = arr[start];

        for(int i = 2 * start + 1; i<=end; i *= 2) {
            //左右孩子的节点分别为2*i+1,2*i+2

            //选择出左右孩子较小的下标
            if(i < end  && arr[i] < arr[i+1]) {
                i ++;
            }
            if(temp >= arr[i]) {
                //已经为大顶堆，=保持稳定性。
                break;
            }
            //将子节点上移
            arr[start] = arr[i];
            //下一轮筛选
            start = i;
        }

        //插入正确的位置
        arr[start] = temp;
    }

    public static void main(String[] args) {
        new HeapSort().sort(Sort.arr);
    }
}
