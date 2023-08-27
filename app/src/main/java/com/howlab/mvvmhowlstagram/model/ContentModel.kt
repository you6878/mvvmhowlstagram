package com.howlab.mvvmhowlstagram.model

data class ContentModel(
    var explain : String? = null, //사진 설명
    var imageUrl : String? = null, //사진 주소
    var uid : String? = null, //유저 시퀀스값
    var userId : String? = null, //you6878@icloud.com
    var timestamp : Long? = null, //업로드 시간
    var favoriteCount : Int = 0, // 좋아요 카운트
    var favorites : MutableMap<String,Boolean> = HashMap()

){
    data class Comment(
        var uid : String? = null,
        var userId : String? = null,
        var comment : String? = null,
        var timestamp: Long? = null
    )
}

