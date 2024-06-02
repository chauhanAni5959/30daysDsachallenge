import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Oops {





    public static ArrayList<Integer> Function(int [] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        ans.add(arr[arr.length - 1]);
        ans.add(arr[0]);
        ans.add(arr[1]);
        ans.add(arr[2]);
        ans.add(arr[3]);
        return ans;


    }
    public static String String(String s , int x){
        String ans = "";
        for(int i = 0; i < s.length() -1; i++){
            if(s.charAt(i %2) == ' '){

            }

        }
        return ans;


    }
    public static void String_builder(){
        StringBuilder ans = new StringBuilder();

        ans.append("My name is ");
        ans.append(34);
        System.out.println(ans.capacity());
        System.out.println(ans);
    }



    public static void main(String[] args) {

       



    }




}
