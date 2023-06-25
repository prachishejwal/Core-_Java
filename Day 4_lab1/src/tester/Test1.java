package tester;

import com.app.core.Emp;
import com.app.core.PermanantWorker;
import com.app.core.SalesMgr;
import com.app.core.TempWoker;

public class Test1 {
//ctrl+shift+o-->briging import
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp E=new SalesMgr();//upcast
		System.out.println(E.ComputeSalary());//comp checks by type of ref:Emp &jvm resolves by runtime type of object as Salesmgr
		System.out.println(E.getClass());//runtime class:SalesMgr o/p:class com.app.core.SalesMgr
		
		E=new TempWoker();//upcast
		System.out.println(E.ComputeSalary());
		System.out.println(E.getClass());//tempwoker o/p:class com.app.core.TempWoker
		
		Object ref;//ref type of variable of Object class
		ref=E;//Rhs:emp lhs:Object  Emp extends from obj//method local variable:Ref
		System.out.println(ref.getClass());//TempWorker 
	//ref.ComputeSalary();//compiler does not know about what to hold thats why error//no future known by compiler
		System.out.println(((Emp)ref).ComputeSalary());//object calass does not have compute sal method//downcast to get information to javac
		System.out.println(((TempWoker)ref).ComputeSalary());
		//System.out.println(((PermanantWorker)ref).ComputeSalary());//tempwoker-X->permantwaoker where ref:tempWoker//class cast operation
		if(ref instanceof PermanantWorker)
			System.out.println(((PermanantWorker)ref).ComputeSalary());//class cast operation
		else
			System.out.println("not Permanant woker");//this works//compiler get fooled by type of ref
		
	}

}
