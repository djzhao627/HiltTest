package cn.djzhao.hilttest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cn.djzhao.hilttest.model.Truck
import cn.djzhao.hilttest.model.User
import cn.djzhao.hilttest.net.GithubService
import cn.djzhao.hilttest.tools.TAG
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        truck.deliver()
        val userInfo = retrofit.create(GithubService::class.java)
            .userInfo("djzhao627")
        userInfo.enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                Log.d(TAG, response.body().toString())
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                t.message?.let {
                    Log.d(TAG, it)
                }
            }

        })
    }
}