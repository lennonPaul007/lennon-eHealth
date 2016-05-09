def find_chars_NN(string1, string2):
    new_string = ""
    for ch in string1:
        for chs in string2:
            if ch == chs:
                new_string += ch
                break
    return new_string