/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

        /*
		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));
		*/

		/*
		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.
		snowFlake(Integer.parseInt(args[0]));
		*/
	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		StdDraw.line(x1, y1, x2, y2);
		if (n==0) return;
		StdDraw.setPenColor(StdDraw.WHITE);
		double x13=x1+(x2-x1)/3; double y13=y1+(y2-y1)/3;
		double x23= x2-(x2-x1); double y23=y2-(y2-y1)/3;
		StdDraw.line(x13, y13, x23, y23);
		StdDraw.setPenColor(StdDraw.BLACK);
		double x= (Math.sqrt(3.0)*(y13-y23)/6)+0.5*(x13+x23);
		double y=(Math.sqrt(3.0)*(x23-x13)/6)+0.5*(y13+y23);
		StdDraw.line(x, y, x13, y13);
		StdDraw.line(x, y, x23, y23);
		curve(n-1, x1, y1, x13, y13);
		curve(n-1, x13, y13, x, y);
		curve(n-1, x, y, x23, y23);
		curve(n-1, x23, y23, x2, y2);



		//// Write the rest of your code below.
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);
		double m=0.05;
		double x1=m; double y1=m+(Math.sqrt(3)/2);
		double x2=1.1-m; double y2=m+(Math.sqrt(3)/2);
		double x3=0.5; double y3=m;
		curve(n, x1, y1, x2, y2);
		curve(n, x2, y2, x3, y3);
		curve(n, x1, y1, x3, y3);
		// Draws a Koch snowflake of depth n
		//// Write the rest of your code below.
		///
	}
}
