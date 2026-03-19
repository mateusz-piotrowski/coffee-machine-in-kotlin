# Coffee Machine (Kotlin)

## Description

This project is a console-based Coffee Machine application written in Kotlin. It simulates the behavior of a real coffee machine that can:
- **Buy** different types of coffee (espresso, latte, cappuccino), reducing resources and increasing money.
- **Fill** the machine with supplies (water, milk, coffee beans, disposable cups).
- **Take** the accumulated money from the machine out.
- Check the **remaining** resources and balance in the machine.

The coffee machine operates in a continuous loop, handling various states interactively based on user input, until the `exit` command is entered.

## Motivation

This project was developed to practice object-oriented programming in Kotlin, including managing state, utilizing enumerations (Enum classes) for application flow control, and working with standard input/output.

## Stack & Requirements

- **Language:** Kotlin
- **Build System:** Gradle
- **JDK:** 17 or higher (recommended)

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd "Coffee Machine (Kotlin)"
   ```
2. Open the project in an IDE that supports Kotlin (e.g., IntelliJ IDEA).

### Running the Application

You can run the `Main.kt` file directly from your IDE, which is located in `Coffee Machine (Kotlin)/task/src/machine/Main.kt`.

Alternatively, use the Gradle wrapper from the command line:

```bash
./gradlew run
```

*Note: On Windows, use `gradlew.bat run`.*

## Scripts & Commands

- `./gradlew build`: Compiles the project and runs tests.
- `./gradlew run`: Executes the main application.
- `./gradlew test`: Runs the automated test suite.
- `./gradlew clean`: Deletes the build directory.

## Tests

The project includes tests powered by the `hs-test` framework. To run tests:

```bash
./gradlew test
```

## Project Structure

```text
.
├── Coffee Machine (Kotlin)
│   ├── task
│   │   ├── src/machine/Main.kt         # Main entry point
│   │   └── test/CoffeeMachineTest.java # Project tests
│   └── ... (stage-specific task files)
├── build.gradle                   # Gradle build configuration
├── settings.gradle                # Gradle project settings
└── ...
```

## Environment Variables

No specific environment variables are required for this project.

## Code of Conduct

Please review our [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for expected behavior.

## Contributing

Please see our [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute to this project.

## Contributor

Mateusz Piotrowski

## License

MIT

## Badges

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)
