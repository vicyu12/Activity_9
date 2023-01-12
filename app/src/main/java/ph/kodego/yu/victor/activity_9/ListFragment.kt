package ph.kodego.yu.victor.activity_9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import ph.kodego.yu.victor.activity_9.adapter.GroceryItemAdapter
import ph.kodego.yu.victor.activity_9.databinding.FragmentListBinding
import ph.kodego.yu.victor.activity_9.model.GroceryItem

class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!
    private lateinit var groceryItemAdapter: GroceryItemAdapter
    private var groceryItems: ArrayList<GroceryItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        groceryItemAdapter = GroceryItemAdapter(groceryItems)
        binding.list2.layoutManager = LinearLayoutManager(activity)
        binding.list2.adapter = groceryItemAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    fun init () {
        groceryItems.add(GroceryItem("Lucky Me! Pancit Canton",13.50,R.drawable.pancit_canton))
        groceryItems.add(GroceryItem("Nescafe Strawberry Latte",12.00,R.drawable.nescafe_strawberry_latte))
        groceryItems.add(GroceryItem("Datu Puti BBQ-rrific Barbeque Marinade",84.50,R.drawable.datu_puti_bbqrific))
        groceryItems.add(GroceryItem("UFC Pieces & Stems Mushroom",55.25,R.drawable.ufc_mushroom))
        groceryItems.add(GroceryItem("Silver Swan Soy Sauce",54.75,R.drawable.silver_swan_soy_sauce))
        groceryItems.add(GroceryItem("Del Monte Filipino Style Party Pack",142.00,R.drawable.del_monte_party_pack))
        groceryItems.add(GroceryItem("Skyflakes Cracker Sandwhich Condensada",63.00,R.drawable.skyflakes_condensada))
        groceryItems.add(GroceryItem("Knorr Nido Oriental Style Chinese Soup Mix",51.00,R.drawable.knorr_nido))
        groceryItems.add(GroceryItem("Mang Tomas All Around Sarsa Regular",50.00,R.drawable.mang_tomas))
        groceryItems.add(GroceryItem("Datu Puti Patis",77.00,R.drawable.datu_puti_patis))
        groceryItems.add(GroceryItem("Datu Puti Oysterrific Oyster Sauce",97.50,R.drawable.datu_puti_oyster_sauce))
        groceryItems.add(GroceryItem("Mega Prime Whole Kernel Corn",39.75,R.drawable.mega_prime_corn))
        groceryItems.add(GroceryItem("Skyflakes Cracker Sandwhich Tsokolate",63.00,R.drawable.skyflakes_tsokolate))
        groceryItems.add(GroceryItem("Lucky Me! Cup Mini Instant Noodle Soup Chicken Sotanghon Lite",24.50,R.drawable.lucky_me_sotanghon))
        groceryItems.add(GroceryItem("Lucky Me! Cup Mini Instant Noodle Soup Jjamppong",24.50,R.drawable.lucky_me_jjampong))
        groceryItems.add(GroceryItem("Ufc Crab and Corn",51.25,R.drawable.ufc_crab_n_corn))
        groceryItems.add(GroceryItem("555 Fried Sardines Bistek",35.50,R.drawable.bistek))
        groceryItems.add(GroceryItem("Alaska 2-in-1 Crema-Asada Sweetened Thick Creamer",53.75,R.drawable.alaska_thickened_creamer))
        groceryItems.add(GroceryItem("555 Fried Sardines Tausi",35.50,R.drawable.tausi))
        groceryItems.add(GroceryItem("Dutch Mill Yoghurt Drink Strawberry Juice",21.50,R.drawable.dutch_mill_strawberry))
        groceryItems.add(GroceryItem("Century Corned Tuna",31.00,R.drawable.century_tuna_corned))
    }
}