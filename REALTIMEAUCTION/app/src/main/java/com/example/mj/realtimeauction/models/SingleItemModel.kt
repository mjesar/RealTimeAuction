package com.example.mj.realtimeauction.models

/**
 * Created by pratap.kesaboyina on 01-12-2015.
 */
class SingleItemModel {


    var name: String? = null
    var url: String? = null
    var description: String? = null


    constructor() {}

    constructor(name: String, url: String) {
        this.name = name
        this.url = url
    }


}
