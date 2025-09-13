package com.pipiolo.techsearch.postservice

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.chromadb.ChromaDBContainer
import org.testcontainers.utility.DockerImageName

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    fun chromaContainer(): ChromaDBContainer {
        return ChromaDBContainer(DockerImageName.parse("chromadb/chroma:latest"))
    }

}
