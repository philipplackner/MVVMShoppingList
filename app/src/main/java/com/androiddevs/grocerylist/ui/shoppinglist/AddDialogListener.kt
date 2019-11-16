package com.androiddevs.grocerylist.ui.shoppinglist

import com.androiddevs.grocerylist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}