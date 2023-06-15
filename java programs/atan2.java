
 public class atan2 {


	public static void main(String args[])
	{

		//coordinates of X and Y axis.
		double x = -90.0;
		double y = -45.0;

		//calculating the angle
		double theta = Math.atan2(y, x);
        
        //outputing the angle
		System.out.println(theta);
	}
}
