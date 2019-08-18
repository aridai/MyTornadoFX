rootProject.name = "MyTornadoFX"

include(":app")

include(":core-ui", ":core-application", ":core-data", ":core-domain")
project(":core-ui").projectDir = File("modules/core/core-ui")
project(":core-application").projectDir = File("modules/core/core-application")
project(":core-data").projectDir = File("modules/core/core-data")
project(":core-domain").projectDir = File("modules/core/core-domain")
