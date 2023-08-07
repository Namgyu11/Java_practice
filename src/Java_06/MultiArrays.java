package Java_06;// Java 프로그래밍 - 다차원 배열

public class  MultiArrays {
    public static void main(String[] args) {

        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] myArray = {1,2,3};

        for(int i : myArray){
            System.out.println(i);
        }

        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");

        int[][] myArray2 = {{1,2,3},{4,5,6}};
        System.out.println(myArray2[1][2]);

        for(int[] ints : myArray2){
            for(int anInt: ints){
            System.out.println(anInt);
        }
        }

//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for(int i =0; i < testArray1.length; i++){
             for(int j = 0; j < testArray1[i].length; j++){
                 testArray1[i][j] = 1;
                 if(i == j){
                     testArray1[i][j] = 10;
                 }
             }
        }
        for(int[] test : testArray1){
            for(int ti : test){
                System.out.print(ti + " ");
            }
            System.out.println();
        }


    }
}
