class GcdAndLcm:
    def __init__(self, a, b):
        self.gcd_val = 1

        if a >= b:
            self.a, self.b = a, b
        else:
            self.a, self.b = b, a

    def isfloat(self):
        return bool(self.a % 1) or bool(self.b % 1)

    def gcd(self, a, b):
        if b == 0:
            self.gcd_val = a
            return a
        else:
            return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a*b / self.gcd_val


integer1, integer2 = input(), input()
n = GcdAndLcm(float(integer1), float(integer2))

if n.isfloat():
    print("You've entered not an integer!")
else:
    n = GcdAndLcm(int(integer1), int(integer2))

    print("gcd of", n.a, "and", n.b, "is", int(n.gcd(n.a, n.b)))
    print("lcm of", n.a, "and", n.b, "is", int(n.lcm(n.a, n.b)))
