package vukan.com.notebook.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import vukan.com.notebook.database.AppRepository
import vukan.com.notebook.database.NoteEntity

class MainViewModel(var app: Application) : AndroidViewModel(app) {
    private val mRepository: AppRepository? = AppRepository.getInstance(app.applicationContext)
    val mNotes: LiveData<List<NoteEntity>>? = mRepository?.mNotes

    fun deleteAllNotes() {
        mRepository?.deleteAllNotes()
    }
}