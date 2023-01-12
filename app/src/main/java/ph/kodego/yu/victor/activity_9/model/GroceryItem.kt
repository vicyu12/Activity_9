package ph.kodego.yu.victor.activity_9.model

import ph.kodego.yu.victor.activity_9.R

class GroceryItem (var item: String = "Unknown", var price: Double = 0.0, var img: Int) {
    constructor(): this("",0.0,R.drawable.groceryitems)
}