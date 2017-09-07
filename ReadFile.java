import java.io.*;

/**
 * Created by chenyzh on 2017/9/7.
 */
public class ReadFile{
    public static void readFile(String filePath)

    {
        try {
            String encoding = "utf-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                FileInputStream in = new FileInputStream(file);
                InputStreamReader read = new InputStreamReader(in, encoding);
                BufferedReader txt = new BufferedReader(read);
                String line = null;
                while ((line = txt.readLine()) != null) {
                    System.out.println(line);
                }
                read.close();
            } else {
                System.out.print("找不到指定文件");
            }
        } catch (Exception e) {
            System.out.print("读取文件内容出错");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String filePath = "C:\\Users\\chenyzh\\Desktop\\Notepad++\\陈勇臻QA.txt";
        readFile(filePath);
    }

}
