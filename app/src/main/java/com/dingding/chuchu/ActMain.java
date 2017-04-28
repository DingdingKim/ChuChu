package com.dingding.chuchu;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.luolc.emojirain.EmojiRainLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActMain extends Activity {
    @Bind(R.id.main_img_chu)
    ImageView img_chu;
    @Bind(R.id.main_tv_chu_name)
    TextView tv_chu_name;
    @Bind(R.id.main_lay_root)
    EmojiRainLayout lay_root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        ButterKnife.bind(this);

        // add emoji sources
        lay_root.addEmoji(R.drawable.melon_emoji);
    }

    @OnClick(R.id.main_img_chu)
    void onclickTvClick(){
        tv_chu_name.setText(R.string.chu_name);

        if(BuildConfig.FLAVOR.equals("melon")){
            lay_root.startDropping();
        }
//필요하다면 패키지명으로 구분해도될듯
//        if(getPackageName().equals("com.dingding.chuchu_strawberry")){
//            lay_root.startDropping();
//        }
    }
}
