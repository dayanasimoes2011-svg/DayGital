# DAYGITAL

Academic Java project implementing an MVC architecture with AI analysis, reporting, and audit logging.

## Project Overview

- **Language**: Java 19 (GraalVM)
- **Architecture**: MVC (Model-View-Controller)
- **Build**: Manual javac compilation (no Maven/Gradle)

## Project Structure

```
src/main/java/com/daygital/
├── model/
│   └── BaseEntity.java      - Base entity with id, createdAt, updatedAt
├── controller/
│   └── RelatorioController.java  - Main controller and entry point
└── view/
    └── RelatorioView.java   - Console output / reporting view
out/                         - Compiled .class files (generated)
run.sh                       - Build and run script
```

## Running the Application

```bash
bash run.sh
```

This compiles all Java source files into `out/` and runs the `RelatorioController` main class.

## Workflow

- **Start application**: `bash run.sh` (console output type)
  - Compiles and runs the application, printing a report to the console.
