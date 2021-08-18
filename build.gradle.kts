plugins {
    kotlin("multiplatform") version "1.5.21"
}

repositories {
    mavenCentral()
}

kotlin {
   linuxX64("native") { // on macOS
    binaries {
      sharedLib {
        baseName = "native" // on Linux and macOS
        // baseName = "libnative" // on Windows
      }
    }
  }
}

tasks.wrapper {
  gradleVersion = "7.1.1"
  distributionType = Wrapper.DistributionType.ALL
}
