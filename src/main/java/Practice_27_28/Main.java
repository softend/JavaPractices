package Practice_27_28;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String srcFolder = "/Users/ilyazenchenko/IdeaProjects/JavaPractices/src/main/java/Practice_27_28/images";
        String dstFolder = "dst";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();

        try {
            if (!Files.exists(Paths.get(dstFolder))) {
                Files.createDirectories(Paths.get(dstFolder));
            }
            for (int i=0; i<files.length;i+=3) {
                File file1 = files[i];
                File file2 = files[i+1];
                File file3 = files[i+2];
                new Thread(()->{
                    compressFile(dstFolder, file1);
                }).start();
                new Thread(()->{
                    compressFile(dstFolder, file2);
                }).start();
                new Thread(()->{
                    compressFile(dstFolder, file3);
                }).start();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static void compressFile(String dstFolder, File files) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(files);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int newWidth = image.getWidth() / 2;
        int newHeight = (int) Math.round(
                image.getHeight() / (image.getWidth() / (double) newWidth)
        );
        BufferedImage newImage = new BufferedImage(
                newWidth, newHeight, BufferedImage.TYPE_INT_RGB
        );

        int widthStep = image.getWidth() / newWidth;
        int heightStep = image.getHeight() / newHeight;

        for (int x = 0; x < newWidth; x++) {
            for (int y = 0; y < newHeight; y++) {
                int rgb = image.getRGB(x * widthStep, y * heightStep);
                newImage.setRGB(x, y, rgb);
            }
        }

        File newFile = new File(dstFolder + "/" + files.getName());
        try {
            ImageIO.write(newImage, "jpg", newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}