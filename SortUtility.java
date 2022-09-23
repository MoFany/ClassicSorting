package sort;

import java.util.Arrays;

/**
 * @author MoFany-J
 * @date 2022/9/14
 * @description SortUtility 排序类SortClass的父类
 */
abstract class SortUtility{
    /**
     * 值交换方法,不额外开辟任何第三者，利用异或进行交换值
     * 任意一个数，连续异或同一个数两次，依然等于原数.
     * 但是这种交换有一个缺点，就是不能出现相同的两个数做交换这样做值会为0
     * */
    protected  void swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
