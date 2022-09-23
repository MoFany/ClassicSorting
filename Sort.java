package sort;

/**
 * @author MoFany-J
 * @date 2022/9/12
 * @description Sort
 */
/**
 * 该接口的成员方法为10大排序，即十种排序的方法方法
 * 该接口又继承了原地归并排序接口
 * 接口中默认方法的作用：实现类既可以选择重写又可以选择使用接口本身默认方法中的代码
 * 接口中抽象方法只有方法原型，没有方法体，除非是static、default方法才能有方法体
 *
 * 接口类中包含三中方法public abstract、public default、public static三中方法
 * 接口中成员变量只能是：全局常量 static final 且必须初始化
 * */
interface Sort extends InplaceMergeSort{
    /**
     * 1.选择排序
     * */
    void selectSort(int[] array);
    /**
     * 2.冒泡排序
     * */
    void bubbleSort(int[] array);
    /**
     * 3.快速排序
     * */
    void quickSort(int[] array,int firstIndex,int lastIndex);
    /**
     * 4.插入排序
     * */
    void insertionSort(int[] array);
    /**
     * 5.归并排序
     * */
    void mergeSort(int[] array,int firstIndex,int lastIndex);
    /**
     * 6.希尔排序
     * */
    void shellSort(int[] array);
    /**
     * 7.基数排序
     * */
    void radixSort(int[] array);
    /**
     * 8.桶排序
     * */
    void bucketSort(int[] array);
    /**
     * 9.堆排序
     * */
    void heapSort(int[] array);
    /**
     * 10.计数排序
     * */
    void counterSort(int[] array);
}