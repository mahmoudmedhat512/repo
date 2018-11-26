package com.company;

public class Main {

    public static void main(String[] args) {
	// SWE Team 4
    }
	
	public static boolean is_prime(int n) {
		if(n == 1 ) return false;
		for(int i=2 ; i<n;i++) {
			if(n%i == 0 ) return false;
		}return true;
		
	}
	
	public static int smallest_prime(int arr[]) {
		ArrayList<Integer> prime_array = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean x = is_prime(arr[i]);
			if(x == true) {
				System.out.println(arr[i]);
			prime_array.add(arr[i]);
			}
		
			
		}
		if(prime_array.size() == 0 ) {prime_array.add(-1);}
		Collections.sort(prime_array);
		
		
		return prime_array.get(0);
		
	}
}
