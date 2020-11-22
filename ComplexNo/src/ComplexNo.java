import javax.swing.JOptionPane;
public class ComplexNo
{
	int real;
	int imaginary;
	final double i=Math.sqrt(-1);
	ComplexNo()
	{
		real=0;
		imaginary=0;
	}
	ComplexNo(int re,int imag)
	{
		real=re;
		imaginary=imag;
	}
	 ComplexNo(String r)
	 {
		System.out.println(r);
		real=Integer.parseInt(r);
		
	 }
	 String displayComplex()
	   	{
	   	 return("Complex number: "  + real + " +  " + imaginary + "i");
	   	
	   	}
	void setData(int r,int i)
	{
		real=r;
		imaginary=i;
	}
	int getReal()
	{
		String real=JOptionPane.showInputDialog("Enter a real number:");
		int firstnum=Integer.parseInt(real);
		 return firstnum;
	}
    int getImaginary()
    {
    	String imaginary=JOptionPane.showInputDialog("Enter an imaginary number:");
    	int secondnum=Integer.parseInt(imaginary);
		 return secondnum;
    }
   ComplexNo addComplex(ComplexNo a,ComplexNo b,ComplexNo c)
    {
    	int real1=(a.getReal() +b.getReal() +c.getReal());
    	int imaginary1=(a.getImaginary() + b.getImaginary() + c.getImaginary() );
    	ComplexNo result;
    	result=new ComplexNo(real1,imaginary1);
    	return result;

         }
    
    ComplexNo subtractComplex(ComplexNo a,ComplexNo b,ComplexNo c)
    {
    	ComplexNo result;
    	result=new ComplexNo((a.getReal() - b.getReal() - c.getReal()),
    	 (a.getImaginary() - b.getImaginary() - c.getImaginary()));
    	return result;
    }
    ComplexNo multiplyComplex(ComplexNo a,ComplexNo b,ComplexNo c)
    {
    	ComplexNo result1;
    	result1=new ComplexNo((b.getReal()*b.getReal() - a.getImaginary()*b.getImaginary()),
    			 (a.getReal()*b.getImaginary() + a.getImaginary()*b.getReal()));
    	ComplexNo d=result1;
  ComplexNo  result=new ComplexNo((d.getReal()*c.getReal() - d.getImaginary()*c.getImaginary()),
   			 (d.getReal()*c.getImaginary() + d.getImaginary()*c.getReal()));
    	return result;
    }
    public ComplexNo squareComplex() {
    	ComplexNo sq;
    	sq=new ComplexNo();
    	sq.real=real*real;
    	sq.imaginary=imaginary*imaginary;
    	return sq;

      }
    boolean equalComplex(ComplexNo r,ComplexNo s)
    {
    	if(r.real==s.real && r.imaginary==s.imaginary)
    	{
    		return true;
    	}
    	else 
    	{
    		return false;
    	}
    }
   	
}

