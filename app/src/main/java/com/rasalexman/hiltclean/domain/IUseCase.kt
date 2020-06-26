package com.rasalexman.hiltclean.domain

import com.rasalexman.hiltclean.data.Result

interface IUseCase {
    interface Single<In : Any?, Out : Any> {
        suspend operator fun invoke(inputData: In): Result<Out>
    }

    interface Double<T1 : Any?, T2 : Any?, Out : Any> {
        suspend operator fun invoke(param1: T1, param2: T2): Result<Out>
    }
}