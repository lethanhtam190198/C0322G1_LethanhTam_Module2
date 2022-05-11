package ss4_class.baitap.StopWatch;

import java.util.Arrays;

public class RunWatch {
    public static void main(String[] args) {

        int [] array= new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*1000);
        }
        ClassStopWatch classStopWatch=new ClassStopWatch();
        classStopWatch.star();
        sort(array);
        classStopWatch.stop();
        System.out.println(Arrays.toString(array));
        System.out.println("Time:"+classStopWatch.getElapsedTime());
    }
    public static void sort(int... array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    int swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;
                }
            }
        }

    }
}
