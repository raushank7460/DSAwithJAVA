package DSA;

public class SumOfEvenArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int sumOfEven=0;
        for(int ele:arr){
            if(ele%2==0){
                sumOfEven+=ele;
            }
        }
        System.out.println(sumOfEven);
    }
    
}
