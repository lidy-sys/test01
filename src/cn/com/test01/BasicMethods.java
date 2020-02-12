package cn.com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;

public class BasicMethods<copy> {
    /**
     * @param arr
     * @param arr1
     * @return java.lang.String[]
     * @author lidy
     * @Description: String数组剔除方法（如果arr中的某个元素arr1中也包含，则从arr数组中剔除该元素）
     * @date 2020/2/10 10:39
     */
    public static String[] toDeleteSame(String[] arr, String[] arr1) {
        Set<String> set = new HashSet<String>();
        for (String sa : arr) {
            if (sa != null && !sa.equals("")) {
                boolean flag = true;
                for (String sa1 : arr1) {
                    if (sa.equals(sa1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    set.add(sa);
                }
            }
        }
        return set.toArray(new String[]{});
    }

    /**
     * @param infilepath  输入文件位置
     * @param outfilepath 输出文件位置
     * @return java.lang.Boolean
     * @author lidy
     * @Description:   复制文件
     * @date 2020/2/10 17:33
     */
    public static Boolean copyFile(String infilepath, String outfilepath) {
        Boolean flag = false;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(infilepath);
            fout = new FileOutputStream(outfilepath);
            int tem = -1;
            byte[] by = new byte[1024];
            while ((tem = fin.read(by)) != -1) {
                fout.write(by, 0, tem);
            }
            fout.flush();
            flag = true;
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (Exception e) {
                flag = false;
                e.printStackTrace();
            }
        }


        return flag;
    }

    /**
     *
     * @param filepath
     * @return void
     * @author lidy
     * @Description:  递归调用，获取所有文件
     * @date 2020/2/11 10:28
     */
    public  static  void getAllDirEle(String filepath){
         File file=new File(filepath);
         if(file.isFile()){
             return;
         }
         if(file!=null&&file.isDirectory()){
             File[] file1=file.listFiles();
             for (File fi:file1 ) {
                 System.out.println(fi.getAbsolutePath());
                 getAllDirEle(fi.getAbsolutePath());
             }
         }
    }

}
