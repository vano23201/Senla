class IntAnalyzer:
    def __init__(self, n):
        self.num = n

    def isfloat(self):
        return bool(self.num % 1)

    def iseven(self):
        if self.num % 2 != 1:
            return True
        else:
            return False

    def isprime(self):
        if abs(self.num) <= 1:
            return False
        elif abs(self.num) == 2:
            return True

        if self.num % 2 == 0:
            return False

        i = 3

        while i*i <= self.num:
            if self.num % i == 0:
                return False
            i += 2

        return True


integer = input()
num = IntAnalyzer(float(integer.replace(",", ".")))

if num.isfloat():
    print("You've enter not an integer!")
else:
    num.num = int(integer)

    if num.iseven():
        print("Your number is even")
    else:
        print("Your number is odd")

    if num.isprime():
        print("Your number is prime")
    else:
        print("Your number isn't prime")
