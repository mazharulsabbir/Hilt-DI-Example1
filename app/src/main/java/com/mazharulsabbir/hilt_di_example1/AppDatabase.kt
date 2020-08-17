package com.mazharulsabbir.hilt_di_example1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Log::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
}
