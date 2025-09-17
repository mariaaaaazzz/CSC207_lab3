package edu.grinnell.csc207.testing;

public class Functions {

	/**
	 * @param arr the input array
	 * @return the third greatest element of arr if it has at least three elements,
	 *         the greatest element of arr if it has two elements, and
	 *         the singleton element if it only has one element
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static int thirdGreatest(int[] arr) {
		//copied fixed version from debugging lab
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        } else if (arr.length == 1){
            return arr[0];
        } else if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        } else {

            int g1 = Math.max(arr[0], Math.max(arr[1], arr[2]));
            int g2 = 0;  // placeholder value
            int g3 = Math.min(arr[0], Math.min(arr[1], arr[2]));

            for(int i = 0; i < 3; i++){
                if(arr[i] != g1 && arr[i] != g3){
                    g2 = arr[i];
                }
            }

            for (int i = 3; i < arr.length; i++) {
                if (arr[i] > g1) {
                    g3 = g2;
                    g2 = g1;
                    g1 = arr[i];
                }
                else if (arr[i] > g2) {
                    g3 = g2;
                    g2 = arr[i];
                }
                else if (arr[i] > g3) {
                    g3 = arr[i];
                }
            }
            return g3;
        }
    }
    /**
	 * @param n a positive integer
	 * @return the sum of n and all positive numbers less than n.
	 */
    public static int Summation(int n) {
        int m = 0;
        for(int i = n; i >= 0; i--) {
            m += i;
        } return m;
    }
    /**
	 * @param arr an array of integers
	 * @return the minimum value in arr.
	 * @throws IllegalArgumentException if the array is empty
	 */
    public static int Minimum(int[] arr) {
        int min = arr[0];
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }
    /**
	 * @param n a positive integer
	 * @return the nth Lucas Number - returns 2 if n is 0, and returns 1 if n is 1.
	 */
    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        }
        int p0 = 2;
        int p1 = 1;
        int p = 0;
        int i = 2;
        while(i <= n){
            p = p1 + p0;
            p0 = p1;
            p1 = p;
            i++;
        }
        return p;
    }
    /**
	 * @param arr the input array
	 * @return the starting index of s where the first occurrence of t can be found, returns -1 otherwise.
	 */
    public static int substring(String s, String t) {
        boolean check = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(0)){
                for(int j = 1; j < t.length(); j++){
                    if(s.charAt(i+j) != t.charAt(j)){
                        check = false;
                    }
                }
                if(check){
                    return i;
                }
            }
        }
        return -1;
    }
    /**
     * 
     * 
	 * @param arr an array of numbers, which will be sorted from smallest to largest with this function.
	 * @throws IllegalArgumentException if the array is empty
	 */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < k) {
                    arr[i] = arr[j];
                    arr[j] = k;
                    k = arr[i];
                }
            }
        }
    }
}
