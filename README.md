# Krait-Script
  - A personal project that stems from an interest of creating compilers and programming languages.

### Option 1:
  - Create a compiler in C# that outputs IL to be ran on CLR as a .NET language.
  - Create a simple to learn scripting language that has comparable performance to compiled languages like C# and Java, and comparable simplicity to Python.
  - Cross-platform code, write once - run anywhere - mindset.
  
### Option 2:
  - Configure language implementation to output LLVM IR for increased performance
    OR:
  - Bootstrap the Krait-Script compiler with C++ to have a self-sustained compiler.
  - For both of the above approaches: 
      Create a simple to learn scripting language that has comparable performance to compiled languages like C# and Java, and comparable simplicity to Python.

### Optional Goals:
  - Include native data manipulation, i.e. binary, and hex arithmetic and value representation in strings and numbers in the script files. A binary number can be written as ```var a = 01111b2s;``` for signed base-2 binary and ```var b = 01111b2``` for unsigned base-2 binary.
  - Interface with .NET languages for actual usefulness in development applications like a networked server.
  - Capable of being compiled AOT (Ahead Of Time) for published applications.

### Which path to complete first?
  - Depending on the time it takes to learn and output IL for C#, if a working implementation is not possible within a short amount of time, then I will move directly to the 2nd stage of the project where all implementation details will be rewritten in C++. At that point, the repo will be updated to remove C# related 
