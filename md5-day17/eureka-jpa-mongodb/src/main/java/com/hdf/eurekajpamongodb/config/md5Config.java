package com.hdf.eurekajpamongodb.config;

import lombok.extern.log4j.Log4j;
import sun.security.provider.MD5;

@Log4j
public class md5Config {

    public static void main(String[] args) {

        String str = "";
        MD5 md5 = new MD5();
        md5(str);

    }

    private static String md5(String str) {

        String  s = md5(str);

        return s;
    }
}
