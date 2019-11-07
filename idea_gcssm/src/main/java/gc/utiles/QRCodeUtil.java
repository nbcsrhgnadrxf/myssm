package gc.utiles;


import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.util.Hashtable;
import javax.imageio.ImageIO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
 
@Controller
@RequestMapping("/qrcodeutil")
public class QRCodeUtil {
	private static final String CHARSET = "utf-8";
	private static final String FORMAT_NAME = "JPG";
	// 浜岀淮鐮佸昂瀵�
	private static final int QRCODE_SIZE = 300;
	// LOGO瀹藉害
	private static final int WIDTH = 60;
	// LOGO楂樺害
	private static final int HEIGHT = 60;
 
	@RequestMapping(value = "/createQRCode")
	@ResponseBody
	public String createQRCode() throws Exception {
		
		// 瀛樻斁鍦ㄤ簩缁寸爜涓殑鍐呭
		String text = "https://www.gaokang-gc.club/";
		// 宓屽叆浜岀淮鐮佺殑鍥剧墖璺緞
		String imgPath = "D:/a/a.jpg";
		// 鐢熸垚鐨勪簩缁寸爜鐨勮矾寰勫強鍚嶇О
		String destPath = "D:/a/b/f.jpg";
		//鐢熸垚浜岀淮鐮�
		encode(text, imgPath, destPath, true);
		// 瑙ｆ瀽浜岀淮鐮�
		String str =decode(destPath);
		// 鎵撳嵃鍑鸿В鏋愬嚭鐨勫唴瀹�
		return str+destPath;
	}
	
	
	
	private static BufferedImage createImage(String content, String imgPath, boolean needCompress) throws Exception {
		Hashtable hints = new Hashtable();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
		hints.put(EncodeHintType.MARGIN, 1);
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE,
				hints);
		int width = bitMatrix.getWidth();
		int height = bitMatrix.getHeight();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
			}
		}
		if (imgPath == null || "".equals(imgPath)) {
			return image;
		}
		// 鎻掑叆鍥剧墖
		QRCodeUtil.insertImage(image, imgPath, needCompress);
		return image;
	}
 
	private static void insertImage(BufferedImage source, String imgPath, boolean needCompress) throws Exception {
		File file = new File(imgPath);
		if (!file.exists()) {
			System.err.println("" + imgPath + "   璇ユ枃浠朵笉瀛樺湪锛�");
			return;
		}
		Image src = ImageIO.read(new File(imgPath));
		int width = src.getWidth(null);
		int height = src.getHeight(null);
		if (needCompress) { // 鍘嬬缉LOGO
			if (width > WIDTH) {
				width = WIDTH;
			}
			if (height > HEIGHT) {
				height = HEIGHT;
			}
			Image image = src.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 缁樺埗缂╁皬鍚庣殑鍥�
			g.dispose();
			src = image;
		}
		// 鎻掑叆LOGO
		Graphics2D graph = source.createGraphics();
		int x = (QRCODE_SIZE - width) / 2;
		int y = (QRCODE_SIZE - height) / 2;
		graph.drawImage(src, x, y, width, height, null);
		Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
		graph.setStroke(new BasicStroke(3f));
		graph.draw(shape);
		graph.dispose();
	}
 
	public static void encode(String content, String imgPath, String destPath, boolean needCompress) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath, needCompress);
		mkdirs(destPath);
		// String file = new Random().nextInt(99999999)+".jpg";
		// ImageIO.write(image, FORMAT_NAME, new File(destPath+"/"+file));
		ImageIO.write(image, FORMAT_NAME, new File(destPath));
	}
 
	public static BufferedImage encode(String content, String imgPath, boolean needCompress) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath, needCompress);
		return image;
	}
 
	public static void mkdirs(String destPath) {
		File file = new File(destPath);
		// 褰撴枃浠跺す涓嶅瓨鍦ㄦ椂锛宮kdirs浼氳嚜鍔ㄥ垱寤哄灞傜洰褰曪紝鍖哄埆浜巑kdir锛�(mkdir濡傛灉鐖剁洰褰曚笉瀛樺湪鍒欎細鎶涘嚭寮傚父)
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
	}
 
	public static void encode(String content, String imgPath, String destPath) throws Exception {
		QRCodeUtil.encode(content, imgPath, destPath, false);
	}
	// 琚敞閲婄殑鏂规硶
	/*
	 * public static void encode(String content, String destPath, boolean
	 * needCompress) throws Exception { QRCodeUtil.encode(content, null, destPath,
	 * needCompress); }
	 */
 
	public static void encode(String content, String destPath) throws Exception {
		QRCodeUtil.encode(content, null, destPath, false);
	}
 
	public static void encode(String content, String imgPath, OutputStream output, boolean needCompress)
			throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath, needCompress);
		ImageIO.write(image, FORMAT_NAME, output);
	}
 
	public static void encode(String content, OutputStream output) throws Exception {
		QRCodeUtil.encode(content, null, output, false);
	}
 
	public static String decode(File file) throws Exception {
		BufferedImage image;
		image = ImageIO.read(file);
		if (image == null) {
			return null;
		}
		BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(image);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
		Result result;
		Hashtable hints = new Hashtable();
		hints.put(DecodeHintType.CHARACTER_SET, CHARSET);
		result = new MultiFormatReader().decode(bitmap, hints);
		String resultStr = result.getText();
		return resultStr;
	}
 
	public static String decode(String path) throws Exception {
		return QRCodeUtil.decode(new File(path));
	}
 
}