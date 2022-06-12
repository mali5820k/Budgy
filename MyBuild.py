import os

def main():
    os.system("powershell.exe rm KC++.jar")
    os.chdir("Java_KC++")
    os.system("javac *.java")
    os.system("jar cfe KC++.jar Main *.class")
    os.system("powershell.exe mv KC++.jar ../")
    os.system("powershell.exe rm *.class")


if __name__ == "__main__": main()
