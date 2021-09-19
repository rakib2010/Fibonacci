
package evidence;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20,69,12,56,21,2,52};
        
        for(int i =1;i<arr.length-1;i++){
            
            for(int j =0; j<arr.length-i;j++){
                
                // Swap value
                
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                
            
            }
            
            }
        
        
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
    }
    
}
