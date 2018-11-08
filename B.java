public class java1 {
	public static void main(String[] args) {
		sjx x=new sjx();
		x.a=3.0;
		x.b=4.0;
		x.c=5.0;	
		double s=x.mianji();
		double l=x.zhouchang();
		System.out.print("s="+s+"  l="+l);
	}
}
public class sjx {
     double a,b,c;
     public double mianji(){
    	 double cosc=(a*a+b*b-c*c)/(2*a*b);
    	 double sinc=Math.sqrt(1-cosc*cosc);
    	 
    	 return (0.5*a*b*sinc);
     }
     public double zhouchang(){
    	 return (a+b+c);
     }
}