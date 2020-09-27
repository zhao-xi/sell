package com.imooc.utils;

/*
* 用来生成键
* */

import java.util.Random;

public class KeyUtils {

    /*
    * 用来生成唯一的主键
    * 格式：时间+6位的随机数
    * */
    public static synchronized String genUniqueKey() { // synchronized关键字防止并发时产生主键重复（补补多线程啊
        Random random = new Random();
        Integer sixDigitsRand = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(sixDigitsRand);
    }
}
