public class FirstNonRepeatedCharFirst {
    public static void main(String args[]) {
      String inputStr ="teeyter";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            
            System.out.println("indexOf is: "+inputStr.indexOf(i)); //y =3 
            System.out.println("last index is: "+inputStr.lastIndexOf(i)); //y =3 
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
    }
}
