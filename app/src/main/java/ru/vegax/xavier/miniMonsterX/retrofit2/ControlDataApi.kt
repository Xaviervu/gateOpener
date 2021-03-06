package ru.vegax.xavier.miniMonsterX.retrofit2


import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Url
import ru.vegax.xavier.miniMonsterX.models.ControlData

interface ControlDataApi {

    @GET
    suspend fun getControlData(@Url url: String): ControlData

    @GET
    suspend fun setOutput(@Url url: String) // outputNumber 1..6; on = "1" off = "0"

    @GET
    suspend fun setImpulse(@Url url: String) // outputNumber 1..6

    //select thermostat 2
    //http://192.168.0.12/password/?therm_fs=1
    @GET
    suspend fun getThermalData(@Url url: String): ResponseBody //thermostat 0..5

}
