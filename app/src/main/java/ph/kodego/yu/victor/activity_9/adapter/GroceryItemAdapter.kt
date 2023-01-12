package ph.kodego.yu.victor.activity_9.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.kodego.yu.victor.activity_9.databinding.GroceryitemItemBinding
import ph.kodego.yu.victor.activity_9.model.GroceryItem

class GroceryItemAdapter (var groceryItems: ArrayList<GroceryItem>):
    RecyclerView.Adapter<GroceryItemAdapter.GroceryItemViewHolder>(){

    override fun getItemCount(): Int {
        return groceryItems.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GroceryItemAdapter.GroceryItemViewHolder {
        val itemBinding = GroceryitemItemBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent, false)
        return GroceryItemViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: GroceryItemAdapter.GroceryItemViewHolder,
                                  position: Int) {
        holder.bindGroceryItem(groceryItems[position])
    }


    inner class GroceryItemViewHolder(private val itemBinding:GroceryitemItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener{

        var groceryItem = GroceryItem()

        init {
            itemView.setOnClickListener(this)
        }

        fun bindGroceryItem(groceryItem: GroceryItem){
            this.groceryItem = groceryItem

            itemBinding.groceryItems.text = "${groceryItem.item} | ${groceryItem.price}"
            itemBinding.icon.setImageResource(groceryItem.img)
//            itemBinding.btnDeleteRow.setOnClickListener {
//                Snackbar.make(itemBinding.root, "Delete by button",
//                    Snackbar.LENGTH_SHORT).show()
//
//                removeStudent(adapterPosition)
//            }
        }

        override fun onClick(p0: View?) {
        }
//
//        override fun onClick(v: View?){
//            Snackbar.make(itemBinding.root, "${student.lastname}, ${student.firstname}",
//                Snackbar.LENGTH_SHORT).show()
//
//            removeStudent(adapterPosition)
//        }
    }

}