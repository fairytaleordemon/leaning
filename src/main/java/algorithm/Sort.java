package algorithm;

/**
 * 排序算法简介：
 * 排序算法分为比较类排序和非比较类排序
 * 比较类排序：通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn)，因此也称为非线性时间比较类排序。
 * 非比较类排序：不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称为线性时间非比较类排序。
 *
 * 比较排序
 *      交换排序：冒泡、快速排序
 *      插入排序：希尔、插入
 *      选择排序：选择、堆排序
 *      归并排序：
 * 非比较
 *      计数排序
 *      桶排序
 *      基数排序
 *
 *
 * 排序算法复杂度：https://images2018.cnblogs.com/blog/849589/201804/849589-20180402133438219-1946132192.png
 *
 * @author blackey
 * @date 2019/4/2
 *
 *
 * 排序算法参考地址：https://www.cnblogs.com/onepixel/articles/7674659.html
 * 参考地址2：https://github.com/francistao/LearningNotes/blob/master/Part3/Algorithm/Sort/%E9%9D%A2%E8%AF%95%E4%B8%AD%E7%9A%84%2010%20%E5%A4%A7%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E6%80%BB%E7%BB%93.md
 *
 */
public abstract class Sort {
    static int[] arr = {234, 45, 1, 21, 24, 24, 33, 53, 24, 45, 226, 37, 18, 9};

    abstract void sort(int[] arr);

}
