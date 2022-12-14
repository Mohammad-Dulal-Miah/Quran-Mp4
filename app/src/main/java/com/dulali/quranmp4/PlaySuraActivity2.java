package com.dulali.quranmp4;

import static com.dulali.quranmp4.SuraActivity.j;
import static com.dulali.quranmp4.SuraActivity.sura_names;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

public class PlaySuraActivity2 extends AppCompatActivity implements MaxAdListener {
    TextView text;
    WebView webView;
    private MaxAdView adView;
    String suraVideo[] = {"https://www.youtube.com/embed/-PqP0BCiTlE" , "https://www.youtube.com/embed/X2YnP50cwNU","https://www.youtube.com/embed/GKYePN8vkYs","https://www.youtube.com/embed/TjNgppGSSpk",
            "https://www.youtube.com/embed/M_L14cyMWYU","https://www.youtube.com/embed/AS7GaWq6OAk","https://www.youtube.com/embed/zOZsaMr-6RA","https://www.youtube.com/embed/RDADq-Ni7b0",
            "https://www.youtube.com/embed/WEkenhA5mPU","https://www.youtube.com/embed/UTIDryXbyoI","https://www.youtube.com/embed/SqXHF9Y_eOQ","https://www.youtube.com/embed/EFSJXdVAtBQ",
            "https://www.youtube.com/embed/3Ol6qfCD-YI","https://www.youtube.com/embed/r1rttkN95fM","https://www.youtube.com/embed/dgQSemmd5d0","https://www.youtube.com/embed/jgNs5039BnQ",
            "https://www.youtube.com/embed/Ji9VhvNEF1k","https://www.youtube.com/embed/pzjDCuvJIKw","https://www.youtube.com/embed/2F8puRkwWWw","https://www.youtube.com/embed/7ucKCP0rrZU",
            "https://www.youtube.com/embed/0VbXvzUB4aI","https://www.youtube.com/embed/fEQ4yD2SqqE","https://www.youtube.com/embed/8EgqBOqEUso","https://www.youtube.com/embed/YMkfZ6XfZvA",
            "https://www.youtube.com/embed/q3-gqFBLRpo","https://www.youtube.com/embed/M9hILQS0Ook","https://www.youtube.com/embed/OsY9aFxsDeE","https://www.youtube.com/embed/qgeHsDYqjpM",
            "https://www.youtube.com/embed/hVQpebO1UcE","https://www.youtube.com/embed/-Aw02WCllZ4","https://www.youtube.com/embed/xADd7wBw2P4","https://www.youtube.com/embed/6ZvDSoujDJ4",
            "https://www.youtube.com/embed/v-0e5ikSFjI","https://www.youtube.com/embed/irPfsxbO4C4","https://www.youtube.com/embed/58N7lz_X2-w","https://www.youtube.com/embed/Cz7k4MeByfw",
            "https://www.youtube.com/embed/pXw15NhydoM","https://www.youtube.com/embed/82cgIyrsFTw","https://www.youtube.com/embed/_Q9FhD4JDeY","https://www.youtube.com/embed/obimeD7P5wE",
            "https://www.youtube.com/embed/D33ewkq0Y1A" , "https://www.youtube.com/embed/TeUyzKXhebE","https://www.youtube.com/embed/jjgQbfrz-C4","https://www.youtube.com/embed/xa-XjV0kfQI",
            "https://www.youtube.com/embed/D7JHBkGMCl8","https://www.youtube.com/embed/2z6ekqGQ4lE","https://www.youtube.com/embed/u8EEQdR-A0A","https://www.youtube.com/embed/yY-hD9nj9-k",
            "https://www.youtube.com/embed/FIdWk4pUwsA","https://www.youtube.com/embed/xhFH8IYMG8A","https://www.youtube.com/embed/cXImo1zUwBo","https://www.youtube.com/embed/UiJJ2RURvTU",
            "https://www.youtube.com/embed/9Q6F4NLzAlw","https://www.youtube.com/embed/Qppa350MFGQ","https://www.youtube.com/embed/GnnD7YUWybI","https://www.youtube.com/embed/cUxuM6QvdCk",
            "https://www.youtube.com/embed/_GInHNRssXc","https://www.youtube.com/embed/3XvlnRzxvhA","https://www.youtube.com/embed/_tlpHR3qmx8","https://www.youtube.com/embed/oVM0yBJEJKY",
            "https://www.youtube.com/embed/41Lqn6awWmU","https://www.youtube.com/embed/gofmgdn18Ec","https://www.youtube.com/embed/wwRciCrJ9Y4","https://www.youtube.com/embed/ePskwbqAc5o",
            "https://www.youtube.com/embed/I1-yePcuKVk","https://www.youtube.com/embed/suS_Lxd2pr4","https://www.youtube.com/embed/eLX32c_zen8","https://www.youtube.com/embed/_2b73KAzx1c",
            "https://www.youtube.com/embed/uOWWZNrNwms","https://www.youtube.com/embed/qRolJw364gc","https://www.youtube.com/embed/xpJXVwAE-_Y","https://www.youtube.com/embed/-AQoVSiG-1I",
            "https://www.youtube.com/embed/nnRKwEcbkoA","https://www.youtube.com/embed/RZER9JZxHI8","https://www.youtube.com/embed/ChTYOtVBws4","https://www.youtube.com/embed/BDWPiktFwNI",
            "https://www.youtube.com/embed/lfIu4_PhLQc","https://www.youtube.com/embed/SClgFCzLxug","https://www.youtube.com/embed/azRV6zSEXvo","https://www.youtube.com/embed/_mkAXvq8RJo",
            "https://www.youtube.com/embed/GqnrxXEapQE","https://www.youtube.com/embed/2bTvDIJXXD4","https://www.youtube.com/embed/Id5VJNf3WZk","https://www.youtube.com/embed/txwJgHcdVQw",
             "https://www.youtube.com/embed/pVqAMriOMdQ","https://www.youtube.com/embed/GQRA0CXHADM","https://www.youtube.com/embed/yZYsafQfs0E","https://www.youtube.com/embed/f0wpAb9PWnY",
            "https://www.youtube.com/embed/s8IF9a3f4Fo","https://www.youtube.com/embed/Pc104KD3SkM","https://www.youtube.com/embed/EySmetTZVTo","https://www.youtube.com/embed/ikSPEqQu_B0",
             "https://www.youtube.com/embed/jOZx0qTs8V8","https://www.youtube.com/embed/54sDnD64Jxg","https://www.youtube.com/embed/jE2zMZuW_I0","https://www.youtube.com/embed/3cxUvU0_UUc",
             "https://www.youtube.com/embed/3RLNnB4-0aQ","https://www.youtube.com/embed/deepnOmu-ro","https://www.youtube.com/embed/MVYgSIYxFPk","https://www.youtube.com/embed/aX1ZsCBHWPg",
              "https://www.youtube.com/embed/ZOwgVu-6JLw","https://www.youtube.com/embed/qTr8xoK_f2w","https://www.youtube.com/embed/o53bZn6r0NU","https://www.youtube.com/embed/QTwcip9X4jM",
             "https://www.youtube.com/embed/N_n66P0LmhM","https://www.youtube.com/embed/_JIWU7LRXPQ","https://www.youtube.com/embed/M_AQypUDVFc","https://www.youtube.com/embed/DF33suYLzDc",
            "https://www.youtube.com/embed/UbXpU7yn8S4","https://www.youtube.com/embed/uDytOHFVw2Q","https://www.youtube.com/embed/NMW1qb4L4aM","https://www.youtube.com/embed/uv3VXLVK6FQ",
            "https://www.youtube.com/embed/DzgsucoYeew","https://www.youtube.com/embed/CXKGAsFQCrY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sura2);

        text = findViewById(R.id.text);
        webView = findViewById(R.id.webView);


        text.setText(sura_names[j]);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(suraVideo[j]);


        AppLovinSdk.getInstance( PlaySuraActivity2.this ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( PlaySuraActivity2.this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                // AppLovin SDK is initialized, start loading ads
            }
        } );

        adView= findViewById(R.id.adView);
        adView.loadAd();
    }


    @Override
    public void onAdLoaded(MaxAd ad) {

    }

    @Override
    public void onAdDisplayed(MaxAd ad) {

    }

    @Override
    public void onAdHidden(MaxAd ad) {

    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {

    }
}