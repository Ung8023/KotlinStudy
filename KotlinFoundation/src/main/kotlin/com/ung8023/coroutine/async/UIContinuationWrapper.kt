package com.ung8023.coroutine.async

import javax.swing.SwingUtilities
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext

class UIContinuationWrapper<T>(val continuation: Continuation<T>) : Continuation<T> {
    override val context: CoroutineContext = continuation.context

    override fun resume(value: T) {
        SwingUtilities.invokeLater {
            continuation.resume(value)
        }
    }

    override fun resumeWithException(exception: Throwable) {
        SwingUtilities.invokeLater {
            continuation.resumeWithException(exception)
        }
    }

}