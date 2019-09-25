class Sentence:
    def __init__(self, sentence):
        self.words = []
        c = -1

        for i in range(len(sentence)):
            if i == len(sentence) - 1:
                self.words.append(sentence[c+1:i+1])

            if sentence[i] == " ":
                self.words.append(sentence[c+1:i])
                c = i

    def wordsquantity(self):
        return len(self.words)

    def sort(self):
        return sorted(self.words)

    def capitalize(self):
        alphabet = {"a": "A", "b": "B", "c": "C", "d": "D", "e": "E", "f": "F", "g": "G", "h": "H", "i": "I", "j": "J", "k": "K", "l": "L", "m": "M",
                    "n": "N", "o": "O", "p": "P", "q": "Q", "r": "R", "s": "S", "t": "T", "u": "U", "v": "V", "w": "W", "x": "X", "y": "Y", "z": "Z"}

        for word in range(len(self.words)):
            self.words[word] = alphabet[self.words[word][0]] + self.words[word][1:]


sentence = Sentence(input())

print(sentence.words)
print(sentence.wordsquantity())
sentence.capitalize()
print(sentence.words)
print(sentence.sort())
