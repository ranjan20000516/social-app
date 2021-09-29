package com.example.appsoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appsoc.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePostActivity : AppCompatActivity() {

    val postDao=PostDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postButton.setOnClickListener {
            val text=createPost.text.toString().trim()
            if(text.isNotEmpty())
            {
            postDao.addPost(text)
              finish()
            }
        }
    }
}