package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
	}

	
	public void draw()
	{	
	}

	public void highestMonth()
	{

		float highestRainfall = 0;

		String highestMonth = "NOT";

		for(int i = 0; i < months.length; i++)
		{

			if (rainfall[i] > highestRainfall)
			{
				highestRainfall = rainfall[i];

				highestMonth = months[i];

			}

		}

		println("The month with the highest rainfall is", highestMonth);

	}

	public void lowestMonth()
	{

		float lowestRainfall = 9999999;

		String lowestMonth = "NOT";

		for(int i = 0; i < months.length; i++)
		{

			if (rainfall[i] < lowestRainfall)
			{
				lowestRainfall = rainfall[i];

				lowestMonth = months[i];

			}

		}

		println("\nThe month with the lowest rainfall is", lowestMonth);

	}

	public void averageRainfall()
	{

		float averageRainfall;

		float totalRainfall = 0;

		int numMonths = rainfall.length;


		for(int i = 0; i < rainfall.length; i++)
		{

			totalRainfall = totalRainfall + rainfall[i];

		}

		averageRainfall = totalRainfall / numMonths;

		println("\nThe average rainfall over the year is", averageRainfall);

	}


}
