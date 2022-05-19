package ss11_Dsa_Stack_Queue.baitap.Demerging;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Demerging> queueFemale = new LinkedList<>();
        Queue<Demerging> queueMale = new LinkedList<>();
        Demerging[] emerging= new Demerging[5];
        emerging[0]= new Demerging("tâm",true,199);
        emerging[1]= new Demerging("a",false,199);
        emerging[2]= new Demerging("b",true,199);
        emerging[3]= new Demerging("c",false,199);
        emerging[4]= new Demerging("d",false,199);
        System.out.println(emerging.toString());
        for (Demerging item:emerging) {
            if(item.getGender()){
                queueMale.add(item);
            }
            else{
                queueFemale.add(item);
            }
        }
        System.out.println("\n"+queueMale);
        System.out.println("\n"+queueFemale);
    }
}
