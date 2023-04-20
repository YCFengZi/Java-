package IO.Stream;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        BufferedImage img = ImageIO.read(new File("F:\\Java´úÂë\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        int width = img.getWidth();
        int height = img.getHeight();
        FileInputStream inputStream = new FileInputStream(new File("F:\\Java´úÂë\\Classroom\\src\\IO\\test\\CG_TS02.png"));
        FileOutputStream outputStream = new FileOutputStream(new File("F:\\Java´úÂë\\Classroom\\src\\IO\\test\\img.png"));
        byte[] bytes = new byte[width*height];
        inputStream.read(bytes);
        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();
    }
}
