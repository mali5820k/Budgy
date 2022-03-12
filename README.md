# Monarch (as in Monarch Butterfly)
  - A personal project that stems from an interest of creating compilers and programming languages.
## Project Goals:
  - Construct a type-based language that is AOT compiled like C and C++ which can emulate high-level language constructs that are present in scripting languages. 
## Project Motivation:
  - The motivation for this project is the urge of having a low-level language that doesn't require too much time to pick up and start developing. This may not end up replacing any language, but it may become a usable tool that's versatile in its own right.

### Possible Choices for Implementation:
  - C++ using LLVM's provided API.
  - C++20 (modern C++), where the language's syntax is translated to C++, then compiled to LLVM IR through Clang (LLVM's frontend for C and C++).
  - Rust as it already uses LLVM. Through translating the language's syntax to Rust under-the-hood and then outputting LLVM IR, I can incorporate many of the features the Rust         language has to offer regarding memory safety, dangling pointers, and etc, without having to reconstruct those constructs from scratch in LLVM IR.
  - Go programming language with a library to interface more intuitively with the LLVM API. The Go library that makes a nice API to interface with LLVM IR is [here](https://github.com/llir/llvm). This will be the backbone in the Go implementation if I use this approach.

### Current Plan
  - Likely the Rust implementation. If that doesn't work out, then C++20, otherwise the Go library approach. If these options aren't achievable in a reasonable amount of time, I may simply port the language to Java's JVM and polish the language there.
