package gc.utiles;

/**
 * @author GC
 */
public class QrCodeTest {
 
	public static void main(String[] args) throws Exception {
		// 存放在二维码中的内容
		String text = "https://www.gaokang-gc.club/";
		String text01 = "http://localhost:8080/gcssm/pages/bk_zy/mini/index.jsp";
			// 嵌入二维码的图片路径
		String imgPath = "D:/a/a.jpg";
		// 生成的二维码的路径及名称
		String destPath = "D:/a/b/f.jpg";
		//生成二维码
		QRCodeUtil.encode(text01, imgPath, destPath, true);
		// 解析二维码
		String str = QRCodeUtil.decode(destPath);
		// 打印出解析出的内容
        System.out.println(str);


    }
 
}