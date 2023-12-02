package dev.jrge.request.credit.system.models

import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

data class Credit(
    val id: Long,
    val creditCode :UUID  = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallment: Int = 0,
    val status: Status = Status.IN_PROGRESS,
    val customer: Customer? = null
    )
