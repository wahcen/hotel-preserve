package com.ace.hotel.util;

import java.io.*;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.util
 * @date 2019/10/30 14:07
 */
public class FileUtil {
    private File file;
    private String fileName;

    /**
     * 获取文件拓展名
     *
     * @param fileName 输入的文件名
     * @return 拓展名
     */
    static public String getExtendName(String fileName) {
        String defaultExtendName = MsgUtil.UNKNOWN_EXTEND_NAME;
        String extendName = fileName.substring(fileName.lastIndexOf('.'));
        if (extendName.equals("")) {
            extendName = defaultExtendName;
        }
        return extendName;
    }

    public Boolean saveTo(String targetPath) {
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File targetFile = null;
        try {
            targetFile = new File(targetPath, fileName);
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            }
            //如果文件已存在，则覆盖写入
            fos = new FileOutputStream(targetFile);
            bos = new BufferedOutputStream(fos);
            bos.write(getBytes(this.file.getAbsolutePath()));
            bos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("save file failed!");
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 获得指定文件的byte数组
     *
     * @param filePath 文件路径
     */
    public static byte[] getBytes(String filePath) {
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    /**
     * 根据byte数组，生成文件
     *
     * @param bfile    文件的byte数组
     * @param filePath
     * @param fileName
     */
    public static void createFile(byte[] bfile, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if (!dir.exists()) {//判断文件目录是否存在
                dir.mkdirs();
            }
            file = new File(filePath + "\\" + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bfile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    /**
     * byte[] 转InputStream
     */
    public static final InputStream byteToInput(byte[] buf) {
        return new ByteArrayInputStream(buf);
    }

    /**
     * InputStream 转 byte[]
     *
     * @param inStream
     * @return
     * @throws IOException
     */
    public static final byte[] inputToByte(InputStream inStream)
            throws IOException {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, 100)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }

    /**
     * byte[] 转 InputStreamReader
     */
    public static final InputStreamReader byteToReader(byte[] buf) {
        InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(buf));
        return isr;
    }

    /**
     * 删除文件
     *
     * @param pathname 文件名（包括路径）
     */
    public static void deleteFile(String pathname) {

        File file = new File(pathname);
        if (file.isFile() && file.exists()) {
            file.delete();
        } else {
            System.out.println("file not exists!");
        }
    }

    /**
     * 获取文件分隔符
     *
     * @return
     */
    public static String getFileSeparator() {
        return File.separator;
    }

    /**
     * 获取相对路径
     *
     * @param params 按参数先后位置得到相对路径
     * @return
     */
    public static String getRelativePath(String... params) {

        if (null != params) {
            String path = "";
            for (String str : params) {
                path = path + getFileSeparator() + str;
            }

            return path;
        }

        return null;
    }

    /**
     * 把一个字符串写到指定文件中
     *
     * @param str      要写入文件中的字符串内容
     * @param path     文件夹路径
     * @param fileName 文件名称
     */
    public static void writeStringToFile(String str, String path, String fileName) throws IOException {
        File fileDir = new File(path);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file, true);
        fw.write(str);
        fw.flush();
        fw.close();
    }

    /**
     * 在某个文件中追加内容
     *
     * @param fileName
     * @param content
     */
    public static void appendStringToFile(String fileName, String content) {
        try {
            //判断文件是否存在
            File file = new File(fileName);
            judeFileExists(file);
            // 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
            // 文件长度，字节数
            long fileLength = randomFile.length();
            // 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.write((content + "\r\n").getBytes());
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 判断文件是否存在,如果不存在则创建
    public static void judeFileExists(File file) {
        if (file.exists()) {
        } else {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 判断文件夹是否存在，如果不存在则创建
    public static void judeDirExists(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileUtil(File file) {
        this.file = file;
        this.fileName = file.getName();
    }
}
