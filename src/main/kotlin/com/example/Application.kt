package com.example

import io.micronaut.context.annotation.ConfigurationInject
import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.runtime.Micronaut.run


fun main(args: Array<String>) {
    run(*args)
}

@ConfigurationProperties("abc")
class MyConfiguration
@ConfigurationInject constructor(
    val a: Int = 5,
)
