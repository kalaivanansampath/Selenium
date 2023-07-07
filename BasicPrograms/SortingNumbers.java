package com.BasicPrograms;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 3,12,4,67,23,14,89,5 };
		//int index= -1;
		int temp = 0;
		for (int i = 0; i <array.length; i++){
			//index = i;
			for (int j = i + 1 ; j < array.length; j++){
			if (array[j] < array[i]){	
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			}
			}
		}
		int a = array.length -2;
		System.out.println(array[a]);
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.print(array[i] +  " ");   
		}   
		
	}

}


/*

int index= -1;
		int temp = 0;
		for (int i = 0; i <array.length; i++){
			index = i;
			for (int j = i ; j <= array.length-1; j++){
			if (array[j] < array[index]){
			index = j;
			}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			}
*/