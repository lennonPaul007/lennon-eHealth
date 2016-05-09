def find_char_N(string1, string2):
    new_string = ""
    infoset = set(list(string2))
    for ch in string1:
        if ch in infoset:
            new_string += ch
    return new_string
