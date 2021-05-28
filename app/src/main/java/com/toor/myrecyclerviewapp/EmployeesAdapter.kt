package com.toor.myrecyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.toor.myrecyclerviewapp.model.EmployeeUiModel

class EmployeesAdapter(private val layoutInflater: LayoutInflater,
private  val imageLoader: ImageLoader): RecyclerView.Adapter<EmployeeViewHolder>() {
    private val employeesData = mutableListOf<EmployeeUiModel>()

    fun setData(employeesData: List<EmployeeUiModel>){
        this.employeesData.clear()
        this.employeesData.addAll(employeesData)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = layoutInflater.inflate(R.layout.item_employee,parent,false)
        return  EmployeeViewHolder(view, imageLoader)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.bindData(employeesData[position])
    }

    override fun getItemCount() = employeesData.size
}