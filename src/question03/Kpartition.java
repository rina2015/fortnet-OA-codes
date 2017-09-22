package question03;

public class Kpartition {
   public Boolean separateArray(int[] input, int k) {
       // if list is null, OR k is invalid, OR k is larger than the size of thi input list,
       // then it is impossible to divide
       if (input == null || k < 1 || input.length < k) {
           return false;
       }

       // if k is 1, then the whole list is the subset
       if (k == 1) {
           return true;
       }

       int sum = 0;
       for (int i : input) {
           sum += i;
       }

       // if the sum of the list is not divisible by K, then it can't be divided
       if (sum % k != 0) {
           return false;
       }

       int subsetSum = sum / k;
       int length = input.length;
       int[] subset = new int[k];
       boolean[] isTaken = new boolean[length];

       // initialize first subsubset sum as last element of the input array and mark that element as taken
       subset[0] = input[length - 1];
       isTaken[length - 1] = true;

       //  call recursive method to check K-substitution condition
       return isKPartitionPossibleRec(input, subset, isTaken,
               subsetSum, k, 0, length - 1);
   }

   public Boolean isKPartitionPossibleRec(int[] input, int[] subset, boolean[] isTaken, int subsetSum, int k, int leftSubsetIndex, int limitIndex) {
       int length = input.length;

       if (subset[leftSubsetIndex] == subsetSum) {
           //  leftSubsetIndex (K - 2) represents (K - 1) subsets of equal
           //    sum last partition will already remain with sum=subsetSum
           if (leftSubsetIndex == k - 2)
               return true;

           //  recursive call for next subset partition
           return isKPartitionPossibleRec(input, subset, isTaken, subsetSum,
                   k, leftSubsetIndex + 1, length - 1);
       }

       //  start from limitIndex and put elements into the current partition
       for (int i = limitIndex; i >= 0; i--) {
           //  if already taken, continue
           if (isTaken[i])
               continue;
           int tmp = subset[leftSubsetIndex] + input[i];

           // if temp is less than subsetSum then only include the element
           // and call recursively
           if (tmp <= subsetSum) {
               //  mark the element and include into current partition sum
               isTaken[i] = true;
               subset[leftSubsetIndex] += input[i];
               boolean next = isKPartitionPossibleRec(input, subset, isTaken,
                       subsetSum, k, leftSubsetIndex, i - 1);

               // after recursive call unmark the element and remove from
               // subset partition sum
               isTaken[i] = false;
               subset[leftSubsetIndex] -= input[i];
               if (next)
                   return true;
           }
       }
       return false;
   }

   public static void main(String[] args) {
       Kpartition kpartition = new Kpartition();
       int[] input = {1,2,4,5,3,3};
       //Arrays.sort(input);
       int k = 3;
       System.out.println("isDividable = " + kpartition.separateArray(input, k));

   }
}
