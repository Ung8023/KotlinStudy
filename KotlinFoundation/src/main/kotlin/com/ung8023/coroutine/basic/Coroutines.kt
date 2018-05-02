package com.ung8023.coroutine.basic

import cn.kotliner.coroutine.common.HttpError
import cn.kotliner.coroutine.common.HttpException
import cn.kotliner.coroutine.common.HttpService
import cn.kotliner.coroutine.ui.LOGO_URL
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

fun startCoroutine(block: suspend () -> Unit) {
    block.startCoroutine(BaseCoroutinuation())
}

suspend fun loadImage(url: String) = suspendCoroutine<ByteArray> {
    continuation ->
    try {
        val responseBody = HttpService.service.getLogo(url).execute()
        if (responseBody.isSuccessful) {
            responseBody.body()?.byteStream()?.readBytes()?.let(continuation::resume)
        } else {
            continuation.resumeWithException(HttpException(responseBody.code()))
        }
    }catch (e: Exception) {
        continuation.resumeWithException(e)
    }
}