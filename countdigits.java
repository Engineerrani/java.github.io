public class countdigits {
 public static void main(String[] args){
            int countdigits = 0,num = 0003452;
            while (num!=0) {
                num /=10;
                ++countdigits;

            }
            System.out.println("Number of digits:"+countdigits);
            
        
    }   
}
