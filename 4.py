class Program:
    def __init__(self, text):
        self.text = text

    def wordquantity(self, word):
        c = -1
        quantity = 0

        for i in range(len(self.text)):
            if i == len(self.text) - 1:
                if self.text[c+1:i+1] == word:
                    quantity += 1

            if self.text[i] == " ":
                if self.text[c+1:i] == word:
                    quantity += 1
                c = i

        return quantity


text = Program(input())
print(text.wordquantity(input()))
