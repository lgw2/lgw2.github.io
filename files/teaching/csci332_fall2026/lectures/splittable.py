from spellchecker import SpellChecker

english = SpellChecker(language="en")


def IsWord(text):
    word = text.lower()
    if len(word) == 1:
        return word in {"a", "i"}
    return word.isalpha() and word in english


A = "BLUESTEMUNITROBOT"
A = "SIXSIX"
n = len(A)


def splittable(i):
    if i >= n:
        return True
    else:
        for j in range(i, n + 1):
            if IsWord(A[i:j]):
                if splittable(j+1):
                    return True
    return False


print(splittable(0))
