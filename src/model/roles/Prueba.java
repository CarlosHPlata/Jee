package model.roles;

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
		
		DAOProducts prd= new DAOProducts();
		
		List<Product> prds=prd.getAllProducts();
		
		for(int i=0; i<prds.size(); i++){
			System.out.println(prds.get(i).getImage());
		}
		
	}

}
