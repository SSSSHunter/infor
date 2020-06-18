package com.woniu.housemanager.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class Md5 {


        public static void main(String[] args) {
            System.out.println(md5("123456"));
        }
        public static String md5(String password) {
            try {
                //创建一个消息算法的实例对象
                MessageDigest md = MessageDigest.getInstance("MD5"); // 计算md5函数

                //
                md.update(password.getBytes());

                //加密之后的信息就 存放在byte类型的数组中(长度16)
                byte bs[]=md.digest();
                System.out.println(bs.length);
                return toHexString(bs);

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }

        }
        /*将字节数组转为32位的16进制数*/
        private static String toHexString(byte[] bytes) {

            Formatter formatter = new Formatter();
            for (byte b : bytes)
            {
                //以十六进制输出,2为指定的输出字段的宽度.如果位数小于2,则左端补0
                formatter.format("%02x", b);
            }
            String res = formatter.toString();
            System.out.println(res.length());
            formatter.close();
            return res;

    }

}
