package struct.actions;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.roles.MUser;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dataAccess.DAOs.DAOConsoles;
import dataAccess.DAOs.DAOProducts;
import dataAccess.DAOs.DAOShoppingCarAndHistory;
import dataAccess.DAOs.DAOUsuarios;
import dataAccess.DAOs.DAOWishList;
import dataAccess.Entities.Console;
import dataAccess.Entities.Product;
import dataAccess.Entities.Shoppingcarhistory;
import dataAccess.Entities.Wishlist;

public class MetodosAction extends ActionSupport implements SessionAware {
/*
 * -------------------------------------------ACTIONS DEL USUARIO------------------------------------------------------------
 */
	private Map<String, Object> mapSession;
	
	private int id;
	private boolean type;
	private String userName;
	private String passWord;
	private String name;
	private String lastName;
	private String email;
	private Date birthDate;
	private List<Wishlist> wishlist;
	private List<Shoppingcarhistory> shoppingcart;
	private List<Shoppingcarhistory> buyhistory;
	
	public String login() throws Exception{
		DAOUsuarios daou=new DAOUsuarios();
		MUser muser=daou.getUser(userName, passWord);
		
		if(muser!=null){
			mapSession.put("muser", muser);
			return "portal";
		}else{
			addActionError("invalido el usuario");
			return INPUT;
		}
	}
	
	public String editInfoPersonal() throws Exception {
		return "editInfo";
	}
	
	public String updateInfoPersonal() throws Exception {
		MUser muser = (MUser)mapSession.get("muser");
		muser.setName(getName());
		muser.setLastName(getLastName());
		muser.setEmail(getEmail());
		DAOUsuarios daou=new DAOUsuarios();
		daou.updateUser(muser);
		return "success_update";
	}
	
	public String editLoginPassword() throws Exception {
		return "editLoginPass";
	}
	
	public String updateUsernamePassword() throws Exception {
		MUser muser = (MUser)mapSession.get("muser");
		muser.setUserName(getUserName());
		muser.setPassWord(getPassWord());
		DAOUsuarios daou=new DAOUsuarios();
		daou.updateUser(muser);
		return "success_update";
	}
	
	public String displayWishList() throws Exception{
		MUser muser = (MUser)mapSession.get("muser");
		DAOWishList daow = new DAOWishList();
		DAOProducts daop = new DAOProducts();
		wishlist = daow.getWishListFromUser(muser);
		for (int i = 0; i < wishlist.size(); i++) {
			wishlist.get(i).setProduct(daop.getProduct(wishlist.get(i).getProduct().getIdProduct()));
		}
		return "displayWishList";
	}
	
	public String displayShoppingCart() throws Exception{
		MUser muser = (MUser)mapSession.get("muser");
		DAOShoppingCarAndHistory daoc = new DAOShoppingCarAndHistory();
		DAOProducts daop = new DAOProducts();
		shoppingcart = daoc.getShoppingCar(muser);
		for (int i = 0; i < shoppingcart.size(); i++) {
			shoppingcart.get(i).setProduct(daop.getProduct(shoppingcart.get(i).getProduct().getIdProduct()));
		}
		return "displayShoppingCart";
	}
	
	public String displayBuyHistory() throws Exception{
		MUser muser = (MUser)mapSession.get("muser");
		DAOShoppingCarAndHistory daoh = new DAOShoppingCarAndHistory();
		DAOProducts daop = new DAOProducts();
		buyhistory = daoh.getHistory(muser);
		for (int i = 0; i < buyhistory.size(); i++) {
			buyhistory.get(i).setProduct(daop.getProduct(buyhistory.get(i).getProduct().getIdProduct()));
		}
		return "displayBuyHistory";
	}

	public Map<String, Object> getMapSession() {
		return mapSession;
	}

	public void setSession(Map<String, Object> mapSession) {
		this.mapSession = mapSession;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Wishlist> getWishlist() {
		return wishlist;
	}

	public void setWishlist(List<Wishlist> wishlist) {
		this.wishlist = wishlist;
	}

	public List<Shoppingcarhistory> getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(List<Shoppingcarhistory> shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	public List<Shoppingcarhistory> getBuyhistory() {
		return buyhistory;
	}

	public void setBuyhistory(List<Shoppingcarhistory> buyhistory) {
		this.buyhistory = buyhistory;
	}
	
	/*
	 * -------------------------------------------ACTIONS DEL ADMINISTRADOR------------------------------------------------------------
	 */
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
