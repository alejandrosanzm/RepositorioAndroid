package com.meetspaceads.repositorioandroid

class Film(id: Int, title: String, originalTitle: String, date: String, note: Int, img: String) {
    private var id: Int = id
    private var title: String = title
    private var originalTitle: String = originalTitle
    private var date: String = date
    private var note: Int = note
    private var img: String = img

    fun gertId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getOriginalTitle(): String {
        return originalTitle
    }

    fun setOriginalTitle(originalTitle: String) {
        this.originalTitle = originalTitle
    }

    fun getDate(): String {
        return date
    }

    fun setDate(date: String) {
        this.date = date
    }

    fun getNote(): Int {
        return note
    }

    fun setNote(note: Int) {
        this.note = note
    }

    fun getImg(): String {
        return img
    }

    fun setImg(img: String){
        this.img=img
    }
}
