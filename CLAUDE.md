# swagger-brake-maven-plugin

A Maven plugin that wraps the swagger-brake library, allowing API breaking change detection to be integrated into Maven builds as a lifecycle phase or explicit goal.

## Tech Stack

- Language: Java 21
- Build: Maven 3.9 (Maven Wrapper included)
- Testing: JUnit 4, AssertJ, Mockito
- Release: JReleaser

## Commands

```bash
# Build and run tests
./mvnw clean verify

# Deploy and release
./mvnw clean -Ppublication deploy jreleaser:full-release

# Run tests only
./mvnw test
```

## Project Structure

- `src/main/java/` - Plugin source code (Mojo implementations)
- `src/test/java/` - Unit tests
- `pom.xml` - Build configuration and plugin dependencies

## Key Notes

- The plugin delegates to the swagger-brake core library for the actual analysis
- Uses the `publication` Maven profile for release builds
- Plugin goal is `check` — invoked via `mvn swagger-brake:check`
