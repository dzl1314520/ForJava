package forUse;

import java.io.File;
import java.util.Scanner;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//����ģ���ļ��ϴ����ܣ����������û�ͷ��Ӧ���ϴ�������Ŀ�µ�lib�ļ�����
		//1.����һ��������������ȡҪ�ϴ����û�ͷ���·����getPath()
		File path = getPath();
		System.out.println(path);
		//2.����һ�������������ж�Ҫ�ϴ����û�ͷ����lib�ļ������Ƿ����
		//3.������ڣ���ʾ�����û�ͷ���Ѵ��ڣ��ϴ�ʧ��
		//4.��������ڣ����ϴ����û�ͷ�񣬲���ʾ�ϴ��ɹ�
	}
	//1.����һ��������������ȡҪ�ϴ����û�ͷ���·����getPath()
	/**
	 * ������ȡҪ�ϴ����û�ͷ���·��
	 * return����Ҫ�ϴ����û�ͷ��·��
	 */
	public static File getPath() {
		//1.��ʾ�û�¼�� Ҫ�ϴ����û�ͷ��·����������
		Scanner sc = new Scanner(System.in);
		//7.��Ϊ��֪���û����ٴ���¼����ȷ��������while��true���Ľ�
		while(true) {
		System.out.print("��¼����Ҫ�ϴ����û�ͷ���·����");
		String path = sc.nextLine();
		
		//2.�жϸ�·���ĺ�׺���Ƿ��ǣ�.jpg .png .bmp
		//3.������ǣ�����ʾ����¼��Ĳ���ͼƬ��������¼��
		if(!path.endsWith(".jpg")&&!path.endsWith(".png")&&!path.endsWith(".bmp")) {
			System.out.println("��¼��Ĳ���ͼƬ��������¼�룺");
			//ϸ�ڣ���������д
			continue;
		}
		//4.����ǣ��������ִ�У��жϸ�·���Ƿ���ڣ������Ƿ����ļ�
		File file = new File(path);
		if(file.exists()&&file.isFile()) {
		//6.����ǣ�˵������������Ҫ�����ݣ�ͼƬ���ļ�����ֱ�ӷ���
			return file;
		}else {
		//5.������ǣ�����ʾ����¼���·�����Ϸ���������¼��
			System.out.println("��¼���·�����Ϸ���������¼�룺");
			}
		}
	}
}
