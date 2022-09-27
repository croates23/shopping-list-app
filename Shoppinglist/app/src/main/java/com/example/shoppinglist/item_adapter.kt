package com.example.shoppinglist

class ItemAdapter {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemTextView: TextView
        val priceTextView: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            itemTextView = itemView.findViewById(R.id.item_name)
            priceTextView = itemView.findViewById(R.id.item_price)
        }
    }
    }
}