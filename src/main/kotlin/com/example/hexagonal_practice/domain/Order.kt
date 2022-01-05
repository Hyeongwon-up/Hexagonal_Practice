package com.example.hexagonal_practice.domain

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Order(

    @Id
    val id: Long,
    var money: Int

) {

    var orderState: OrderState = OrderState.PREPARE

    fun place() {
        this.orderState = OrderState.COMPLETE
    }

}