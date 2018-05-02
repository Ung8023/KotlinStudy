package com.ung8023.coroutine.async

import cn.kotliner.coroutine.common.HttpError
import cn.kotliner.coroutine.common.HttpException
import cn.kotliner.coroutine.common.HttpService
import cn.kotliner.coroutine.ui.LOGO_URL
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

fun startCoroutine(context: CoroutineContext = EmptyCoroutineContext, block: suspend () -> Unit) {
    block.startCoroutine(ContextContinuation(context + AsyncContext()))
}

suspend fun <T> runWithTime(block: CoroutineContext.() -> T)
    = suspendCoroutine<T> {
    continuation ->
    AsyncTask {
        try {
            continuation.resume(block(continuation.context))
        } catch (e: Exception) {
            continuation.resumeWithException(e)
        }
    }.execute()
}

fun loadImage2(url: String) : ByteArray {
    val responseBody = HttpService.service.getLogo(url).execute()
    if (responseBody.isSuccessful) {
        responseBody.body()?.byteStream()?.readBytes()?.let {
            return it
        }
        throw HttpException(HttpError.HTTP_ERROR_NO_DATA)
    }else {
        throw HttpException(responseBody.code())
    }
}
suspend fun loadImage(url: String) = suspendCoroutine<ByteArray> {
    continuation ->
//    val uiContinuation = UIContinuationWrapper(continuation)
    AsyncTask {
        try {
            val responseBody = HttpService.service.getLogo(url).execute()
            if (responseBody.isSuccessful) {
                responseBody.body()?.byteStream()?.readBytes()?.let{
//                    uiContinuation.resume(it)
                    continuation.resume(it)
                }
            } else {
//                    uiContinuation.resumeWithException(HttpException(responseBody.code()))
                continuation.resumeWithException(HttpException(responseBody.code()))
            }
        } catch (e: Exception) {
//            uiContinuation.resumeWithException(e)
            continuation.resumeWithException(e)
        }
    }.execute()
}