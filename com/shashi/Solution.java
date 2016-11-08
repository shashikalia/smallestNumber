package com.shashi;

public class Solution {

	public static final int ZERO_INDEX=0;
	
	public static void main(String[] args) {
		int[] numbers = new int[]{1,3,5,8,5,6,7};
		System.out.println(sum(numbers));
	}
	
	static int sum(int[] numbers) {
		int smallestNumber = numbers[ZERO_INDEX];
		int smallestNumberIndex = ZERO_INDEX;
		int secondSmallestNumber=-1;
		boolean isSecondSmallestNumberPresent = false;
		
		// find the smallest number
		for(int index=ZERO_INDEX; index<numbers.length; index++) {
			if(smallestNumber > numbers[index]) {
				smallestNumber = numbers[index];
				smallestNumberIndex = index;
			}
		}
		
		// find the second smallest number
		for(int index=ZERO_INDEX; index<numbers.length; index++) {
			if(smallestNumberIndex == index || smallestNumberIndex==index-1 ||
					smallestNumberIndex==index+1) {
				continue;
			} else {
				if(isSecondSmallestNumberPresent == false) {
					secondSmallestNumber = numbers[index];
					isSecondSmallestNumberPresent = true;
				} else {
					if(secondSmallestNumber> numbers[index]) {
						secondSmallestNumber=numbers[index];
					}
				}
			}
		}
		
		if(isSecondSmallestNumberPresent) {
			return smallestNumber+secondSmallestNumber;
		}
		
		return 0;
	}
}
