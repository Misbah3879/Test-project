import javax.swing.JOptionPane;
public class DemoComplexNo
{
public static void main(String args[])
	{
	ComplexNo obj1=new ComplexNo(2,8);
	ComplexNo obj2=new ComplexNo(6,9);
	ComplexNo obj3 = new ComplexNo(); 
	ComplexNo obj4 = new ComplexNo(); 
	ComplexNo obj5 = new ComplexNo(); 
	ComplexNo obj6 = new ComplexNo(); 
	ComplexNo obj7 = new ComplexNo(); 
     obj4=obj4.addComplex(obj1,obj2,obj3);
	 obj5=obj5.subtractComplex(obj1,obj2,obj3);
    obj6=obj6.multiplyComplex(obj1,obj2,obj3);
    obj7=obj7.squareComplex();
JOptionPane.showInternalMessageDialog(null, "The sum is" + obj4.displayComplex() +"\n" + "The subtraction  is" 
+obj5.displayComplex() +"\n" + "The multiplication  is"  +obj6.displayComplex()  +"\n" + "The square  is"  +obj7.displayComplex() ,  "Complex class",JOptionPane.PLAIN_MESSAGE); 
	}

}


