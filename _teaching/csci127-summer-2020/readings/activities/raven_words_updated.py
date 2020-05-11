f = open('raven.txt', 'r')

# create an empty dictionary

count = {}
for line in f:
    for word in line.split():

        # remove punctuation
        word = word.replace('_', '').replace('"', '').replace(',', '').replace('.', '')
        word = word.replace('-', '').replace('?', '').replace('!', '').replace("'", "")
        word = word.replace('(', '').replace(')', '').replace(':', '').replace('[', '')
        word = word.replace(']', '').replace(';', '')

        # ignore case
        word = word.lower()

        # add to dictionary
        if word in count:
            count[word] = count[word] + 1
        else:
            count[word] = 1

f.close()

# create an ordered list of keys
keys = list(count.keys())
keys.sort()

out = open('word_counts.txt', 'w')
# iterate over keys and write to file
for key in keys:
    out.write(key + ' ' + str(count[key]) + '\n')

out.close()

