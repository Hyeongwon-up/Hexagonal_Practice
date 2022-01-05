package com.example.hexagonal_practice.domain

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Receipt(

    @Id
    val orderId: Long,

    var money: Int

)