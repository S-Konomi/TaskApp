package jp.techacademy.konomi.sugiura.taskapp

import java.io.Serializable
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Task : RealmObject(), Serializable {
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時
    var category:String = ""   //カテゴリー

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}