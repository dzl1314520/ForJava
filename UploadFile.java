package forUse;

import java.io.File;
import java.util.Scanner;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//需求：模拟文件上传功能，假设所有用户头像都应该上传到：项目下的lib文件夹中
		//1.定义一个方法，用来获取要上传的用户头像的路径。getPath()
		File path = getPath();
		System.out.println(path);
		//2.定义一个方法，用来判断要上传的用户头像，在lib文件夹中是否存在
		//3.如果存在，提示：该用户头像已存在，上传失败
		//4.如果不存在，就上传该用户头像，并提示上传成功
	}
	//1.定义一个方法，用来获取要上传的用户头像的路径。getPath()
	/**
	 * 用来获取要上传的用户头像的路径
	 * return具体要上传的用户头像路径
	 */
	public static File getPath() {
		//1.提示用户录入 要上传的用户头像路径，并接收
		Scanner sc = new Scanner(System.in);
		//7.因为不知道用户多少次能录入正确，所以用while（true）改进
		while(true) {
		System.out.print("请录入您要上传的用户头像的路径：");
		String path = sc.nextLine();
		
		//2.判断该路径的后缀名是否是：.jpg .png .bmp
		//3.如果不是，就提示：您录入的不是图片，请重新录入
		if(!path.endsWith(".jpg")&&!path.endsWith(".png")&&!path.endsWith(".bmp")) {
			System.out.println("您录入的不是图片，请重新录入：");
			//细节：不能忘了写
			continue;
		}
		//4.如果是，程序接着执行，判断该路径是否存在，并且是否是文件
		File file = new File(path);
		if(file.exists()&&file.isFile()) {
		//6.如果是，说明就是我们想要的数据（图片，文件），直接返回
			return file;
		}else {
		//5.如果不是，就提示：您录入的路径不合法，请重新录入
			System.out.println("您录入的路径不合法，请重新录入：");
			}
		}
	}
}
