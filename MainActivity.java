package post.spencer.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopj.android.http.*;

import org.json.JSONObject;

import static java.net.Proxy.Type.HTTP;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url = "http://192.168.137.1/signinapp/registeruser.php";

try
{
    JSONObject user = new JSONObject();
    user.put("username", "AR");
    user.put("password", "passwpord");
    user.put("name", "ajul");
     AsyncHttpClient client = new AsyncHttpClient();

    StringEntity entity = new StringEntity(jsonParams.toString());
    entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));

    client.post(context, restApiUrl, entity, "application/json", responseHandler);

}
catch (Exception e)
{}
    }


}
