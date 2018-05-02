package com.ung8023.coroutine.async

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext

class ContextContinuation(override val context: CoroutineContext) : Continuation<Unit> {
    override fun resume(value: Unit) {
    }

    override fun resumeWithException(exception: Throwable) {
    }

}