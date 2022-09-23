package sort;

/**
 * @author MoFany-J
 * @date 2022/9/16
 * @description InplaceMergeSort 该接口的作用实现原地归并排序
 *
 */
public interface InplaceMergeSort {
    /**
     * 接口的默认方法
     * 方法作用：合并
     *
     * @param array 受操作的数组
     * @param firstIndex 当前待排序序列的首元素下标
     * @param mid 当前待排序序列中间值下标
     * @param lastIndex 当前待排序序列尾元素下标
     */
    public default void merge(int[] array, int firstIndex, int mid, int lastIndex) {
        //第一个子序列的当前下标
        int oneArrayIndex = firstIndex;
        //第二个子序列的当前下标
        int twoArrayIndex = mid + 1;
        while (oneArrayIndex < twoArrayIndex && twoArrayIndex <= lastIndex) {
            //index始终记录后者子序列，即子序列2的当前元素的下标位置
            int index = twoArrayIndex;
            //降序排序，先排最大值,最后排最小值；子序列1的数若大于等于子序列2的数时一直过
            while (oneArrayIndex < twoArrayIndex && array[oneArrayIndex] >= array[twoArrayIndex]) {
                oneArrayIndex++;
            }
            //降序排序，先排最大值,最后排最小值；子序列2的数若大于子序列1的数也一直过
            while (twoArrayIndex <= lastIndex && array[twoArrayIndex] > array[oneArrayIndex]) {
                twoArrayIndex++;
            }
            //在默认方法中可以调用静态方法,调用原地归并排序接口的转换方法
            convert(array, oneArrayIndex, index - 1, twoArrayIndex - 1);
            //第一个子序列的每一次移动的偏移量=第二个子序列当前位置-第二个子序列前一次的位置
            oneArrayIndex += twoArrayIndex - index;
        }
    }

    /**
     * 方法作用；利用三次反转算法（手摇算法）实现将一个范围的数组元素，前一部分与后一部分对调交换（相当于内存交换）
     *
     * @param array 受操作的数组
     * @param firstIndex 当前待排序序列的首元素下标
     * @param mid 当前待排序序列中间值下标
     * @param lastIndex 当前待排序序列尾元素下标
     */
    public static void convert(int[] array, int firstIndex, int mid, int lastIndex) {
        //1.先反转前：firstIndex~mid范围内的数组元素反转
        reverse(array, firstIndex, mid);
        //2.再反转后：mid+1~firstIndex范围内的数组元素反转
        reverse(array, mid + 1, lastIndex);
        //3.最后整体反转，即：firstIndex~lastIndex范围内地数组元素全部反转
        reverse(array, firstIndex, lastIndex);
    }

    /**
     * 方法作用；将指定范围内的数组元素进行反转，从外到内两两对应交换，若序列为奇数时最后一个数则默认不用交换
     *
     * @param array 受操作的数组
     * @param firstIndex 当前待排序序列的首元素下标
     * @param lastIndex 当前待排序序列尾元素下标
     */
    public static void reverse(int[] array, int firstIndex, int lastIndex) {
        //当firstIndex==lastIndex时即指向同一数组元素的索引故结束交换
        while (firstIndex < lastIndex) {
            swap(array, firstIndex++, lastIndex--);
        }
    }

    /**
     * 方法作用：不用辅助变量实现两个数的交换（这种交换不用于两个相同的数作交换否则值为了，异或同为0）
     *
     * @param array 受操作的数组
     * @param i 目的下标
     * @param j 源下标
     */
    public static void swap(int[] array, int i, int j) {
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
    }
}
