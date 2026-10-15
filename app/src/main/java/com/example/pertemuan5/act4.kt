package com.example.pertemuan5


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier) {

    // variable-variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableSetOf( value = "") }
    var textAlamat by remember { mutableSetOf( value = "") }
    var textJK by remember { mutableSetOf( value = "") }
    val gender: List<String> = ListOf("Laki-laki", "Perempuan")

