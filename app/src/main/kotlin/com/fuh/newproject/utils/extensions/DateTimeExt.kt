package com.fuh.newproject.utils.extensions

import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.LocalTime
import org.threeten.bp.format.DateTimeFormatter

fun String.parseLocalDateTime(formatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME): LocalDateTime {
    return LocalDateTime.parse(this, formatter)
}

fun String.parseLocalDate(formatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE): LocalDate {
    return LocalDate.parse(this, formatter)
}

fun String.parseLocalTime(formatter: DateTimeFormatter = DateTimeFormatter.ISO_TIME): LocalTime {
    return LocalTime.parse(this, formatter)
}