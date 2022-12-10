package com.guru.hema

public class Scalar {
	
	public static void main(String[] args) {
		unRepeated(new int[] {3,6,3,6,8});
	}
	
	
	public static int unRepeated(int[] arr) {
		int N=arr.length;
		int xor= 0;
		for(int i=0;i<N;i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}

}
