package com.wilsonrc.empleado.data.source.jobs

import com.wilsonrc.empleado.data.source.models.Job
import io.reactivex.Observable
import io.reactivex.Single

interface JobsDataSource {

    fun getJobs() : Observable<List<Job>>

    fun getJob(jobId: String): Single<Job>

}