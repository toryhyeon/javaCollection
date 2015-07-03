package hashMap;

public class Member {
	private String name; // �̸�
	private String addr; // �ּ�
	private String age; // ����
	private String id; // ID
	private String password; //Password
	
	public Member() {
		this("","","","","");
	}

	public Member(String name, String addr, String age, String id,
			String password) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
