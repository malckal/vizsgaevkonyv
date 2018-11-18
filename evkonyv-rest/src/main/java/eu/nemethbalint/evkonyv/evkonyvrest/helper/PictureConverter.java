package eu.nemethbalint.evkonyv.evkonyvrest.helper;

import org.hibernate.type.ClobType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.Base64;

public class PictureConverter {

    public static String convertToString(String path) throws IOException {
        if(path == null){
            return null;
        }
        BufferedImage img = ImageIO.read(PictureConverter.class.getClassLoader().getResource(path).openStream());
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        ImageIO.write(img, "png", stream);
        return Base64.getEncoder().encodeToString(stream.toByteArray());
    }
    public static Clob stringToClob(String encoded){
        if(encoded == null){
            return null;
        }
        return  ClobType.INSTANCE.fromStringValue(encoded);
    }
    public static String clobToString(Clob clob){
        if(clob == null){
            return null;
        }
        try {
            return clob.getSubString(1, (int) clob.length());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
