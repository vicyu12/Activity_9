package ph.kodego.yu.victor.activity_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.kodego.yu.victor.activity_9.adapter.GroceryItemAdapter
import ph.kodego.yu.victor.activity_9.databinding.ActivityMain2Binding
import ph.kodego.yu.victor.activity_9.model.GroceryItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var groceryItemAdapter: GroceryItemAdapter
    private var groceryItems: ArrayList<GroceryItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

        groceryItemAdapter = GroceryItemAdapter(groceryItems)
        binding.list.layoutManager = LinearLayoutManager(applicationContext)
        binding.list.adapter = groceryItemAdapter

    }

    fun init () {
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Nescafe Strawberry Latte",12.00))
        groceryItems.add(GroceryItem("Datu Puti BBQ-rrific Barbeque Marinade",84.50))
        groceryItems.add(GroceryItem("UFC Pieces & Stems Mushroom",55.25))
        groceryItems.add(GroceryItem("Silver Swan Soy Sauce",54.75))
        groceryItems.add(GroceryItem("Del Monte Filipino Style Party Pack",142.00))
        groceryItems.add(GroceryItem("Skyflakes Cracker Sandwhich Condensada",63.00))
        groceryItems.add(GroceryItem("Knorr Nido Oriental Style Chinese Soup Mix",51.00))
        groceryItems.add(GroceryItem("Mang Tomas All Around Sarsa Regular",50.00))
        groceryItems.add(GroceryItem("Datu Puti Patis",77.00))
        groceryItems.add(GroceryItem("Datu Puti Oysterrific Oyster Sauce",97.50))
        groceryItems.add(GroceryItem("Mega Prime Whole Kernel Corn",39.75))
        groceryItems.add(GroceryItem("Skyflakes Cracker Sandwhich Tsokolate",63.00))
        groceryItems.add(GroceryItem("Lucky Me! Cup Mini Instant Noodle Soup Chicken Sotanghon Lite",24.50))
        groceryItems.add(GroceryItem("Lucky Me! Cup Mini Instant Noodle Soup Jjamppong",24.50))
        groceryItems.add(GroceryItem("Ufc Crab and Corn",51.25))
        groceryItems.add(GroceryItem("555 Fried Sardines Bistek",35.50))
        groceryItems.add(GroceryItem("Alaska 2-in-1 Crema-Asada Sweetened Thick Creamer",53.75))
        groceryItems.add(GroceryItem("555 Fried Sardines Tausi",35.50))
        groceryItems.add(GroceryItem("Dutch Mill Yoghurt Drink Strawberry Juice",21.50))
        groceryItems.add(GroceryItem("LCentury Corned Tuna",31.00))
    }
}