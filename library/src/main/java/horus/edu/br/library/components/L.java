package horus.edu.br.library.components;

import android.util.Log;

/**
 * Default log class.
 * Created by Rodrigo on 21/08/2016.
 */
public class L {
    public static void w(String msg) {
        String fileName = new Exception().getStackTrace()[1].getFileName();
        Log.w(fileName, msg);
    }

    public static void w(String msg, Throwable throwable) {
        String fileName = throwable.getStackTrace()[1].getFileName();
        Log.w(fileName, msg);
    }

    public static void i(String msg) {
        String fileName = new Exception().getStackTrace()[1].getFileName();
        Log.i(fileName, msg);
    }

    public static void i(String msg, Throwable throwable) {
        String fileName = throwable.getStackTrace()[1].getFileName();
        Log.i(fileName, msg);
    }

    public static void d(String msg) {
        String fileName = new Exception().getStackTrace()[1].getFileName();
        Log.d(fileName, msg);
    }

    public static void d(String msg, Throwable throwable) {
        String fileName = throwable.getStackTrace()[1].getFileName();
        Log.d(fileName, msg);
    }

    public static void e(String msg) {
        String fileName = new Exception().getStackTrace()[1].getFileName();
        Log.e(fileName, msg);
    }

    public static void e(String msg, Throwable throwable) {
        String fileName = throwable.getStackTrace()[1].getFileName();
        Log.e(fileName, msg);
    }
}
