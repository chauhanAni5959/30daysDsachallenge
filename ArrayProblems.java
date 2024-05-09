import java.util.*;

public class ArrayProblems {

    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] >= 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                return Math.abs(arr[i]);
            }
        }
        return -1;
    }

    public static void ArrayAdd() {
        int[] a = {1, 2, 3, 7, 5};
        int s = 12;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[i + 1] == s) {
                    System.out.println(i + " " + (i + 1));
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void ArrayMajority() {
        int[] a = {1, 2, 3, 3, 2, 2, 8, 8};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count = a[i];
                } else {
                    count = -1;
                }
            }
        }
        System.out.println(count);

    }

    public static void Array() {
        int s[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < s.length; i++) {
            if (s[i] % 2 == 0) {
                System.out.println(s[i]);
            } else {
                System.out.println(s[i]);
            }
        }
    }

    public static void Subarray() {
        int[] a = {1, 2, 3, 4, 5};
        int i = a.length - 2;
        Arrays.sort(a);
        System.out.println(a[i]);


    }

    public static void Binary_Search(int s, int e, int target) {
        int[] a = {1, 2, 3, 4, 5, 6};

        while (s <= e) {
            if (a[s] == target) {
                System.out.println(a[s]);

            }
        }

    }

    public static void missingarray() {
        int[] a = {1, 2, 3, 5, 5};

        for (int i = 1; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Yes");

                } else {
                    System.out.println("-1");
                }
            }
        }
    }

    public static int missingnumber() {
        int[] a = {1, 3, 4, 5};

        int ans = 0;

        for (int i = 1; i <= a.length + 1; i++) {
            ans = ans + i;
        }
        for (int j = 0; j < a.length; j++) {
            ans = ans - a[j];
        }
        return ans;
    }

    public static void Twopointer() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        int target = 7;
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            sum = a[left] + a[right];
            if (sum == target) {
                System.out.println(a[left]);
                System.out.println(a[right]);
                break;
            } else if (sum < target) {
                left += 1;

            } else {
                right -= 1;
            }
        }
    }

    public static void Twopointersmy() {
        int[] a = {1, -1, 2, -2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                System.out.println(a[j]);
                System.out.println(a[i]);
            }

        }
    }

    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//           int ans = 0;
        int[] ans = {};
        while (num >= 0) {
            if (num == 0) {
                System.out.println(0);
                break;
            } else if (num != 0) {
                ans[num] = num;
                num--;

            } else {
                num = -1;
            }
        }
        System.out.println(ans);

    }

    public static void ArrayProblem() {
        int[] a = {1, 2, 3, 5, 8, 8};
        int sum = 0;
//            for(int i = 0 ; i< a.length; i++){
//                sum = sum + i;
//            }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

    }

    public static void String() {
        String s = "My Name Is Ankit";
        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == 'A') {
                System.out.println(s.charAt(i) - 'A');
            }

        }
    }

    public static void ArrayEven() {
        int[] a = {9, 7, 6, 5, 4, 3, 8, 2, 1};
        int[] ans = new int[10];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {

            }
        }
    }

    public static void AddTwoArraylist() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);
        ArrayList<Integer> ans = new ArrayList<>(10);
        System.out.println("First ArrayList :" + a);
        System.out.println("Second arrayList :" + b);
        for (int i = 0; i < a.size(); i++) {
            ans.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            ans.add(b.get(i));
        }

        System.out.println(ans);
    }

    public static void Arrayp() {
        int[] a = {1, 2, 3, 3, 4, 4, 5};
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] == a[right]) {
                System.out.println("YEs");
                left++;
            } else {
                System.out.println("No");

            }
        }


    }

    public static void A() {
        ArrayList<Integer> a = new ArrayList<>(10);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        ArrayList<Integer> b = new ArrayList<>(10);
        b.add(1);
        b.add(3);
        b.add(3);
        b.add(1);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.size() - 1 + b.size() - 1; i++) {
            if (a.contains(b.get(i))) {
                ans.add(a.get(i));
            }

        }
        System.out.println(ans);
    }

    static void ArrayCount() {
        int[] a = {1, 2, 2, 3, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;

            } else {
                count = count + 0;
            }
        }
        System.out.println(count + "times");
    }

    static HashMap<String, Integer> HashSeting() {
        HashMap<String, Integer> ans = new HashMap<>(10);
        ans.put("One", 1);
        ans.put("Two", 2);
        ans.put("Three", 3);
        ans.put("Four", 4);
        ans.put("Five", 5);
        ans.put("Six", 6);
        ans.put("Seven", 7);
        ans.put("Eight", 8);
        ans.put("Nine", 9);
        return ans;


    }

    ArrayList<String> ArrayCount_plus(String s) {
        ArrayList<String> ans = new ArrayList<>(10);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ans.add("Yes");
            } else {
                ans.add("No");
            }

        }
        return ans;


    }

    static void Three_Sum() {


        ArrayList<Integer> Subarray = new ArrayList<>();


        int[] a = {1, 2, 3};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == a.length) {
                a[i] = a[i] + 1;
            }
            Subarray.add(a[i]);
        }
        System.out.println(Subarray);


    }


    public ArrayList<Integer> Reverse_in_sequence(int[] arr, int Size, int Rev) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = Rev; i >= 0; i--) {
            ans.add(arr[i]);
        }
        return ans;

    }


    public static void Array_New() {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void Binary_Search(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;

            } else if (arr[mid] == key) {
                System.out.println("Found ! at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not found at any index!");
        }
    }

    public static void Binarysearch(int[] arr, int first, int last, int key) {

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                mid = first + 1;
            } else if (arr[mid] == key) {
                System.out.println("Found it at a index : " + mid);
                break;
            } else {
                mid = last - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not found!");
        }

    }

    public static void pekay_element() {
        int arr[] = {2, 3, 4, 1, 10};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }

    public static int first_Occurence(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        int mid = start + (end - start) / 2;
        int ans = -1;
        while (start <= end) {
            if (nums[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > nums[mid]) {
                start = mid + 1;
            } else if (key < nums[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;

    }

    public static int last_Occurence(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        int mid = start + (end - start) / 2;
        int ans = -1;
        while (start <= end) {
            if (nums[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > nums[mid]) {
                start = mid + 1;
            } else if (key < nums[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;

    }

    public static int Occurence(int[] nums, int target) {
        int first = first_Occurence(nums, 4);
        int last = last_Occurence(nums, 4);
        return (last - first) + 1;
    }

    public static void Two_Sum() {
        StringBuffer s = new StringBuffer("My name is ANkit");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A') {

            }
        }

    }

    public static ArrayList<Integer> TwoSum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>(2);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] + arr[i] == target) {
                ans.add(i);
                ans.add(i + 1);
                break;
            } else {
                ans.add(-1);
                break;
            }
        }
        return ans;
    }

    public static void printSubstrings(String str) {
        //Your code goes here

        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static boolean Check() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 5, 3};
        int count = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == b[i]) {
                count++;
            } else {
                count = 0;
            }
        }
        if (count == b.length) {
            return true;
        }
        return false;
    }

    public static void Sorting() {
        int[] a = {0, 2, 1, 3, 4, 4, 1, 0};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void Problem_no_1(int[] arr, int sum) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                ans.add(i);
            } else {
                ans.add(i);
            }
        }
        System.out.println(ans);


    }















    public static String Problem(){

    }






    public static void main(String[] args) {
        TwoSum(arr, target);
        int [] arr = {1,2,3,4,5,6};


    }
}








