# Krait-Script
  - A personal project that stems from an interest of creating compilers and programming languages.
## Available options for the project:
### Option 1:
  - Create a compiler in C# that outputs IL to be ran on CLR as a .NET language.
  - Create a simple to learn scripting language that has comparable performance to compiled languages like C# and Java, and comparable simplicity to Python.
  - Cross-platform code, write once - run anywhere - mindset.
### Option 2:
  - Create a compiler in C# that simply transpiles into C# instead of IL directly.
  - Create a simple to learn scripting language that has comparable performance to compiled languages like C# and Java, and comparable simplicity to Python.
  - Cross-platform code, write once - run anywhere - mindset.
### Option 3:
  - Configure language implementation to output LLVM IR for increased performance
    OR:
  - Bootstrap the Krait-Script compiler with C++ to have a self-sustained compiler.
  - For both of the above approaches: 
      Create a simple to learn scripting language that has comparable performance to compiled languages like C# and Java, and comparable simplicity to Python.

### Which option(s) did I go with?
  Option 3:
  - I originally was going to use C# for my compiler and compile KS to IL for use as a CLR language (Options 1 and 2), however, I am now swayed by LLVM and will incorporate the compiler for my language with LLVM as the backend. This approach is going to be C++, (possibly ANTLR), and LLVM IR to get the most performance and C-like experience with an AOT compiler approach. The LLVM backend will allow the language to hit the performance that's comparative to C and C++ like languages with optimized machine assembly, giving me more time to work on the front-end of the compiler with syntax and etc.

### Optional Goals:
  - Include native data manipulation, i.e. binary, and hex arithmetic and value representation in strings and numbers in the script files. A binary number can be written as ```var a = 01111b2s;``` for signed base-2 binary and ```var b = 01111b2``` for unsigned base-2 binary.
  - Interface with .NET languages for actual usefulness in development applications like a networked server.
  - Capable of being compiled AOT (Ahead Of Time) for published applications.
