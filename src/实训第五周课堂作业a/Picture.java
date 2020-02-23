package ʵѵ�����ܿ�����ҵa;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ywx
 * @ date 2019��6��11��
 */
public class Picture {
	
    public static List<String> getImg(String s) {
        String regex;
        List<String> list = new ArrayList<String>();
        regex = "src=\"(.*?)\"";
        Pattern pa = Pattern.compile(regex, Pattern.DOTALL);
        Matcher ma = pa.matcher(s);
        while (ma.find()) {
            list.add(ma.group());
        }
        return list;
    }
    /**
     * ���ش���ͼƬ��ַ������
     * @return
     */
    public static String[] getImgaddress(String tar) {
        List<String> imgList = getImg(tar);

        String res[] = new String[imgList.size()];

        if(imgList.size() > 0) {
            for (int i = 0; i < imgList.size(); i++) {
                int begin = imgList.get(i).indexOf("\"") + 1;
                int end = imgList.get(i).lastIndexOf("\"");
                String url[] = imgList.get(i).substring(begin,end).split("/");
                res[i] = url[url.length-1];
            }
        } else {
        }
        return res;
    }
}
