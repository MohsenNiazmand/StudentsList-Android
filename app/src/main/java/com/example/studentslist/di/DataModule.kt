package com.example.studentslist.di

import com.example.studentslist.model.data.repositories.AddStudentRepository
import com.example.studentslist.model.data.repositories.AddStudentRepositoryImpl
import com.example.studentslist.model.data.repositories.HomeRepository
import com.example.studentslist.model.data.repositories.HomeRepositoryImpl
import com.example.studentslist.model.data.repositories.sources.*
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
object DataModule {

    @Module
    @DisableInstallInCheck
    interface Bindings{
        @Binds
        @Singleton
        fun provideAddStudentRepository(addStudentRepositoryImpl: AddStudentRepositoryImpl) : AddStudentRepository

        @Binds
        @Singleton
        fun provideHomeRepository(homeRepositoryImpl: HomeRepositoryImpl):HomeRepository


        @Binds
        @Singleton
        @HomeLocalQualifier
        fun provideHomeLocalDataSource(homeLocalDataSource: HomeLocalDataSource) : HomeDataSource


        @Binds
        @Singleton
        @HomeRemoteQualifier
        fun provideHomeRemoteDataSource(homeRemoteDataSource: HomeRemoteDataSource) : HomeDataSource

        @Binds
        @Singleton
        @AddStudentRemoteQualifier
        fun provideAddStudentRemoteSource(addStudentRemoteDataSource: AddStudentRemoteDataSource):AddStudentDataSource

        @Binds
        @Singleton
        @AddStudentLocalQualifier
        fun provideAddStudentLocalSource(addStudentLocalDataSource: AddStudentLocalDataSource):AddStudentDataSource

    }

}