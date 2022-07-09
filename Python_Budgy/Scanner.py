# Scans in source code from the provided source file and may be prompted to 
# Scan other derivative files if the particular line contains an import 
# statement for another file.
class Scanner():
    def __init__(self, filename=""):
        self.filename = filename
        self.current_line_number = 0
        self.current_line = ""
        self.all_lines = []
        
    def read_file(self, filename):
        if self.filename != filename:
            self.filename = filename
        self.current_file = open(self.filename, 'r')
        self.all_lines = filename.readlines()
        close(self.current_file)
