import java.util.Scanner;
class StudentResult//sub class 
{
  float	per;
  String result;
  void calculate(int totMarks,boolean b)//Non static method
	{
		per= (float)totMarks/6;//type casting
		if(b)
		{
			result= "Fail";
		}
		else if(per>=70 && per<=100)
		{
			result= "Distinction";
		}
		else if(per>=60 && per<70)
		{
			result= "Firstclass";
		}
		else if(per>=50 && per<60)
		{
			result= "Secondclass";
		}
		else if(per>=35 && per<50)
		{
			result= "Thirdclass";

		}
		else
		{
			result= "Fail";
		}//end of if
		System.out.println("Per"+per);
		System.out.println("result"+result);
	}
}
    class StudentMainClass3//MainClass
    {
	  public static void main(String[] args) 
	  {
		 Scanner s= new Scanner(System.in);
         int i=1,totMarks=0;
		 boolean b=false;
		 while(i<=6)
		  {
			 System.out.println("Enter the marks of sub"+i);
			 int sub =Integer.parseInt(s.nextLine());
			 i++;
			 if (sub<0 || sub>100)
			 {
			     System.out.println("INVALID MARKS.....");
			    i--;
				continue;//skipped value of program from execution
			 }
			 if(sub>=0 && sub<=34)	
				 {
					 b=true;
				 }//end of while
			 totMarks= totMarks+sub;
			 StudentResult sr= new StudentResult();
			 sr.calculate(totMarks,b);//obeject creation
		  }
	  }

	}
