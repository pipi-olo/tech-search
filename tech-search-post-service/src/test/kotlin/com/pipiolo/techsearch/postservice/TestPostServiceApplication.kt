package com.pipiolo.techsearch.postservice

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<PostServiceApplication>().with(TestcontainersConfiguration::class).run(*args)
}
