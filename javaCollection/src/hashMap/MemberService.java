package hashMap;

public interface MemberService {
	/* ȸ������ ��� : �Ķ���� �߰��� ������ ���� */
	public void join(String name, String addr, int age, String id, String password);
	
	/* �α��� ��� : �Ķ���� �߰��� ������ ���� */
	public String login(String id, String password);
}
