package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n == 0) {
			return 0;

		} else {

			return 1 / Math.pow(2, n) + geometricSum(n-1);
		}
	}
	
	

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		// FIXME compute the gcd of p and q using recursion
		return 0;

	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		if (array.length > 0) {
			return reverser(array, reversed, 0);
		} else {
			return reversed;
			
		}
		// FIXME create a helper method that can recursively reverse the given array
		//return new int[0];
	}
	
	public static int[] reverser(int [] array, int [] reversed, int index) {
		if(index > array.length / 2) {
			return reversed;
			
		} else {
			int mirror = array.length - 1 - index;
			reversed[index] = array[mirror];
			reversed[mirror] = array[index];
			return reverser(array, reversed, index + 1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		double min = radiusMinimumDrawingThreshold;	
		if (radius < radiusMinimumDrawingThreshold) {
				return;
			} else {
				//xCenter = xCenter/3.0;
				//yCenter = yCenter/3.0;
				
					StdDraw.circle(xCenter, yCenter, radius);
					circlesUponCircles(xCenter - radius, yCenter, radius / 3.0, min);
					circlesUponCircles(xCenter, yCenter - radius, radius / 3.0, min);
					circlesUponCircles(xCenter + radius, yCenter, radius / 3.0, min);
					circlesUponCircles(xCenter, yCenter + radius, radius / 3.0, min);
				
				
			}
		// FIXME
	}

}
