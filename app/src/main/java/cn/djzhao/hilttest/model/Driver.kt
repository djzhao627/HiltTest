package cn.djzhao.hilttest.model

import cn.djzhao.hilttest.application.MyApplication
import javax.inject.Inject

/**
 * 司机
 *
 * @author djzhao
 * @date 21/04/01
 */
class Driver @Inject constructor(val application: MyApplication)