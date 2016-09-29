package com.gquittet.skatiest.logs;

import com.gquittet.skatiest.assets.AssetsLoader;

/**
 * Created by Guillaume QUITTET on 29-09-16.
 */
public class Log {

    public static void info(String message) {
        System.out.println("[Info]: "+message+".");
    }

    public static void error(String message) {
        System.err.println("[Error]:"+message+"!");
    }

    public static void fatal(String message) {
        System.err.println("[Fatal]:"+message+"!");
        AssetsLoader.dispose();
        System.exit(-1);
    }
}
