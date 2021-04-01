package cn.djzhao.hilttest.model

import android.util.Log
import cn.djzhao.hilttest.di.BindElectricEngine
import cn.djzhao.hilttest.di.BindGasEngine
import cn.djzhao.hilttest.tools.TAG
import javax.inject.Inject

/**
 * 货车
 *
 * @author djzhao
 * @date 21/04/01
 */
class Truck @Inject constructor(val driver: Driver) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    fun deliver() {
        gasEngine.start()
        electricEngine.start()
        Log.d(TAG, "Truck is delivering cargo. Driven by $driver")
        gasEngine.stop()
        electricEngine.stop()
    }
}