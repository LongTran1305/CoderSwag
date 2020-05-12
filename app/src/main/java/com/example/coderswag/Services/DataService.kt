package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf{
        Category("SHIRTS","shirtimage")
        Category("HOODIES","hoodieimage")
        Category("HAT","hatimage")
        Category("DIGITAL","digitalgoodsimage")
    }
    val hats = listOf(
        Product("Devlopes graphic Beanie","$20","hat01"),
        Product("Devlopes Hat Black","$25","hat02"),
        Product("Devlopes Hat White","$27","hat03"),
        Product("Devlopes Hat Snapback","$29","hat04")
    )

    val hoddies = listOf(
        Product("Devlopes Hoodie Gray","$28","hoodie01"),
        Product("Devlopes Hoodie Red","$23","hoodie02"),
        Product("Devlopes Hoodie Blue","$21","hoodie03"),
        Product("Devlopes Hoodie Yellow","$25","hoodie04")
    )

    val shirts = listOf(
        Product("Devlopes Shirt Black","$21","shirt01"),
        Product("Devlopes Shirt Banana","$27","shirt02"),
        Product("Devlopes Shirt Hawaii","$34","shirt03"),
        Product("Devlopes Shirt Honolulu","$36","shirt04")
    )
}