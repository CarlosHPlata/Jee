package model.roles;

import java.util.Date;
import java.util.List;

import dataAccess.DAOs.DAOConsoles;
import dataAccess.DAOs.DAOProducts;
import dataAccess.DAOs.DAOUsuarios;
import dataAccess.Entities.Product;
import dataAccess.Entities.Wishlist;

public class Prueba {

	public static void main(String[] args) {
		
		
		DAOProducts products=new DAOProducts();
		
		Product product=products.getProduct(1);
		
		System.out.println(product.getConsoles().size());
		
	}

}
