package com.proyectofinalargprog

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.proyectofinalargprog.viewmodel.VistaModelo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class VistaModeloUnitTest {
    private  lateinit var viewModel:VistaModelo
    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()

        private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        viewModel= VistaModelo()

    }

    @After
    fun tearDown(){
        Dispatchers.resetMain()

    }

    @Test
    fun mainVistaModelo_CheckInitialValue() = runTest {
        var valor = viewModel.compare.value?.resul
        assertEquals("sin resultados", valor)
    }
}