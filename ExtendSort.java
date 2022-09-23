package sort;

import java.util.Objects;

/**
 * @author MoFany-J
 * @date 2022/9/14
 * @description ExtendSort 该类继承自排序类，该类的作用是基于10大排序的扩展排序
 */
class ExtendSort extends SortClass{
    /**
     * 插值排序
     * */
    public int[] insertionValueSort(int[] array,int value) {
        //排序的前提是目标序列最初得有序，所以调用父类选择排序先排序
        super.selectSort(array);
        //然后将要插入的值插入到这个有序序列中形成新的有序序列
        int[] arr=new int[array.length+1];
        for (int i=0;i<array.length;i++){
            arr[i]=array[i];
        }
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[arr.length-2]>=value){
                index= arr.length-1;
                arr[index]=value;
                return arr;
            }
            if(value>arr[i]){
                index=i;
                break;
            }else if (value==arr[i]){
                index=i+1;
                break;
            }
        }
        int temp1=arr[index];
        arr[index]=value;
        for (int i=index+1;i< arr.length;i++){
            int temp2=temp1;
            temp1=arr[i];
            arr[i]=temp2;
        }
        return arr;
    }
    /**
     * 子类重写父类方法（覆盖），第二种形式的选择排序
     * 该选择排序省去了每次记录排序规则中最值的下标
     * */
    @Override
    public void selectSort(int...array){
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                //降序排序
                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    /**
     * 子类重写父类的方法（覆盖），归并排序（非原地归并）
     * */
    @Override
    public void mergeSort(int[] array,int firstIndex,int lastIndex){
    }
}
