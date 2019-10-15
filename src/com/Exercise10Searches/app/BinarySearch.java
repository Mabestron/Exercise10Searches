package com.Exercise10Searches.app;
import java.util.Random;
import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		//constants declarations
		final int ELEMENTS_ARRAY=10;
		
		//Variable declaration
		int numberToFind=0;
		int indexFound=-1;
		int limInf=0;
		int limSup=ELEMENTS_ARRAY-1;
		int pivotal=limInf+(limSup-limInf)/2;
		int temp=0;
				
		//array declaration
		int [] miArray= new int[ELEMENTS_ARRAY];
		
		//object construction
		Random randomNumbers =new Random(System.nanoTime());
		Scanner input = new Scanner (System.in);
		
/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//CREACION DEL VECTOR DESORDENADO
		
		//Array initialization
		System.out.println(" VECTOR DESORDENADO ");
		
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			miArray[i]= randomNumbers.nextInt(101);
		}

/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//MUESTRA EL VECTOR DESORDENADO
		
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{			
		System.out.println(miArray[i]+" ");	
		}
		
		System.out.println(" ");

/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//PEDIR DATO Y CORROBORAR QUE NO ES NEGATIVO
		
		do
		{
			System.out.println("Ingrese el valor a buscar: ");
			numberToFind=input.nextInt();
			
			if(numberToFind<0)
			{
				System.out.println("Ingrese un numero mayor o igual a cero!!");
			}
			
		}while(numberToFind<0);
		
		
///////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
		//ORDENAMIENTO DEL VECTOR POR METODO DE BURBUJA
		

		for(int i=0;i<ELEMENTS_ARRAY;i++) 
		{
			for (int j=0;j<ELEMENTS_ARRAY-1;j++)
			{
				if(miArray[j]>miArray[j+1])
				{
					temp=miArray[j+1];
					miArray[j+1]=miArray[j];
					miArray[j]=temp;
				}
			}
		}

/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//MUESTRA EL VECTOR ORDENADO
		
		System.out.println(" VECTOR ORDENADO ");
		
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{			
		System.out.println(miArray[i]+" ");	
		}
		
		System.out.println(" ");
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//BUSCA LA POSICION DEL NUMERO INTRODUCIDO POR EL USUARIO POR EL METODO BINARY
		
		while (limInf<=limSup)
		{
			pivotal= limInf+(limSup-limInf)/2;
			if (numberToFind==miArray[pivotal])
			{
				indexFound=pivotal;
				break;
			}
			else if(numberToFind>miArray[pivotal])
			{
				limInf = pivotal+1;
			}
			
			else if(numberToFind<miArray[pivotal])
			{
				limSup = pivotal-1;
			}
				
		}
	
/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
		//MUESTRA LOS MENSAJES DE LA POSICION ENCONTRADA
		
		if(indexFound!=-1)
		{
			System.out.println("Elemento encontrado en la posicion:"+indexFound);
		}
		else
		{
			System.out.println("Elemento no encontrado");
		}
		
		
		}
		
		
	}
