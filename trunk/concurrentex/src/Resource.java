import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// class to read and write file
public class Resource {
	File file = new File("file.txt");

	public void createFile() {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readFile() {
		BufferedReader br = null;
		try{
			String sCurrentLine;
			br = new BufferedReader(new FileReader(file));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void writeFile(String content) {
		BufferedWriter bw = null;
		try{
			System.out.println("Start writing");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Done");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

