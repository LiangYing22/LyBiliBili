package com.innup.lybilibili.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MathUtil{

    companion object{

        /**
         * 加法
         */
        fun Add(i: Int, j: Int): Int {
            return i + j
        }

        /**
         * 模仿网络获取用户名
         */
        suspend fun getUserName() : String = withContext(Dispatchers.IO){
            delay(5000)
            return@withContext "登录延迟"
        }
    }


}