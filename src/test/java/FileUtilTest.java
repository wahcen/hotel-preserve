import com.ace.hotel.util.FileUtil;
import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2019/10/30 15:04
 */
public class FileUtilTest {

    @Test
    public void testSaveTo() {
        File file = new File("C:\\Users\\Ace.ch\\Desktop\\test.txt");
        FileUtil fileUtil = new FileUtil(file);
//        fileUtil.saveTo("C:\\Users\\Ace.ch\\Desktop\\Docs");
        System.out.println(FileUtil.getExtendName(file.getName()));
    }

    @Test
    public void timeProblem(){
        System.out.println(String.valueOf(LocalDateTime.now()));
        System.out.println();
    }

}
