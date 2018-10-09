package BasicKnowledgeLearning;

public class ArrayAndSort {
    //数据初始化
    int[] array;

    ArrayAndSort(int[] arraytemp){
        this.array = arraytemp;
    }
    /**
     * 冒泡排序
     * 要排序的数组
     * 外层循环控制总的比较轮数，内层循环不断两两比较
     */
    public void sort(){
        for(int i=1; i<array.length; i++){
            for(int j=0; j<array.length-i; j++ ){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        showArray(array);
    }

    /**
     * 直接选择排序
     * 直接找到最大的放至最后
     */
    public void selectSort(){
        int index=0;
        for(int i =1; i<array.length; i++){
            for(int j=1; j<array.length-i; j++){
                if(array[j] > array[index]){
                    index=j;
                }
            }//找出一轮中最大的数
            int temp =array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = temp;
        }
        showArray(array);
    }

    /**
     * 反转排序
     * 将一个数组第一个元素与最后一个元素互换，以此类推
     */
    public void reverseSort(){
        System.out.println("原始数组为：");
        showArray(array);
        int len = array.length;
        for(int i =0; i<len/2; i++){
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }
        System.out.println("反转之后的数组为：");
        showArray(array);
    }

    public void showArray(int[] array){
        for(int i : array){
            System.out.print(">" + i);
        }
        System.out.println();
    }
}
