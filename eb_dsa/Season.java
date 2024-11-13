import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if(A>=3 && A<=5){
            System.out.println("Spring");
        }else if(A>=6 && A<=8){
            System.out.println("Summer");
        }else if(A>=9 && A<=11){
            System.out.println("Autumn");
        }else if(A==12 || A==1 || A==2){
            System.out.println("Winter");
        }else{
            System.out.println("Invalid");
        }
        
    }
}
