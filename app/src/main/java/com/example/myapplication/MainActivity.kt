package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.KeyEvent
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // コンソールインスタンス生成
        val console = Console()

        // コンソールサービス
        val cs = ConsoleService()
        cs.console = console  // インスタンスをセット
        cs.textView = binding.consoleTextView  // ビューをセット
        cs.refresh()  // ビューのリフレッシュ

        // フォーム入力中にEnterキーでAdd
//        binding.inputForm.setOnKeyListener {view, i, keyEvent ->
//            if (keyEvent.action == KeyEvent.ACTION_UP && i == KeyEvent.KEYCODE_ENTER) {
//    val inputMethodManager = context?.
//         }
//        }

        // Addボタン
        binding.mybutton.setOnClickListener {
            // フォームに入力されているテキストをコンソールに追加表示
            cs.add(binding.inputForm.text.toString())
            // フォームをクリアする
            binding.inputForm.text.clear()
            // 一番下にスクロール
            binding.inputForm.scrollTo(0, binding.inputForm.bottom)
        }

        // Clearボタン
        binding.clearButton.setOnClickListener {
            cs.clear()
        }
    }
}