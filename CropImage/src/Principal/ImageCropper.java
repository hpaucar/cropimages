package Principal;

/* ImageCropper.java */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCropper {

	public static void main(String[] args) {
		try {
			int j=5,m=8;
				for(int i=1;i<=m;i++){
					String name = "D:/media"+j+"/image"+i+".png";
					BufferedImage originalImgage = ImageIO.read(new File(name));
					
					System.out.println("Original Image Dimension: "+originalImgage.getWidth()+"x"+originalImgage.getHeight());
	
					BufferedImage SubImgage = originalImgage.getSubimage(1680, 31, 805, 601);
					System.out.println("Cropped Image Dimension: "+SubImgage.getWidth()+"x"+SubImgage.getHeight());
					
					String name2 = "D:/media"+j+"/croppedImage"+i+".png";
					File outputfile = new File(name2);
					ImageIO.write(SubImgage, "png", outputfile);
	
					System.out.println("Image cropped successfully: "+outputfile.getPath());
				}
						
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
