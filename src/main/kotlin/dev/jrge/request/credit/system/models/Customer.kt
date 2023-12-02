package dev.jrge.request.credit.system.models

import java.math.BigDecimal

data class Customer(
    val id: Long? = null,
    var firstName: String = "",
    var lastName: String = "",
    val cpf: String = "",
    var email: String = "",
    var password: String = "",
    var address: Address= Address(),
    var icome: BigDecimal = BigDecimal.ZERO,
    var credits: List<Credit> = mutableListOf()
    )
