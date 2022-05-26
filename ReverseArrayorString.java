
import java.util.Arrays;



public class ReverseArrayorString {
    
     
     public static void main(String args[]) {
      
            
            int[] arr = { 1, 2,3, 8, 9 };

    

    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
int tmp = arr[i];
arr[i] = arr[j];
arr[j] = tmp;
}


 System.out.println(Arrays.toString(arr)); 
 
 
 
 String str = "abcd"; 

char[] ch = str.toCharArray();
    

    for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
char tmp = ch[i];
ch[i] = ch[j];
ch[j] = tmp;
}

System.out.println(String.copyValueOf(ch));


     }
     
}
