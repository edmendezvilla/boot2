package com.example.demo28.controller

import com.example.demo28.Model.Model
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")

    /*class HomeController {
    @RequestMapping("/{id}")
    fun home(@PathVariable ("id") id : Int): String {
        return "HELLO WORD$id"

    }
    class HomeController {
        @RequestMapping()
        fun home(@PathParam ("id")id : Int) : String {
            return "HELLO WORD $id"


        }*/
class HomeController {
    @RequestMapping()
    fun home(@RequestBody model : Model) : String {
        return "HELLO WORD ${model.id} ${model.name} ${model.age}"


    }
}