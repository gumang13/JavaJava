package std20260113;

public class User {
	
      private String id;
      private String passward;
      private String name;
      private String tel;
      
      
	  public String getId() {
		  return id;
	  }
	  public void setId(String id) {
		  this.id = id;
	  }
	  public String getPassward() {
		  return passward;
	  }
	  public void setPassward(String passward) {
		  this.passward = passward;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getTel() {
		  return tel;
	  }
	  public void setTel(String tel) {
		  this.tel = tel;
	  }
	  @Override
	  public String toString() {
		return "User [id=" + id + ", passward=" + passward + ", name=" + name + ", tel=" + tel + "]";
	  }
	  public User(String id, String passward, String name, String tel) {
		super();
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.tel = tel;
	  }
      public User() {}

}
