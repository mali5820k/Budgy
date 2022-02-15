# Monarch (as in Monarch Butterfly)
  - A personal project that stems from an interest of creating compilers and programming languages.
## Project Goals:
  - Construct a type-based language that is AOT compiled like C and C++ which can emulate high-level language constructs that are present in scripting languages. 
## Project Motivation:
  - The motivation for this project is the urge of having a low-level language that doesn't require too much time to pick up and start developing. This may not end up replacing any language, but it may become a usable tool that's versatile in its own right.

### Current Plan
  - I originally planned to use C# for my compiler to compile arc to IL for use as a CLR language, however, I am now swayed by LLVM and will implement the compiler for my language with LLVM as the backend. Compiling down to LLVM IR will allow me to focus on the frontend of the compiler as opposed to the optimizations and highly complex compiler operations, such as loop unrolling and function inlining. Due to this Ahead of Time (AOT) compiler approach, performance will be equal to or comparable to that of the C language. The LLVM backend will perform the heavy lifting to allow the language to hit the performance target.
  - The C# code (as of the time I am editing this README.md) is still there but labeled deprecated. In the future, I may or may not revisit it to make a .NET implementation of the language (using the opensource .NET versions to do so).

### Language Choice for Implementation:
  - The project could go two ways, one with C++ and native LLVM API calls, or the use of the Go programming language with a library to interface more intuitively with the LLVM API. I have no real problem with going with either option, however, for the sake of my own limited time, I will be using Go until it proves to be a hinderance for implementing features. The Go library that makes a nice API to interface with LLVM IR is [here](https://github.com/llir/llvm). This will be the backbone in the Go implementation.
