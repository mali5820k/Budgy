import os

def main():
    executable_name = "Pudgy"
    os.system("powershell.exe rm KC++.jar")
    os.chdir(f"Java_{executable_name}")
    os.system("javac *.java")
    os.system(f"jar cfe {executable_name}.jar Main *.class")
    os.system(f"powershell.exe mv {executable_name}.jar ../")
    os.system("powershell.exe rm *.class")


if __name__ == "__main__": main()
