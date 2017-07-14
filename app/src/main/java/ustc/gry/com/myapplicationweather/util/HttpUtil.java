package ustc.gry.com.myapplicationweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络请求
 * Created by GRY on 2017/7/13.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
