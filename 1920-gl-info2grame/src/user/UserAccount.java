package user;

public class UserAccount {

	//Attributes
	private String login;
	private String password;
	private Person owner;

	//Constructors
	public UserAccount () {}

	public UserAccount(String login, String password, Person owner) {
		this.login = login;
		this.password = password;
		this.owner = owner;
	}

	//Getter & Setter

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}