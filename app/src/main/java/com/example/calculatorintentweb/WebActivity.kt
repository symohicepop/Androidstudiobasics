package com.example.calculatorintentweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class WebActivity : AppCompatActivity() {
  lateinit var wb_View: WebView
  @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        wb_View=findViewById(R.id.webView)
        webview()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun  webview(){
        wb_View.webViewClient= WebViewClient()

        wb_View.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        if (wb_View.canGoBack())wb_View.goBack()else
        super.onBackPressed()
    }
        }
