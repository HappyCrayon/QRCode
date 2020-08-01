package org.javaboy;

import org.javaboy.util.QRCodeUtil;

/**
 * @author bai <br/>
 * @date 2020/7/1 9:31<br/>
 */
public class QRCodeApplication {

    public static void main(String[] args) throws Exception {
        String currentPath = System.getProperty("user.dir");
        // 存放在二维码中的内容
        String text = "魔羯座";
        // 嵌入二维码的图片路径
        String embedImgPath = "G:\\图片\\摩羯座.jpg";
        // 生成的二维码的路径及名称
        String destPath = currentPath + "\\dest\\img\\jam.jpg";
        //生成二维码
        QRCodeUtil.encode(text, embedImgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
}
