import os

def main():
    os.system("powershell.exe rm monarch.jar")
    os.chdir("Java_Monarch")
    os.system("javac *.java")
    os.system("jar cfe monarch.jar Main *.class")
    os.system("powershell.exe mv monarch.jar ../")
    os.system("powershell.exe rm *.class")


if __name__ == "__main__": main()
