## Micronaut KSP fails on @ConfigurationProperties when an empty Kotlin file exists 

`./gradlew build` fails when `@ConfigurationProperties` annotation is used and an empty Kotlin file is present.

```terminaloutput
> Task :kspKotlin FAILED
e: [ksp] Error finalizing type visitor  [io.micronaut.context.visitor.ConfigurationMetadataWriterVisitor@263ecd75]: Access to invalid ksp.org.jetbrains.kotlin.analysis.api.platform.lifetime.KotlinAlwaysAccessibleLifetimeToken@62a1220d: PSI has changed since creation
e: [ksp] ksp.org.jetbrains.kotlin.analysis.api.lifetime.KaInvalidLifetimeOwnerAccessException: Access to invalid ksp.org.jetbrains.kotlin.analysis.api.platform.lifetime.KotlinAlwaysAccessibleLifetimeToken@62a1220d: PSI has changed since creation

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':kspKotlin'.
> A failure occurred while executing com.google.devtools.ksp.gradle.KspAAWorkerAction
   > KSP failed with exit code: PROCESSING_ERROR
```

Removing either the `MyConfiguration` class or `Empty.kt` file makes the build succeed.
