package cn.djzhao.hilttest.net

import cn.djzhao.hilttest.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * GitHub网络请求
 *
 * @author djzhao
 * @date 21/04/01
 */
interface GithubService {
    @GET("users/{user}")
    fun userInfo(@Path("user") user: String): Call<User>
}