
import java.io.*;

public class CopyPasteApp {
	public static void main(String x[]) throws Exception {
		FileInputStream fr = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Images\\burg.jpg");
		FileOutputStream fw = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\File Handling\\burg.jpg");
		int data;
		while ((data = fr.read()) != -1) {
			fw.write(data);
		}
		fw.close();
		fr.close();
		System.out.println("successfully........................");
	}
}