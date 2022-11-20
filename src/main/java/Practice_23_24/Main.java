package Practice_23_24;

import org.jsoup.Jsoup;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            var document = Jsoup.connect("https://mirea.ru").get();
            var imgs = document.select("img");
            int i=1;
            for (var element: imgs){
                String strUrl = element.attr("src");
                if(strUrl.length()==0) continue;
                if(strUrl.charAt(0) == '/'){
                    strUrl = "https://mirea.ru"+strUrl;
                }
                System.out.println(i + ": " +strUrl);
                i++;
                String name = strUrl.substring(strUrl.lastIndexOf("/")+1);
                String extension = strUrl.substring(strUrl.lastIndexOf(".")+1);
                try {
                    URL url = new URL(strUrl);
                    BufferedImage image = ImageIO.read(url);
                    ImageIO.write(image, extension,new File("/Users/ilyazenchenko/IdeaProjects/JavaPractices/src/Practice_23_24/images"+name));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (Exception ignored){
        }

    }
}
