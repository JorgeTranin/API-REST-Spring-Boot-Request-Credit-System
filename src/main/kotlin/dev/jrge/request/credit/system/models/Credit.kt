package dev.jrge.request.credit.system.models

import java.math.BigDecimal
import java.util.*

data class Credit(
    val creditCode : UUID,
    var creditValue: BigDecimal,
    val dayFirstInstallment: Date,
    val numberOfInstallment: Int,
    val status: Status,
    val customer: Customer,
    val id: Long

    )
