package dev.jrge.request.credit.system.models

import java.math.BigDecimal

data class Customer(
    var firstName: String,
    var lastName: String,
    val cpf: String,
    var email: String,
    var password: String,
    var address: Address,
    var icome: BigDecimal,
    var credits: List<Credit>,
    val id: Long
)
