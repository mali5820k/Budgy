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
  - C++ using LLVM's provided API to output LLVM IR.
  - C++17-20 (modern C++), where the language's syntax is translated to C++ then compiled to LLVM IR through Clang (LLVM's frontend for C and C++).
  - Rust, where Monarch gets compiled downto Rust. This allows for utilizing Rust's existing language to implement features without having to bootstrap my own compiler for Monarch.
  - Go programming language with a library to interface more intuitively with the LLVM API. The Go library that makes a nice API to interface with LLVM IR is [here](https://github.com/llir/llvm). The output LLVM IR code can then be statically linked to the libstdc++ library to provide the functionality that I want with regards to runtime features and that will allow the language to stand up on its own feet. This will be the backbone in the Go implementation if I use this approach.
  - Compiling down to another language and bootstrapping my own compiler. I really don't want to do this as I will have to handle optimizations on my own after the compiler is bootstrapped.
  - Java. Targetting the JVM by writing the compiler in Java, or another supporting JVM language, to output Java bytecode. This'll give me the bootstrapped compiler that I want and still have the performance of the JVM and the libraries and features of Java.

### Plans and experiences:
  - My experience with the Rust Programming language has been restricting and horrible due to my inexperience with it. From that alone, I don't feel motivated to continue using Rust for the compiler. 
  - Compiling down to C++ is one approach. This simply leverages the C++ compiler of choice and can result in utilizing existing tools to bootstrap the language for any targetted architecture, provided the original compiler is compiled from source.
  - Go is now the primary candidate for the LLVM IR approach, due to it's simplistic syntax that is comparable to that of C, however, due to the garbage collection penalty, I will likely generate LLVM IR using the library mentioned previously link the outputted IR with a runtime library of libstdc++ due to the GCC GNU licensing and website stating that there are no restrictions for linking or using this library, therefore the resulting binary won't be affected by the GPL or LGPL licenses.
  - Java is the primary candidate for the second approach, which is to utilize an ASM library in Java to output Java Bytecode to run on the JVM, or simply compile to Java and bootstrap off of Java features. I am leaning towards this approach from a practicality perspective, as it alleviates many of the concerns of library support and platform independent code. The only compromise that I'd be making is that I'd be utilizing the JIT compiler in the JVM. This could be mitigated with using GraalVM, which allows Java to be AOT compiled, which brings performance close to that of Go's.

### Current Plan:
  - I will be doing two main implementations of Monarch. One will be compiled to Java, which allows for JIT and AOT Java-performance depending on the use of the JVM or GraalVM, and the other implementation will be that which compiles to C++. Doing this allows for maximum usability and compatibility with Java; leveraging Java's cross-platform JVM and GraalVM, as well as the Java library ecosystem. And the C++ compile-target allows the language to have a non-garbage collected implementation, which should resemble more of C and C++ like performance at runtime and environment.
  - I have considered LLVM IR, and I still want to go back to learning it, but I'd be reinventing the wheel for adding features that an existing language already has. Therefore, I'm compiling down to existing languages and leveraging the feature-set of each ecosystem to make the most of the project.
  - Ultimately, the interopability between the two language implementations will be worked on once the language matures. My goal is to have a language that is performant and simple.
