package com.thelastpickle.tlpcluster.commands

import com.beust.jcommander.Parameters
import com.thelastpickle.tlpcluster.Utils

@Parameters(commandDescription = "Start cassandra on all nodes via service command")
class Start : ICommand {
    override fun execute() {
        println("Starting all nodes.")
        Utils.startCassandra()
    }
}