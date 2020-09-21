package com.example.myapplication112;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.js.sendsms_example.R;

public class sendsms extends AppCompatActivity {
    Button btn_msg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_msg = findViewById(R.id.btn_msg);
//        et_text = findViewById(R.id.et_text);
//        et_phone = findViewById(R.id.et_phone);

        btn_msg.performClick();
//        String msg = et_text.getText().toString();
//        String phone = et_phone.getText().toString();
//
//        if (phone.length() > 0 && msg.length() > 0) {
//            sendSMS(phone, msg);
//        } else {
//            Toast.makeText(mContext, "모두 입력해 주세요", Toast.LENGTH_SHORT).show();
//        }
//
//
//    }
//    public void sendSMS(String smsNumber, String smsText){
//        PendingIntent sentIntent = PendingIntent.getBroadcast(this, 0, new Intent("SMS_SENT_ACTION"), 0);
//        PendingIntent deliveredIntent = PendingIntent.getBroadcast(this, 0, new Intent("SMS_DELIVERED_ACTION"), 0);
//
//        /*
//         * SMS가 발송될때 실행
//         * When the SMS massage has been sent
//         */
//        registerReceiver(new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                switch(getResultCode()){
//                    case Activity.RESULT_OK:
//                        // 전송 성공
//                        Toast.makeText(mContext, "전송 완료", Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
//                        // 전송 실패
//                        Toast.makeText(mContext, "전송 실패", Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_NO_SERVICE:
//                        // 서비스 지역 아님
//                        Toast.makeText(mContext, "서비스 지역이 아닙니다", Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_RADIO_OFF:
//                        // 무선 꺼짐
//                        Toast.makeText(mContext, "무선(Radio)가 꺼져있습니다", Toast.LENGTH_SHORT).show();
//                        break;
//                    case SmsManager.RESULT_ERROR_NULL_PDU:
//                        // PDU 실패
//                        Toast.makeText(mContext, "PDU Null", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        }, new IntentFilter("SMS_SENT_ACTION"));
//
//        /**
//         * SMS가 도착했을때 실행
//         * When the SMS massage has been delivered
//         */
//        registerReceiver(new BroadcastReceiver() {
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                switch (getResultCode()){
//                    case Activity.RESULT_OK:
//                        // 도착 완료
//                        Toast.makeText(mContext, "SMS 도착 완료", Toast.LENGTH_SHORT).show();
//                        break;
//                    case Activity.RESULT_CANCELED:
//                        // 도착 안됨
//                        Toast.makeText(mContext, "SMS 도착 실패", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        }, new IntentFilter("SMS_DELIVERED_ACTION"));
//
//        SmsManager mSmsManager = SmsManager.getDefault();
//        mSmsManager.sendTextMessage(smsNumber, null, smsText, sentIntent, deliveredIntent);
    }
}