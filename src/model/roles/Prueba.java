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
		
		DAOUsuarios dau=new DAOUsuarios();
		DAOConsoles cns=new DAOConsoles();
		
		Console console=cns.getConsole(1);
		
		MAdmin admin=(MAdmin)dau.getUserById(1, true);
		
		List<Product> prd=admin.getCatalogByConsole(console);
		
		for(int i=0; i<prd.size(); i++){
			System.out.println(prd.get(i).getName());
		}
		
	}

}
