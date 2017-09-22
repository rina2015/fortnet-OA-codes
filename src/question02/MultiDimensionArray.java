package question02;

public class MultiDimensionArray {

//  public static Long getValue(int... indexOfDimension) {
//      //...
//      return value;
//  }

 public static Long sum(MultiDimensionArray mArray, int[] lengthOfDimension){
     // length of array lengthOfDimension is the number of dimension of the mArray
     int numberOfDimension = lengthOfDimension.length;

     Long sum = 0L;

     for (int k= 0; k < numberOfDimension; k++) {
        
     }

     return sum;
 }


 public static void main(String[] args) {

     int[][][] dataArray = {{{1,1},{2,2},{3,3}}, {{4,4},{5,5},{6,6}}, {{7,7},{8,8},{9,9}}};
     int sum = 0;
     for(int i = 0; i < dataArray.length; i++){
         for(int j = 0; j < dataArray[i].length; j++){
             for(int k = 0; k < dataArray[i][j].length; k++)
             sum += dataArray[i][j][k];
         }
     }
     System.out.println("sum = " + sum);
 }
}
