package com.difa.myapplication.item

import android.content.Context
import androidx.lifecycle.*
import com.difa.myapplication.core.data.Resource
import com.difa.myapplication.core.domain.model.ShowModel
import com.difa.myapplication.core.domain.usecase.ShowUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TvSeriesViewModel @Inject constructor(private val showUseCase: ShowUseCase): ViewModel() {

    private val page = MutableLiveData<Int>()

    fun setPage(page: Int){
        this.page.postValue(page)
    }

    fun getAllTv(category: Int, limit: Int, context: Context): LiveData<Resource<List<ShowModel>>> = page.switchMap {
        showUseCase.getAllTv(category, it, it * limit, context).asLiveData()
    }

}