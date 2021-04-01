package cn.djzhao.hilttest.di

import android.app.Application
import cn.djzhao.hilttest.application.MyApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * ApplicationModule
 *
 * @author djzhao
 * @date 21/04/01
 */
@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    // Application Activity 可以直接由Hilt注入
    @Provides
    fun provideMyApplication(application: Application) = application as MyApplication
}