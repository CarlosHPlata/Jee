package model.roles;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import dataAccess.DAOs.DAOConsoles;
import dataAccess.DAOs.DAOProducts;
import dataAccess.DAOs.DAOUsuarios;
import dataAccess.Entities.Console;
import dataAccess.Entities.Product;
import dataAccess.Entities.Wishlist;

public class Prueba {

	public static void main(String[] args) {
		
		DAOProducts daocns=new DAOProducts();
		ArrayList<Console> console=new ArrayList<Console>();
		
		Product product=daocns.getProduct(2);
		
		Iterator<Console> cons=product.getConsoles().iterator();
		
		while(cons.hasNext()){
			console.add(cons.next());
		}
		
		for(int i=0; i<console.size(); i++){
			System.out.println(console.get(i).getCompany());
		}
		
	}

}
