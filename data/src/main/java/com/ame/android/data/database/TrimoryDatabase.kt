package com.ame.android.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ame.android.data.model.UserEntity


@Database(
    entities = [
        UserEntity::class,
    ],
    version = 1
)
abstract class TrimoryDatabase : RoomDatabase() {
//    abstract fun baseDao() : BaseDao<Any>
}