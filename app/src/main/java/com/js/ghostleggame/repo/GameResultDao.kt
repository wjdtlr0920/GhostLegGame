package com.js.ghostleggame.repo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.js.ghostleggame.data.database.GameResult
import com.js.ghostleggame.data.dto.User

@Dao
interface GameResultDao {

    @Query("SELECT * FROM GameResult")
    fun getAll(): List<GameResult>

    @Insert
    fun insertGame(vararg gameResult : GameResult)

    @Delete
    fun delete(gameResult: GameResult)

}