public class Array {
    public static void main(String[] args){
//        Declare array;
        int arr[];
        int[] arr1;
//        creating array
        arr = new int[5];
        arr1 = new int [2];


        int number[] = {2,3,4,5};
        String[] names = {"Alice", "Bob", "Charlie"};

//        accessing elemnt elemnt of array
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 10;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

//        Iterate through array
        for(int i = 0; i<arr.length;i++){
            System.out.println("array"+ i+ ": "+ arr[i]);
        }
//        for ecah loop
        for(int num: arr){
            System.out.println("for each : "+ num);
        }
// ..............2D Array
//        datatype name[][] = new datatype[row][col];
        int arr2d[][] = new int [2][3];
        arr2d[0][1] = 1;
        arr2d[0][2] = 2;




        int[][] arrlist = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arrlist[i][j]);}
        }
    }


}

