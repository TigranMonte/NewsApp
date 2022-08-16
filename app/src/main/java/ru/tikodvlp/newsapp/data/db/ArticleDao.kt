package ru.tikodvlp.newsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import ru.tikodvlp.newsapp.models.Article

@Dao
interface ArticleDao {

    @Query("SELECT * FROM articles")
    fun getAllArticles(): List<Article>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article)

    @Delete
    suspend fun delete(article: Article)
}