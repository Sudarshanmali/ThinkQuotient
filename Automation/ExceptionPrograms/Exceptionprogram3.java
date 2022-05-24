package ExceptionPrograms;

import javax.naming.InsufficientResourcesException;

public class Exceptionprogram3 {

	public static void main(String[] args) {
		try {
			System.out.println(amounttransfer(4567,9876));
		} catch (InsufficientResourcesException e) {
			e.printStackTrace();
		}
		
	}

	public static int amounttransfer(int bal, int amt) throws InsufficientResourcesException {
		int Restamount;
		
		if(amt>bal)
		{
			throw new InsufficientResourcesException();
		}else {
			Restamount=bal-amt;
		}
		return Restamount;
	}
} 