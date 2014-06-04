package struct.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import model.roles.MClient;
import model.roles.MUser;

import org.apache.catalina.connector.Request;
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
	private Product product;
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String index() throws Exception{
		this.consoles=(new DAOConsoles()).getAllConsoles();
		this.products=(new DAOProducts()).getAllProducts();
		return "index";
	}
	
	public String init() throws Exception{
		return INPUT;
	}
	
	public String login() throws Exception{
		DAOUsuarios daou=new DAOUsuarios();
		MUser muser=daou.getUser(userName, passWord);
		
		if(muser!=null){
			mapSession.put("muser", muser);
			return "index";
		}else{
			addActionError("invalido el usuario");
			return INPUT;
		}
	}
	
	public String logout() throws Exception{
		Map session = ActionContext.getContext().getSession();
		session.remove("muser");
		return "index";
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
	private List<Product> products=(new DAOProducts()).getAllProducts();
	private List<Console> consoles=(new DAOConsoles()).getAllConsoles();
	
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
	
	
	//ACCIONES DEL CATALOGO	
	
	public String catalog() throws Exception{
		this.products=(new DAOProducts()).getAllProducts();
		return "catalog";
	}
	
	public String catalogByConsole() throws Exception{
		String[] temp=(String[]) ActionContext.getContext().getParameters().get("idConsole");
		String idConsole="";
		for(int i=0; i<temp.length;i++){
			idConsole+=temp[i];
		}
		
		Console console=(new DAOConsoles()).getConsole(Integer.valueOf(idConsole));
		
		DAOProducts daoprod=new DAOProducts();
		
		this.products=daoprod.getCatalogByConsole(console);
		return "catalog";
	}
	
	public String detailProduct() throws Exception{
		String[] temp=(String[]) ActionContext.getContext().getParameters().get("idProduct");
		String idProduct="";
		for(int i=0; i<temp.length;i++){
			idProduct+=temp[i];
		}
		
		DAOProducts prd=new DAOProducts();
		
		this.product=prd.getProduct(Integer.valueOf(idProduct));
		
		return "productdetail";
	}
	
	
	//Acciones de compra  de products

	private int idPrd;
	private int idCrt;
	
	public int getIdCrt() {
		return idCrt;
	}

	public void setIdCrt(int idCrt) {
		this.idCrt = idCrt;
	}

	public int getIdPrd() {
		return idPrd;
	}

	public void setIdPrd(int idPrd) {
		this.idPrd = idPrd;
	}

	public String buyProductNow() throws Exception{
		
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		DAOProducts daoprd=new DAOProducts();
		Product product=daoprd.getProduct(this.idPrd);
		
		client.buyAProduct(product, 1);
		
		return displayBuyHistory();
	}
	
	public String addProductToCart() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		Product product=(new DAOProducts()).getProduct(this.idPrd);
		
		client.setAProductInShoppingCar(product, 1);
		
		return displayShoppingCart();
	}
	
	public String addProductWishList() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		Product product=(new DAOProducts()).getProduct(this.idPrd);
		
		client.setProductInWishList(product, 1);
		
		return displayWishList();
	}
	
	public String wishlistToCart() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		Product product=(new DAOProducts()).getProduct(this.idPrd);
		
		Wishlist wish=(new DAOWishList()).getWishListById(client, product);
		
		client.WishListToShoppingCar(wish);
		
		return displayShoppingCart();
	}
	
	public String buyAproductInCart() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		Shoppingcarhistory reg=(new DAOShoppingCarAndHistory()).getRegistryById(this.idCrt, client, (new DAOProducts()).getProduct(this.idPrd));
		
		client.buyAProductInShoppingCar(reg);
		
		return displayBuyHistory();		
	}
	
	public String buyAllProductsInCart() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		List<Shoppingcarhistory> cart=(new DAOShoppingCarAndHistory()).getShoppingCar(client);
		
		for(int i=0; i<cart.size();i++){
			client.buyAProductInShoppingCar(cart.get(i));
		}	
		
		return displayBuyHistory();
	}
	
	public String quitWish() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		Product product=(new DAOProducts()).getProduct(this.idPrd);
		
		Wishlist wish=(new DAOWishList()).getWishListById(client, product);
		
		client.deleteRegistrytInWishList(wish);
		
		return displayWishList();
	}
	
	public String idontwanttobuyit() throws Exception{
		MClient client=(MClient)ActionContext.getContext().getSession().get("muser");
		
		Product product=(new DAOProducts()).getProduct(this.idPrd);
		
		Shoppingcarhistory reg=(new DAOShoppingCarAndHistory()).getRegistryById(this.idCrt, client, product);
		
		client.deleteRegistryFromShoppingCar(reg);
		
		return displayShoppingCart();
	}
	
	//Calificando juego
	
	
	private int starscal;


	public int getStarscal() {
		return starscal;
	}

	public void setStarscal(int starscal) {
		this.starscal = starscal;
	}
	
	public String rateGame() throws Exception{
		String[] temp=(String[]) ActionContext.getContext().getParameters().get("prod");
		String idProduct="";
		for(int i=0; i<temp.length;i++){
			idProduct+=temp[i];
		}
		
		DAOProducts prd=new DAOProducts();
		
		this.product=prd.getProduct(Integer.valueOf(idProduct));
		
		String[] temp2=(String[])ActionContext.getContext().getParameters().get("rate");
		String rate="";
		for(int i=0; i<temp2.length;i++){
			rate+=temp2[i];
		}
		int realrate=Integer.valueOf(rate);
		
		MClient client=new MClient(null, null, null, null, null, new Date());
		
		client.rateGame(this.product, realrate);
		
		this.product=prd.getProduct(Integer.valueOf(idProduct));
		
		return "productdetail";
		
	}
	
}
