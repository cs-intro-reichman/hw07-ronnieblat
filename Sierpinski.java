/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		
		double m=0.05;
		double x1=m; double y1=m;
		double x2=1-m; double y2=m;
		double x3=(x2+x1)/2; double y3=x3*Math.sqrt(3)+m;
		sierpinski(n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n==0)return;
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x2, y2, x3, y3);
		StdDraw.line(x3, y3, x1, y1);
		double x11=(x3+x1)/2.0; double y11=(y3+y1)/2.0;
		double x12=(x2+x3)/2.0; double y12=(y2+y3)/2.0;
		double x13=(x2+x1)/2.0; double y13=(y2+y1)/2;
		sierpinski(n-1, (x1+x11)/2, (x11+x13)/2, (x1+x13)/2, (y1+y11)/2, (y11+y13)/2, (y1+y13)/2);
		sierpinski(n-1, (x11+x3)/2, (x3+x12)/2, (x11+x12)/2, (y11+y3)/2, (y3+y12)/2, (y11+y12)/2);
		sierpinski(n-1, (x13+x12)/2, (x12+x2)/2, (x2+x13)/2, (y13+y12)/2, (y12+y2)/2, (y2+y13)/2);

										 	}
}
