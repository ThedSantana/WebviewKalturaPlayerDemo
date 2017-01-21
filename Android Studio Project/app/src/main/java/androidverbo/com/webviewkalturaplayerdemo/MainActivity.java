package androidverbo.com.webviewkalturaplayerdemo;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


        myWebView = (WebView) findViewById(R.id.webView1);
        WebSettings webSettings = myWebView.getSettings();
        myWebView.setBackgroundColor(Color.TRANSPARENT);
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebChromeClient(new WebChromeClient());

        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        myWebView.getSettings().setBuiltInZoomControls(false);


        myWebView.loadUrl("file:///android_asset/webview.htm");
    }

    @Override
    public void onStop() {
        super.onStop();
        myWebView.loadUrl("about:blank");
        this.finish();
    }
}
