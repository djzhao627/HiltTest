package cn.djzhao.hilttest.model

import android.util.Log
import cn.djzhao.hilttest.tools.TAG
import javax.inject.Inject

/**
 * 汽油引擎
 *
 * @author djzhao
 * @date 21/04/01
 */
class GasEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Gas engine start")
    }

    override fun stop() {
        Log.d(TAG, "Gas engine stop")
    }
}