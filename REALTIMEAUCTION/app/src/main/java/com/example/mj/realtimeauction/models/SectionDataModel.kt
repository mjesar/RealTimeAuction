package com.example.mj.realtimeauction.models

import java.util.ArrayList

/**
 * Created by pratap.kesaboyina on 30-11-2015.
 */
class SectionDataModel {


    var headerTitle: String? = null
    var allItemsInSection: ArrayList<SingleItemModel>? = null


    constructor() {

    }

    constructor(headerTitle: String, allItemsInSection: ArrayList<SingleItemModel>) {
        this.headerTitle = headerTitle
        this.allItemsInSection = allItemsInSection
    }


}
