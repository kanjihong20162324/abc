public class yuan{
	double r;
	public double mianji()
	{
		return (3.14*r*r);
	}
}
public class java{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        yuan a=new yuan();
        double s;
        a.r=2.0;
        s=a.mianji();
        System.out.print(s);
	}
}