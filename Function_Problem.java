public class Function_Problem {

    int find_Max(int a, int b, int c){
        int max  = 0;

        if( a> b && a > c ){
            max = a;
        } else if (b > a && b > c) {
            max = b;
        }
        else{
            max = c;
        }
        return  max;

    }
    void palindrome(int number ){

       int rev = 0;
       int temp;
       temp = number;
       while(number>0){
           rev = rev*10 + (number % 10);
           number = number/10;
       }

       if(temp == rev){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
    void string_palindrome(String s){
        String rev = "";
        for(int i = s.length() -1; i >= 0; i--){
            rev = rev + s.charAt(i);

        }
        if(s.contains(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        Function_Problem obj = new Function_Problem();
       obj.string_palindrome("1001");
    }
}
