package whattowear;

import java.util.ArrayList;
import java.util.Scanner;


public class Whattowear {
	public static int hot;
	public static int mild;
	public static int windy;
	public static int sunny;
	public static int percipitation;
	/**
	 *************************************The info that was given to us in the packet*************************************
	 * 
	 * Check the forecast! What should I wear today? It might be hot, mild, or cold.
	 * It might be quiet or windy. It might be sunny or cloudy.
	 * It might be raining, snowing, or not precipitating at all.
	 * Your task is to respond with what is appropriate to wear depending on the forecast.
	 * This is all a bit complicated by the fact that different people may have different sensitivities and tolerances.
	 * Therefore the first step is to allow customizing the criteria for the judge who will be using your program.
	 * 
	 * Input:
	 * The opening lines specify what values constitute, hot, quiet, etc.:
	 * Line 1: Minimum temperature for 'hot' and 'mild' respectively (could be the same!)
	 * Line 2: Minimum wind speed for 'windy'
	 * Line 3: Minimum percent sun to be 'sunny'
	 * Line 4:Minimum percent chance of precipitation to be 'raining' or 'snowing'
	 * 
	 * After these there will be at least one day for which to process the weather report, one line being used per day.
	 * The weather report will contain four items:
	 * 
	 * Line 1: Forecast high
	 * Line 2: Forecast wind speed
	 * Line 3: Forecast percent of sun
	 * Line 4: Forecast percent chance of perciptitation (snow if bellow 32, rain otherwise)
	 * If all four items appear as -1, then this is not a forecast to be processed. Instead it indicates the end of input.
	 * 
	 * 
	 * Output:
	 * For each day indicate what is the best to wear as follows. List all that apply:
	 * Cold- parka, Mild - jacket Got - shorts
	 * Sunny - sun glasses
	 * Hot, Sunny, and quiet - straw hat
	 * Hot, Sunny, and windy - sun bonnet
	 * Raining and windy - rain coat
	 * Raining and quiet- umbrella
	 * Snowing - snow shoes
	 * Cold and windy - muffler
	 * Number the cases as shown in the sample output.
	 * 
	 * Sample Input:
	 * 85   65
	 * 30
	 * 50
	 * 30
	 * 1
	 * 90 10 85 20
	 * 
	 * Sample Output:
	 * Case1: Wear shorts, sun glasses, straw hat.
	 * *************************************End Information**********************************
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String line1 = in.nextLine();
		String line2 = in.nextLine();
		String line3 = in.nextLine();
		String line4 = in.nextLine();
		String line5 = in.nextLine();
		String line6 = in.nextLine();
		int c = 1;
	}

}
