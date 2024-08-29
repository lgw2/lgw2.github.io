"""
FrequencyTable(Text, k)
    freqMap ← empty map
    n ← |Text|
    for i ← 0 to n − k
        Pattern ← Text(i, k)
        if freqMap[Pattern] doesn't exist
            freqMap[Pattern]← 1
        else
           freqMap[pattern] ←freqMap[pattern]+1 
    return freqMap
"""

def frequency_table(text, k):
    freq_map = dict()
    n = len(text)
    for i in range(1, n + 1- k):
        if text[i:i+k] not in freq_map:
            freq_map[text[i:i+k]] = 1
        else:
            freq_map[text[i:i+k]] += 1
    return freq_map

def max_map(freq_map):
    current_max = 0
    for key in freq_map:
        if freq_map[key] > current_max:
            current_max = freq_map[key]
    return current_max

# print(frequency_table("ACGTTTCACGTTTTACGG", 3))
# print(max_map({'ACG': 3, 'CGT': 2, 'GTT': 2, 'TTT': 3, 'TTC': 1, 'TCA': 1, 'CAC': 1, 'TTA': 1, 'TAC': 1, 'CGG': 1}))

# BetterFrequentWords(Text, k)
#     FrequentPatterns ← an array of empty strings
#     freqMap ← FrequencyTable(Text, k)
#     max ← MaxMap(freqMap)
#     for all strings Pattern in freqMap
#         if freqMap[pattern] = max
#             append Pattern to frequentPatterns
#     return frequentPatterns

def frequent_words(text: str, k: int) -> list[str]:
    """Find the most frequent k-mers in a given text."""
    freq_patterns = []
    freq_map = frequency_table(text, k)
    max_occurrences = max_map(freq_map)
    for pattern in freq_map:
        if freq_map[pattern] == max_occurrences:
            freq_patterns.append(pattern)
    return freq_patterns

# print(frequent_words("TGGTAGCGACGTTGGTCCCGCCGCTTGAGAATCTGGATGAACATAAGCTCCCACTTGGCTTATTCAGAGAACTGGTCAACACTTGTCTCTCCCAGCCAGGTCTGACCACCGGGCAACTTTTAGAGCACTATCGTGGTACAAATAATGCTGCCAC", 3))

# goal: read in file to a variable called text

with open('assignment_1/Vibrio_cholerae.txt', 'r') as file:
    lines = []
    for line in file:
        lines.append(line.strip())
    print(lines)