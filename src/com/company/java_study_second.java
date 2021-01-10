package com.company;

public class java_study_second {

    public static void main(String[] args) {
        //int형 1차 배열 선언
        int aa[]  = {0,1,2,3,4};

        for(int i=0; i < aa.length; i++){
            System.out.println(aa[i]);
        }

        //int형 2차 배열 선언
        int aa_11[][] = {{0,1,2,3,4},{0,1,2,3,4,5}};

        for(int j=0; j < aa_11.length; j++){
            for (int k =0; k < aa_11[j].length; k++){
                System.out.print(aa_11[j][k]);
                if(k != aa_11[j].length - 1){
                    System.out.print(",");
                }else{
                    System.out.println("");
                }
            }
        }
    }
}
