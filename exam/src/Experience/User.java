package Experience;

public class User {
	
	private String nicName;
	private String name;
	private int birth;
	
	
	public String getNicName() {
		return nicName;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "User [nicName=" + nicName + ", name=" + name + ", birth=" + birth + "]";
	}
	
	
	
	
	
	

}
