# Copilot Instructions for AI Coding Agents

## Project Overview
This repository contains a collection of Java coding problems, organized by topic and data structure. Each folder represents a category (e.g., Arrays, LinkedList, Hashing, GreedyApproach) and contains multiple standalone Java files, each solving a specific problem. There is no central application or framework; solutions are independent and often include a `main` method for demonstration.

## Directory Structure
- **Top-level Java files**: Standalone solutions (e.g., `Main.java`, `Practice.java`, `BankAccount.java`).
- **Category folders**: Grouped by topic (e.g., `Arrays/`, `LinkedList/`, `Hashing/`, `GreedyApproach/`).
- **Subfolders**: May contain further breakdowns (e.g., `ArrayList/`, `Backtracking/`).
- **important question solution/**: Reserved for high-value or interview-style problems.

## Developer Workflows
- **Build**: Compile individual files using `javac <filename>.java`. No build scripts or project-wide build system detected.
- **Run**: Execute with `java <ClassName>`. For files in subfolders, use the correct package/class path.
- **Debug**: Use IDE features or add print statements. No custom debug tooling.
- **Test**: No formal test framework; validation is via `main` methods or manual inspection.

## Patterns & Conventions
- **No package declarations**: Most files do not use Java packages; class names must be unique across the codebase.
- **Class naming**: Classes are named after the problem (e.g., `MaxSubArray`, `heapSort`).
- **Method structure**: Solutions are typically in static methods or within the `main` method.
- **No external dependencies**: Pure Java, no third-party libraries.
- **No cross-file imports**: Each file is self-contained.
- **File organization**: Place new solutions in the appropriate topic folder. Use clear, descriptive filenames.

## Examples
- Arrays problems: See `Arrays/MaxSubArray.java`, `Arrays/ReverseArray.java`.
- Linked list problems: See `LinkedList/LinkedList.java`.
- Greedy algorithms: See `GreedyApproach/ActivitySelection.java`.

## Integration Points
- No external APIs, databases, or frameworks.
- No CI/CD or automation detected.

## Recommendations for AI Agents
- When adding new problems, follow the existing folder and naming conventions.
- Avoid introducing packages or dependencies unless explicitly requested.
- Document solutions with comments explaining logic, especially for complex algorithms.
- If updating multiple files, ensure class names remain unique to avoid conflicts.

---

_If any section is unclear or missing important details, please provide feedback to improve these instructions._
