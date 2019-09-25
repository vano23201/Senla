def ispalindrome(n):
    a = []

    while n:
        a.append(n % 10)
        n //= 10

    for i in range(len(a) // 2):
        if a[i] != a[-i - 1]:
            return False

    return True


class Palindrome:
    def __init__(self, n):
        self.n = n

    def searchpalindromes(self):
        c = 0

        for i in range(1, self.n + 1):
            if ispalindrome(i):
                c += 1

        return c


palindrome = Palindrome(int(input()))
print(palindrome.searchpalindromes())
