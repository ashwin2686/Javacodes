public class IntegertoString {
 
 public String s= "";
    // Method
    // Returning String from integer value
    public String tostring(int n)
    {
      while (n>0)
      {
          
          int num;
          num = n%10;
         
          s = ""+(num)+""+s;
          n= n/10;
     }
      return s;
    }
      
    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Input integer value
        int n = 12340321;
        
        IntegertoString inttostring = new IntegertoString();
         
        System.out.println(inttostring.tostring(n));
         }
}
