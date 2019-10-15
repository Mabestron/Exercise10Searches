package com.Exercise10Searches.app;

import java.util.Random;
import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		//constant declaration
		final int ELEMENTS_ARRAY=100;
		
		//variables
		int numberToFind=0;
		
		//Array declaration
		int [] vector = new int[ELEMENTS_ARRAY];
		
		Random numbers= new Random(System.nanoTime());
		Scanner input =new Scanner(System.in);
		
		//relleno del vector		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		
		//visualizacion del vector
		for (int i=0; i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(vector[i]+" ");
		}
		
		System.out.println(" ");
		
		do
		{
			System.out.println("Ingrese el valor a buscar: ");
			numberToFind=input.nextInt();
			
			if(numberToFind<0)
			{
				System.out.println("Ingrese un numero mayor o igual a cero!!");
			}
			
			
		}while(numberToFind<0);
		
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(numberToFind==vector[i])
			{
				
			}
		}

	}

}
