package com.example.imooc.utils;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import java.util.Random;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random rdm = new Random();


        Integer a = rdm.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(a);
    }
}
