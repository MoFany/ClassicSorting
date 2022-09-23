package sort;

import java.util.Objects;

/**
 * @author MoFany-J
 * @date 2022/9/13
 * @description MainClass
 */
public class MainClass {
    /**
     * 反序序列
     * */
    private int[] array1={0,1,2,3,4,5,6,7,8,9,10};
    /**
     * 有序序列
     * */
    private int[] array2={10,9,8,7,6,5,4,3,2,1,0};
    /**
     * 乱序序列
     * */
    private int[] array3={5,3,7,6,4,1,0,2,9,12,8};
    /**
     * 含重复值序列
     * */
    private int[] array4={10,0,100,6,100,1,0,2,9,10,8};
    /**
     * 方法作用：打印数组元素
     * */
    public static void printArray(int[] array){
        for (int arr:array) {
            System.out.print(arr+"\t");
        }
        System.out.println();
    }
    /**
     * 主方法
     * */
    public static void main(String[]args){
        //创建排序对象，调用排序方法
        SortClass sortObj=new SortClass();
        /*1.选择排序测试*/
        MainClass mc1=new MainClass();
        //反序数列
        sortObj.selectSort(mc1.array1);
        MainClass.printArray(mc1.array1);
        //有序数列
        sortObj.selectSort(mc1.array2);
        MainClass.printArray(mc1.array2);
        //乱序数列
        sortObj.selectSort(mc1.array3);
        MainClass.printArray(mc1.array3);
        /*2.冒泡排序测试*/
        MainClass mc2=new MainClass();
        //反序序列
        sortObj.bubbleSort(mc2.array1);
        MainClass.printArray(mc2.array1);
        //有序序列
        sortObj.bubbleSort(mc2.array2);
        MainClass.printArray(mc2.array2);
        //乱序序列
        sortObj.bubbleSort(mc2.array3);
        MainClass.printArray(mc2.array3);
        /*3.快速排序*/
        MainClass mc3=new MainClass();
        System.out.println("-------------------------------------");
        //反序序列
        sortObj.quickSort(mc3.array1, 0,mc3.array1.length-1);
        MainClass.printArray(mc3.array1);
        System.out.println("-------------------------------------");
        //有序序列
        sortObj.quickSort(mc3.array2, 0,mc3.array2.length-1);
        MainClass.printArray(mc3.array2);
        System.out.println("-------------------------------------");
        //乱序序列
        sortObj.quickSort(mc3.array3, 0,mc3.array3.length-1);
        MainClass.printArray(mc3.array3);
        System.out.println("-------------------------------------");
        /*4.插入排序*/
        MainClass mc4=new MainClass();
        //反序序列
        sortObj.insertionSort(mc4.array1);
        MainClass.printArray(mc4.array1);
        //有序序列
        sortObj.insertionSort(mc4.array2);
        MainClass.printArray(mc4.array2);
        //乱序
        sortObj.insertionSort(mc4.array3);
        MainClass.printArray(mc4.array3);
        /*5.原地归并排序（不用第三方数组）*/
        MainClass mc5=new MainClass();
        System.out.println("原地归并排序：");
        //反序
        sortObj.mergeSort(mc5.array1,0,mc5.array1.length-1);
        MainClass.printArray(mc5.array1);
        //有序
        sortObj.mergeSort(mc5.array2,0,mc5.array2.length-1);
        MainClass.printArray(mc5.array2);
        //乱序
        sortObj.mergeSort(mc5.array3,0,mc5.array3.length-1);
        MainClass.printArray(mc5.array3);
        /*6.希尔排序*/
        MainClass mc6=new MainClass();
        //反序
        sortObj.shellSort(mc6.array1);
        MainClass.printArray(mc6.array1);
        //有序
        sortObj.shellSort(mc6.array2);
        MainClass.printArray(mc6.array2);
        //乱序
        sortObj.shellSort(mc6.array3);
        MainClass.printArray(mc6.array3);
        /*7.基数排序*/
        MainClass mc7=new MainClass();
        //反序
        sortObj.radixSort(mc7.array1);
        MainClass.printArray(mc7.array1);
        //有序
        sortObj.radixSort(mc7.array2);
        MainClass.printArray(mc7.array2);
        //乱序
        sortObj.radixSort(mc7.array3);
        MainClass.printArray(mc7.array3);
        /*8.桶排序*/
        System.out.println("**************桶排序**************");
        MainClass mc8=new MainClass();
        //反序
        sortObj.bucketSort(mc8.array1);
        MainClass.printArray(mc8.array1);
        //有序
        sortObj.bucketSort(mc8.array2);
        MainClass.printArray(mc8.array2);
        //乱序
        sortObj.bucketSort(mc8.array3);
        MainClass.printArray(mc8.array3);
        //含重复值序列
        sortObj.bucketSort(mc8.array4);
        MainClass.printArray(mc8.array4);
        System.out.println("**************桶排序**************");
        /*9.堆排序*/
        MainClass mc9=new MainClass();
        //反序
        sortObj.heapSort(mc9.array1);
        MainClass.printArray(mc9.array1);
        //有序
        sortObj.heapSort(mc9.array2);
        MainClass.printArray(mc9.array2);
        //乱序
        sortObj.heapSort(mc9.array3);
        MainClass.printArray(mc9.array3);
        /*10.计数排序*/
        MainClass mc10=new MainClass();
        //反序
        sortObj.counterSort(mc10.array1);
        MainClass.printArray(mc10.array1);
        //有序
        sortObj.counterSort(mc10.array2);
        MainClass.printArray(mc10.array2);
        //乱序
        sortObj.counterSort(mc10.array3);
        MainClass.printArray(mc10.array3);
        //含重复值序列
        sortObj.counterSort(mc10.array4);
        MainClass.printArray(mc10.array4);
    }
}
