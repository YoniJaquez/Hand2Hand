package com.nocountry.hand2hand.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nocountry.hand2hand.view.components.BottomNavigationBar
import com.nocountry.hand2hand.view.components.TopBar

@Composable
@Preview
fun InformacionPersonalScreenPreview(){
    InformacionPersonalScreen(navigation = rememberNavController())

}
@Composable
fun InformacionPersonalScreen(
    navigation: NavHostController
){
    var editarCampos by remember { mutableStateOf(true) }


    Column(
        modifier = Modifier
            .fillMaxSize()

            .background(color = Color(0xFffededed)),

        ) {
        TopBar("Informacion Personal"){navigation.popBackStack()}
        Divider()

//
        Spacer(modifier = Modifier.height(15.dp))
        LazyColumn(modifier = Modifier
            .background(color = Color(0xFffededed))
            .weight(1f)
            .padding(10.dp)
        ) {
            item {
                Column(){

                    if(editarCampos == true){
                        //campos para editar la informacion y boton guardar
//            Text(text = "Guardar")

                        TextItem(titulo = "Nombre")
                        TextItem(titulo = "Apellido")
                        TextItem(titulo = "Fecha de nacimiento")
                        TextItem(titulo = "telefono")
                        TextItem(titulo = "Direccion")


                        Button(onClick = { editarCampos = false },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF23675E)),
                            shape = RoundedCornerShape(10.dp)

                        ) {
                            Text(text = "Guardar",
                                modifier = Modifier
                            )
                        }


                    }
                    else{
                        //Text que muestren los datos y el boton editar
//            Text(text = "Editar")

                        Text( modifier = Modifier.padding(5.dp),
                            text = "Nombre",
                            fontSize = 15.sp,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold)
                        )
                        Text(text = "Nombre")

                        Text( modifier = Modifier.padding(5.dp),
                            text = "Apellido",
                            fontSize = 15.sp,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold)
                        )
                        Text(text = "Apellido")

                        Text( modifier = Modifier.padding(5.dp),
                            text = "Fecha de nacimiento",
                            fontSize = 15.sp,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold)
                        )
                        Text(text = "Fecha de nacimiento")

                        Text( modifier = Modifier.padding(5.dp),
                            text = "telefono",
                            fontSize = 15.sp,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold)
                        )
                        Text(text = "telefono")

                        Text( modifier = Modifier.padding(5.dp),
                            text = "Direccion",
                            fontSize = 15.sp,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold)
                        )
                        Text(text = "Direccion")


                        Button(onClick = { editarCampos = true },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF23675E)),
                            shape = RoundedCornerShape(10.dp)

                        ) {
                            Text(text = "Editar",
                                modifier = Modifier
                            )
                        }

                    }
                }
            }


        }

        BottomNavigationBar {
        }
    }
}

@Composable
fun TextItem(
    titulo : String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 5.dp)

    ) {

        Text( modifier = Modifier.padding(5.dp),
            text = titulo,
            fontSize = 15.sp,
            style = TextStyle(
                fontWeight = FontWeight.Bold)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                .border(width = 1.dp, color = Color(0xFF6f50e9), shape = RoundedCornerShape(10.dp))
                .padding(10.dp, 5.dp)

        ) {
            BasicTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(10.dp, 5.dp),
                value = " ",
                onValueChange = {}
            )
        }
    }
}