import os

def main():
    os.chdir("Java_Monarch")
    os.system("javac *.java")
    os.system("jar cfe monarch.jar Main *.class")
    os.system("move monarch.jar ../")
    os.system("rm *.class")


if __name__ == "__main__": main()
