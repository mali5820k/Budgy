import os

class Scanner():
    def __init__(self, filename=""):
        self.filename = filename
        self.current_line_number = 0
        self.current_line = ""
        
    def read_file(self, filename):
        if self.filename != filename:
            self.filename = filename
        self.current_file = open(self.filename, 'r')
        self.current_line = filename.readline

class Lexer():
    def __init__():
        pass

class Token(enum.Enum):
    IF = "if"
    ELSE = "else"
    WHILE = "while"
    FOR = "for"
    INT = "int"
    INT8 = "int8"
    INT32 = "int32"
    INT64 = "int64"

def main():
    
    pass


if __name__ == "__main__": main()
