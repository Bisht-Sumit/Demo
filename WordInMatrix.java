package com.sumit.MathUtils;

public class WordInMatrix 
{
	// Dimensios of the 2-D Array N * N
	final static int dimensions = 3;

	//Array defined
	final static char matrixArray[][] = { 
			{'x','y','z'},
			{'d','o','g'},
			{'a','b','c'}
	};
	
	public static void main(String[] args)
	{

		final WordInMatrix wordFind = new WordInMatrix();
		boolean isWordPresent = wordFind.isVerticalCheck(matrixArray, dimensions) 
				|| wordFind.isHorizantalCheck(matrixArray);
		System.out.println(isWordPresent);
	}

	public boolean isHorizantalCheck(final char[][] matrixArray)
	{
		boolean isWordPresent = false;
		for(char [] ch : matrixArray)
		{
			final StringBuilder chr = new StringBuilder();
			chr.append(ch);
			if (chr.indexOf("dog") >= 0)
			{
				isWordPresent = true;
				break;
			};
		}
		return isWordPresent;
	}

	public boolean isVerticalCheck(final char[][] matrixArray,final int dimensions)
	{
		boolean isWordPresent = false;
		for(int i = 0 ; i < dimensions ; i++)
		{
			final StringBuilder word = new StringBuilder();
			for(int j = 0 ; j < dimensions ; j++)
			{
				word.append(matrixArray[j][i]);
			}
			if (word.indexOf("dog") >= 0)
			{
				isWordPresent = true;
				break;
			};
		}
		return isWordPresent;
	}

}
