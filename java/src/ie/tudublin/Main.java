
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());


    }
	
	public static void main(String[] args)
	{
	
		Arrays arrays = new Arrays();
        arrays.highestMonth();
		arrays.lowestMonth();
		arrays.averageRainfall();

	}
	
}