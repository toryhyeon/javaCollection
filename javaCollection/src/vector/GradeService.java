package vector;

import java.util.Vector;

public interface GradeService {
	/*
	 * �л��� ������ �Է��ϴ� ���
	 */
	public void input(Grade grade);
	
	/*
	 * ��ü �л�����ǥ ���
	 */
	public void printList();
	
	/*
	 * �й����� ������ ��ȸ�ϴ� ���
	 */
	public String SearchGradeByHak(String hak);
	
	/*
	 * �̸����� ������ ��ȸ�ϴ� ���(��, ���������� ������ ��� ���� ���
	 */
	public Vector<Grade> searchGradesByName(String name);
}
