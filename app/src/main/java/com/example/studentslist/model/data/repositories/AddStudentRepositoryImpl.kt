package com.example.studentslist.model.data.repositories

import com.example.studentslist.di.AddStudentRemoteQualifier
import com.example.studentslist.model.data.Student
import com.example.studentslist.model.data.repositories.sources.AddStudentDataSource
import io.reactivex.Single
import javax.inject.Inject


class AddStudentRepositoryImpl @Inject constructor(@AddStudentRemoteQualifier private val remoteDataSource: AddStudentDataSource) :
    AddStudentRepository {
    override suspend fun save(
        firstName: String,
        lastName: String,
        course: String,
        score: String
    ): Student {
      return remoteDataSource.save(firstName, lastName, course, score)
    }
}