package com.gg.givemepass.textinputlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        account_layout.counterMaxLength = 10
        account_layout.isCounterEnabled = true
        account_layout.isErrorEnabled = true
        password_layout.counterMaxLength = 10
        password_layout.isCounterEnabled = true
        password_layout.isErrorEnabled = true
        login_button.setOnClickListener {
            if (account_edit.text.length > 10) {
                account_layout.error = "字數超過了"
            }
            if (password_edit.text.length > 10) {
                password_layout.error = "字數超過了"
            }
        }
    }
}
