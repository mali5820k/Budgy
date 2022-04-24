import sys
import os

# Custom build-system script for my project
# WIP (Work In Progress)
def main(args):
    cpp_std_version = "-std=c++17"
    src_directory = "./src"
    object_files_directory = "./build"
    output_binary_name = ""
    debug = "-g"
    flags = "-O3"
    src_files_list = []
    src_files = ""

    if (len(args) < 2):
        print("Check for ")
        print("Building the project files...")
        for file in os.listdir(src_directory):
            if file.endswith(".cpp"):
                src_files_list.append(file)
        
        src_files = ' '.join(str(string) for string in src_files_list)
        os.system(f"clang++ {debug} {cpp_std_version} {src_files} {flags} -o {output_binary_name}")
        os.system(f"mv {output_binary_name} ../{object_files_directory}")

if __name__ == "__main__": main(sys.argv)