package struct.actions;

import java.util.List;

import model.roles.MUser;

import com.opensymphony.xwork2.ActionSupport;

import dataAccess.DAOs.DAOConsoles;
import dataAccess.DAOs.DAOProducts;
import dataAccess.DAOs.DAOUsuarios;
import dataAccess.Entities.Console;
import dataAccess.Entities.Product;

public class MAdminAction extends ActionSupport{
	
	private List<MUser> users;
	private List<Product> products;
	private List<Console> consoles;
	
	public String listUsers() throws Exception{
		DAOUsuarios daousers = new DAOUsuarios();
		users = daousers.getAllUsers();
		return "displayUsersList";
	}
	
	public String listProducts() throws Exception{
		DAOProducts daoproducts = new DAOProducts();
		products = daoproducts.getAllProducts();
		return "displayProductsList";
	}
	
	public String listConsoles() throws Exception{
		DAOConsoles daoconsoles = new DAOConsoles();
		setConsoles(daoconsoles.getAllConsoles());
		return "displayConsolesList";
	}
	
	public List<MUser> getUsers(){
		return users;
	}
	
	public void setUsers(List<MUser> users){
		this.users = users;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}
}
