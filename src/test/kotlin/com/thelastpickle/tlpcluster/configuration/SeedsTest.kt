package com.thelastpickle.tlpcluster.configuration

import org.junit.jupiter.api.Assertions.*

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeedsTest {
    @Test
    fun ensureSeedsCanBeRead() {
        val seedFile = this.javaClass.getResourceAsStream("seeds.txt")
        val seeds = Seeds.open(seedFile)
        assertThat(seeds.seeds).hasSize(3)
    }

}