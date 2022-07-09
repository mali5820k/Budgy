import Scanner

class Lexer():
    def __init__(self, currentToken=None, nextToken=None, currentLine=""):
        self.currentToken = currentToken
        self.nextToken = nextToken
        self.currentLine = currentLine
        self.currentWord = 0
    
    def set_scanner(scanner):
        self.currentLine = scanner.
    
    def consume_token():
        if self.currentWord >= len(currentLine.split()):
            self.currentWord = 0
            getNextLine()
        self.currentToken = self.nextToken
        self.currentWord += 1
        self.nextToken = self.currentLine[self.currentWord]
