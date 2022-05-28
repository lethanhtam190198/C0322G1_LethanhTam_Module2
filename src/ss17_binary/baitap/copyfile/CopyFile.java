package ss17_binary.baitap.copyfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    private static void copyFiles(File file, File arrive) throws IOException {
        Files.copy(file.toPath(), arrive.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String text1 = "src/ss17_binary/baitap/product/text.txt";
        String text2 = "src/ss17_binary/baitap/copyfile/text.txt";
        File file1 = new File(text1);
        File file2 = new File(text2);
        try {
            copyFiles(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
