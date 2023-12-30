class Narrowing1 
{
	public static void main(String[] args) 
	{
		//char --> int
		char ch ='r';
		int i= ch;
		System.out.println(ch);
		System.out.println(i);

		//int --> char
		int k= 45;
		char c=(char)r;
		System.out.println(k);
		System.out.println(c);

		//float --> int
		float f=154.52f;
		int l=(int)f;
		System.out.println(f);
		System.out.println(l);

		//flaot --> char
		flaot h= 445.12f;
		char a=(char)h;
		System.out.println(h);
		System.out.println(a);

		//float --> long

		float e=454.11f;
		long q=(long)e;
		System.out.println(e);
		System.out.println(q);

		//float --> byte
		float o= 554.11;
		byte b=(byte)o;
		System.out.println(o);
		System.out.println(b);

		//double --> char
		double x=154.32;
		char j=(char)x;
		System.out.println(x);
		System.out.println(j);

		//double --> int
		double p=124.11;
		int w=(int)p;
		System.out.println(p);
		System.out.println(w);

		//char --> int --> float
		char c1='i';
		int i1=(int)c1;
		float f1=(float)i1;
		System.out.println(c1);
		System.out.println(i1);
		System.out.println(f1);

		//int --> char -->double
		int p1=55;
		char c2=(char)p1;
		double d1=(double)c2;
		System.out.println(p1);
		System.out.println(c2);
		System.out.println(d1);

		//double --> int --> float
		double d2=554.11;
		int i3=(int)d2;
		float f3=(float)f3;
		System.out.println(d2);
		System.out.println(i3);
		System.out.println(f3);

		//double --> int --> char
		double d3=545.31;
		int i4=(int)d3;
		char c3=(char)i4;
		System.out.println(d3);
		System.out.println(i4);
		System.out.println(c3);

		//float --> char --> double
		float f4=122.32;
		char c4=(char)f4;
		double d4=(double)c4;
		System.out.println(f4);
		System.out.println(c4);
		System.out.println(d4);
		
		//flaot --> int --> char
		float f5=554.1f;
		int i5=(int)f5;
		char c7=(char)f5;
		System.out.println(f5);
		System.out.println(i5);
		System.out.println(c7);
	}
}
