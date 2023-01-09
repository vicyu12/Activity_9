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
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50))
    }
}