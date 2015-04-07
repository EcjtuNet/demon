package ecjtu.net.demon;



import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by homker on 2015/4/7.
 */
public class HttpAsync {
    private static AsyncHttpClient client = new AsyncHttpClient();//ʵ��������
    static { client.setTimeout(5000); }
    public static void get(String url,AsyncHttpResponseHandler res){
        client.get(url,res);
    }
    public static void get(String url,RequestParams params,AsyncHttpResponseHandler res){
        client.get(url,params,res);
    }
    public static void get(String url,JsonHttpResponseHandler res){
        client.get(url,res);
    }
    public static void get(String url, RequestParams params ,JsonHttpResponseHandler res){
        client.get(url,params,res);
    }
    public static void get(String url,BinaryHttpResponseHandler handler){
        client.get(url,handler);
    }
    public static AsyncHttpClient getClient(){
        return client;
    }
}
