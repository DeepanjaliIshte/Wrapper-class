//write a java program to find grass salary from employee by reading basic salary dynamically 
		// gsal= bsal+hra+da
		// hra= 55% of bsal
		// da= 45% of bsal
public class Emp
{
	float gsal,da,hra;
	void calGsal(float bsal)
	{
		hra=(float) (bsal*0.55);
		da=(float) (bsal*0.45);
		gsal=bsal+hra+da;
		System.out.println("Grass salary :"+gsal);
	}
}
