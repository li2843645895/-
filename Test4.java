
public class Test4 {

	public static void main(String[] args) {
		System.out.println("--------------------------------��ӭ����-----------------------------------------------");
		//ʵ����һ���о�������
		PostGradutors postGradutorone = new PostGradutors();
		//����postGradutorone��name���ԣ�ѧ������������
		System.out.println("���"+postGradutorone.name+"ͬѧ");
		//����postGradutorone��age���ԣ�ѧ������������
		System.out.println("��������Ϊ��"+postGradutorone.age);
		//����postGradutorone��sex���ԣ�ѧ���������Ա�
		System.out.println("�����Ա��ǣ�"+postGradutorone.sex);
		//postGradutorone������д��salarySearch()����������ͳ��ѧ������˰��ÿ���µĵĹ���
		postGradutorone.salarySearch();
		//postGradutorone������д��feeSearch()��������������ͳ��ѧ����ѧ��
		postGradutorone.feeSearch();
	}

}
