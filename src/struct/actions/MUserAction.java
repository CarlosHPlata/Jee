package struct.actions;

import java.util.Date;
import java.util.Map;

import model.roles.MUser;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dataAccess.DAOs.DAOUsuarios;

public class MUserAction extends ActionSupport implements SessionAware {

	private Map<String, Object> mapSession;
	
	private int id;
	private boolean type;
	private String userName;
	private String passWord;
	private String name;
	private String lastName;
	private String email;
	private Date birthDate;
	
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
	
	
}
