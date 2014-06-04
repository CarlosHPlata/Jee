package model.roles;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import dataAccess.DAOs.DAOConsoles;
import dataAccess.DAOs.DAOProducts;
import dataAccess.DAOs.DAOShoppingCarAndHistory;
import dataAccess.DAOs.DAOUsuarios;
import dataAccess.Entities.Console;
import dataAccess.Entities.Product;
import dataAccess.Entities.Shoppingcarhistory;
import dataAccess.Entities.Wishlist;

public class Prueba {

	public static void main(String[] args) {
		
		Product product=new Product(((new DAOProducts()).getAllProducts().size()+1), "halo 3", "lol", 666, 0, 10000, new Date(), "megamanx5.jpg");
		
		(new DAOProducts()).createProduct(product);
		
		System.out.println("lol");
	}

}
