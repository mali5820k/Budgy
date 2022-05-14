# Monarch (as in Monarch Butterfly)
  - A personal project that stems from an interest of creating compilers and programming languages.
## Project Goals:
  - Construct a type-based language that is AOT compiled like C and C++ which can emulate high-level language constructs that are present in scripting languages. 
  - Implement the following features:
      1. Simple/clean syntax
      2. OOP (not forced upon you like Java and C# do)
      3. Modular (can be extended with custom modules)
      4. Source code is cross-platform (compiled binaries are not what I mean by this, just the source code files)
      5. Provide C-like organization but takes inspiration from features found in scripting languages, ie optional garbage collection.
## Project Motivation:
  - The motivation for this project is the urge of having a low-level language that doesn't require too much time to pick up and start developing. This may not end up replacing any language, but it may become a usable tool that's versatile in its own right.

### Possible Choices for Implementation:
  - C++ using LLVM's provided API.
  - C++17-20 (modern C++), where the language's syntax is translated to C++, then compiled to LLVM IR through Clang (LLVM's frontend for C and C++).
  - Rust as it already uses LLVM. Through translating the language's syntax to Rust under-the-hood and then outputting LLVM IR, I can incorporate many of the features the Rust         language has to offer regarding memory safety, dangling pointers, and etc, without having to reconstruct those constructs from scratch in LLVM IR.
  - Compiling down to Rust. This allows for utilizing Rust's existing language to implement features without having to bootstrap my own compiler for Monarch. Ideally, this approach will hold out until the language is mature enough to be ported over to LLVM IR or any other target language.
  - Go programming language with a library to interface more intuitively with the LLVM API. The Go library that makes a nice API to interface with LLVM IR is [here](https://github.com/llir/llvm). This will be the backbone in the Go implementation if I use this approach.

### Current Plan
  - I want to go with the "Compiling down to Rust" implementation due to not having to worry about MSVC, GCC, Clang, or other variations of C/C++ compilers across multiple OS's and platforms. Go is the second candidate due to it's simplistic syntax that is comparable to that of C, however, due to the garbage collection penalty, I would prefer to use Rust for the most optimal runtime performance. Maybe for fun, I may make a Go implementation of Monarch that may or may not come to pass.
  - Being a solo-developer on this project, it's in my best interest to use Rust for the sake of catching errors early instead of manually spending time for debugging later.
