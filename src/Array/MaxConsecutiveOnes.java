package Array;

public class MaxConsecutiveOnes {



  public static void main(String args[]){

    int arr[] = new int[]{0,1,1,1,1,0, 1,1,1,1,1,1};

    MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

    System.out.println(obj.findMaxConsecutiveOnes(arr));


  }

  private int findMaxConsecutiveOnes(int[] arr) {

    int count = 0;
    int max = -1;

    for(int i = 0; i < arr.length; i++){

      if(arr[i] == 1){
        count ++;
      }else{
        if(max < count){
          max = count;
        }
        count = 0;
      }

    }

    if(count > max){
      max = count;
    }

    return max;

  }

}
