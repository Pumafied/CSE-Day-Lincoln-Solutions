package risingfloodwaters;

import java.util.Scanner;
/*
 *************************************The info that was given to us in the packet*************************************
 *The rains continue to pour down at a steady rate over many hours.
 * Far Downstream there is a lake that begins to rise behind a dam,
 * expanding the lake over the surrounding countryside. 
 * You are guranteed that the top of the dam is the lowest point in the border around the affected area of the lake,
 * therefore the lake will eventually spill over the dam rather than spread back upriver beyond the border.
 * Your task is to determine when the dam overflows. You will be provided the elevations of the lake and the surrounding land, the location and the rate of flow of the river where it enters the affected area, and the location and height of the dam.
 * 
 * Input:
 * There may be multiple cases to analyze. The positive integer on the first line indicates the number of cases.
 * Begining each case is a pair of positive integers from 1 to 20 ubducatubg the dimensions r and c of the area.
 * Following this on the same line are the (integer) coordinates of the entering river, the coordinates of the dam
 * (both always one unit in length along a border , but not a corner), and finally the rate of flow of the entering river.
 *  The next r lines contain c values each, representing the average elevation of the cooresponding land area and the lake.
 *  Units of area are acres and the rate of flow is in acre-feet per minute.
 * Assume that water flows and spreads out instantly, but only north-south or east-west, never diagnally.
 * 
 *  In the sample the incoming river is at 22 feet elevation both it and the rest of the border are higher than the dam
 *  (at 20 feet). The river initially flows south (at 18 feet), then east into the lake (at 14 feet). 
 *  The lake fills, eventually overflowing the central central 19 foot peak and filling the low point (at 16 feet) 
 *  to the west. The flood continues to rise, eventually topping the dam. 
 * 
 * Output:
 * For each case display the time in minutes that it takes for the lake to overflow the dam. 
 * Number the cases as shown in the sample output.
 * 
 * Sample Input:
 * 1
 * 5 5  1 3  53  7
 * 33 30 22 29 40
 * 40 32 18 14 36
 * 56 16 19 14 29
 * 66 36 14 14 35
 * 99 88 20 25 30
 * 
 * Sample Output:
 * 
 * (Ask Ramey for the sample output
 * 
 */

public class Risingfloodwaters {
	public static void main(String[] args) {

	}
}
