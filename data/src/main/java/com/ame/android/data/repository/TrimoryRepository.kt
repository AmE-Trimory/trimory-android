package com.ame.android.data.repository

import javax.inject.Inject

class TrimoryRepository @Inject constructor(
) : ITrimoryRepository {
    //Module에 의해 Inject가 된 객체를 활용하여 인터페이스를 구현하면 된다.
    override fun test(): String {
        return "test"
    }


}