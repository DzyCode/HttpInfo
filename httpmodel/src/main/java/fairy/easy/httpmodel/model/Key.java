package fairy.easy.httpmodel.model;


import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface Key {
    String STRING_CHARSET_NAME = "UTF-8";
    String GBK_CHARSET_NAME = "GBK";
    Charset CHARSET = Charset.forName(STRING_CHARSET_NAME);

    void updateDiskCacheKey( MessageDigest messageDigest);

}
