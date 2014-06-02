package struct.actions;

import java.util.List;

import model.roles.MUser;

import com.opensymphony.xwork2.ActionSupport;

import dataAccess.DAOs.DAOUsuarios;

public class UserListAction extends ActionSupport{
	
	private List<MUser> users;
	
	public List<MUser> getUsers(){
		return this.users;
	}
	
	public String listUsers() throws Exception{
		DAOUsuarios daousers = new DAOUsuarios();
		this.users = daousers.getAllUsers();
		return SUCCESS;
	}

}
