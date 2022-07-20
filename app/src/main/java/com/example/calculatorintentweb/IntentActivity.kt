package com.example.calculatorintentweb

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


lateinit var Buttonsms:Button
lateinit var Buttonshare:Button
lateinit var Buttonemail:Button
lateinit var Buttoncamera:Button
lateinit var Buttonmpesa:Button
lateinit var Buttoncall:Button

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Buttonshare=findViewById(R.id.btn_share)
        Buttonsms=findViewById(R.id.btn_sms)
        Buttonemail=findViewById(R.id.btn_email)
        Buttoncamera=findViewById(R.id.btn_camera)
        Buttonmpesa=findViewById(R.id.btn_mpesa)
        Buttoncall=findViewById(R.id.btn_call)


        Buttonsms.setOnClickListener {
            val uri:Uri= Uri.parse("send to:0712614623")
            val intent= Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Hello There","How is Today's weather?")
                    startActivity(intent)
        }
        Buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)


        }
        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }

        }

        Buttonmpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }

        Buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }
        Buttonemail.setOnClickListener {

            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
    }
}