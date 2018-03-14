package com.liduo.kevin.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liduo.kevin.customview.circle.PieData;
import com.liduo.kevin.customview.circle.PieView;
import com.liduo.kevin.customview.circle.TaiJiCircle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PieView pieView;
    private TaiJiCircle tj;
    private float degrees = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void initViews() {
//        pieView = (PieView) findViewById(R.id.pieView);
        ArrayList<PieData> datas = new ArrayList<>();
        PieData pieData1 = new PieData("1", 50);
        PieData pieData2 = new PieData("2", 50);
        PieData pieData3 = new PieData("3", 60);
        PieData pieData4 = new PieData("4", 80);
        datas.add(pieData1);
        datas.add(pieData2);
        datas.add(pieData3);
        datas.add(pieData4);

        pieView.setData(datas);
        pieView.setStartAngle(-90);

//        tj = (TaiJiCircle) findViewById(R.id.tj);
//
//        final Handler handler = new Handler() {
//            private float degrees = 0;
//
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                tj.setRotate(degrees += 2);
//                this.sendEmptyMessageDelayed(0, 20);
//            }
//        };
//
//        handler.sendEmptyMessageDelayed(0, 20);
    }
}
