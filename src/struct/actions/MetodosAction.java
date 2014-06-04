package struct.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.roles.MAdmin;
import model.roles.MClient;
import model.roles.MUser;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
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
	
	
	public String index() throws Exception{
		return "index";
	}
	
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
	private Product product;
	private MUser muser;
	private Console console;
	private int idProduct;
	private int idUser;
	private int idConsole;
	private String desc;
	private float prize;
	private int quantity;
	private Date creationDate;
	private String image;
	
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
	
	public String listConsolesOnProduct() throws Exception{
		DAOConsoles daoconsoles = new DAOConsoles();
		setConsoles(daoconsoles.getAllConsoles());
		return "registerProduct";
	}
	
	public String editInfoUser() throws Exception{
		String[] temp = (String[])ActionContext.getContext().getParameters().get("idUser");
		String idUser = "";
		for (int i = 0; i < temp.length; i++) {
			idUser += temp[i];
		}
		DAOUsuarios daousers = new DAOUsuarios();
		this.muser = daousers.getUserById(Integer.parseInt(idUser), false);
		return "editClient";
	}
	
	public String updateInfoUser() throws Exception{
		DAOUsuarios dau = new DAOUsuarios();
		this.muser = dau.getUserById(getIdUser(), false);
		this.muser.setName(getName());
		this.muser.setLastName(getLastName());
		this.muser.setEmail(getEmail());
		this.muser.setBirthDate(getBirthDate());
		dau.updateUser(this.muser);
		return "success";
	}
	
	public String deleteUser() throws Exception{
		String[] temp = (String[])ActionContext.getContext().getParameters().get("idUser");
		String idUser = "";
		for (int i = 0; i < temp.length; i++) {
			idUser += temp[i];
		}
		DAOUsuarios daousers = new DAOUsuarios();
		this.muser = daousers.getUserById(Integer.parseInt(idUser), false);
		daousers.deleteUser(this.muser);
		return "success";
	}
	
	public String registerProduct() throws Exception{
		MAdmin madmin = (MAdmin)ActionContext.getContext().getSession().get("muser");
		madmin.createProduct(getName(), getDesc(), getPrize(), getQuantity(), getImage(), null);
		return "registry_successful";
	}
	
	public String editInfoProduct() throws Exception{
		String[] temp = (String[])ActionContext.getContext().getParameters().get("idProduct");
		String idProduct = "";
		for (int i = 0; i < temp.length; i++) {
			idProduct += temp[i];
		}
		DAOProducts daop = new DAOProducts();
		this.product = daop.getProduct(Integer.parseInt(idProduct));
		return "editProduct";
	}
	
	public String updateInfoProduct() throws Exception{
		DAOProducts daop = new DAOProducts();
		this.product = daop.getProduct(getIdProduct());
		this.product.setName(getName());
		this.product.setDesc(getDesc());
		this.product.setPrize(getPrize());
		this.product.setQuantity(getQuantity());
		this.product.setCreationDate(getCreationDate());
		this.product.setImage(getImage());
		daop.updateProduct(this.product);
		return "success";
	}
	
	public String deleteProduct() throws Exception{
		String[] temp = (String[])ActionContext.getContext().getParameters().get("idProduct");
		String idProduct = "";
		for (int i = 0; i < temp.length; i++) {
			idProduct += temp[i];
		}
		DAOProducts daop = new DAOProducts();
		this.product = daop.getProduct(Integer.parseInt(idProduct));
		daop.deleteProduct(this.product);
		return "success";
	}
	
	public String registerConsole() throws Exception{
		DAOConsoles daoc = new DAOConsoles();
		this.console = new Console(daoc.getAllConsoles().size()+1, getName());
		daoc.createConsole(this.console);
		return "registry_successful";
	}
	
	public String editInfoConsole() throws Exception{
		String[] temp = (String[])ActionContext.getContext().getParameters().get("idConsole");
		String idConsole = "";
		for (int i = 0; i < temp.length; i++) {
			idConsole += temp[i];
		}
		DAOConsoles daoc = new DAOConsoles();
		this.console = daoc.getConsole(Integer.parseInt(idConsole));
		return "editConsole";
	}
	
	public String updateInfoConsole() throws Exception{
		DAOConsoles daoc = new DAOConsoles();
		this.console = daoc.getConsole(getIdConsole());
		this.console.setCompany(getName());
		daoc.updateConsole(this.console);
		return "success";
	}
	
	public List<MUser> getUsers(){
		return users;
	}
	
	public void setUsers(List<MUser> clients){
		this.users = clients;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public MUser getMuser() {
		return muser;
	}

	public void setMuser(MUser muser) {
		this.muser = muser;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdConsole() {
		return idConsole;
	}

	public void setIdConsole(int idConsole) {
		this.idConsole = idConsole;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	/*
	 * -------------------------------------------ACTIONS DEL ADMINISTRADOR------------------------------------------------------------
	 */
	

	private MClient mclient;
	
	public String registerClient(){
		this.mclient = new MClient(getUserName(), getPassWord(), getName(), getLastName(), getEmail(), new Date());
		DAOUsuarios daou = new DAOUsuarios();
		daou.createUser(this.mclient);
		return "registry_successful";
	}
	
	public MClient getMclient() {
		return mclient;
	}

	public void setMclient(MClient mclient) {
		this.mclient = mclient;
	}
	
}
