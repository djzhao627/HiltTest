package cn.djzhao.hilttest.model

import android.util.Log
import cn.djzhao.hilttest.tools.TAG
import javax.inject.Inject

/**
 * 电能引擎
 *
 * @author djzhao
 * @date 21/04/01
 */
class ElectricEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Electric engine start")
    }

    override fun stop() {
        Log.d(TAG, "Electric engine stop")
    }
}