package com.enzoftware.projects.di

import com.enzoftware.projects.QuoteHubApp

private fun component() = QuoteHubApp.component

fun loginPresenter() = component().loginPresenter()

fun registerPresenter() = component().registerPresenter()

fun allQuotesPresenter() = component().allQuotesPresenter()

fun favoriteQuotesPresenter() = component().favoriteQuotesPresenter()

fun profilePresenter() = component().profilePresenter()

fun addQuotePresenter() = component().addQuotePresenter()

fun welcomePresenter() = component().welcomePresenter()