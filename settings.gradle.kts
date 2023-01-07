rootProject.name = "MagicSpellsParent"

include("core")

include(":nms:shared")
include(":nms:v1_19_R1")
include(":nms:v1_19_R2")

startParameter.isParallelProjectExecutionEnabled = true

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

