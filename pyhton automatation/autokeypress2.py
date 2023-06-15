import keyboard
import time

# Delay before typing starts (in seconds)
start_delay = 5

# Text to type as keystrokes
code = '''This is the area put you text you want to auto type.'''

# Wait for start delay
time.sleep(start_delay)

# Dictionary mapping special characters to keyboard combinations
special_chars = {
    # ASCII code 0-31
    '\x00': 'ctrl+@',
    '\x01': 'ctrl+a',
    '\x02': 'ctrl+b',
    '\x03': 'ctrl+c',
    '\x04': 'ctrl+d',
    '\x05': 'ctrl+e',
    '\x06': 'ctrl+f',
    '\x07': 'ctrl+g',
    '\x08': 'backspace',
    '\x09': 'tab',
    '\x0a': 'enter',
    '\x0b': 'ctrl+k',
    '\x0c': 'ctrl+l',
    '\x0d': 'enter',
    '\x0e': 'ctrl+n',
    '\x0f': 'ctrl+o',
    '\x10': 'ctrl+p',
    '\x11': 'ctrl+q',
    '\x12': 'ctrl+r',
    '\x13': 'ctrl+s',
    '\x14': 'ctrl+t',
    '\x15': 'ctrl+u',
    '\x16': 'ctrl+v',
    '\x17': 'ctrl+w',
    '\x18': 'ctrl+x',
    '\x19': 'ctrl+y',
    '\x1a': 'ctrl+z',
    '\x1b': 'esc',
    '\x1c': 'ctrl+\\',
    '\x1d': 'ctrl+]',
    '\x1e': 'ctrl+^',
    '\x1f': 'ctrl+_',
    # ASCII code 32-47
    ' ': 'space',
    '!': ['shift', '1'],
    '"': ['shift', '\''],
    '#': ['shift', '3'],
    '$': ['shift', '4'],
    '%': ['shift', '5'],
    '&': ['shift', '7'],
    '\'': ['\''],
    '(': ['shift', '9'],
    ')': ['shift', '0'],
    '*': ['shift', '8'],
    '+': ['shift', '='],
    ',': [','],
    '-': ['-'],
    '.': ['.'],
    '/': ['/'],
    # ASCII code 48-57
    '0': ['0'],
    '1': ['1'],
    '2': ['2'],
    '3': ['3'],
    '4': ['4'],
    '5': ['5'],
    '6': ['6'],
    '7': ['7'],
    '8': ['8'],
    '9': ['9'],
    # ASCII code 58-64
    ':': ['shift', ';'],
    ';': [';'],
    '<': ['shift', ','],
    '=': ['='],
    '>': ['shift', '.'],
    '?': ['shift', '/'],
    '@': ['shift', '2'],
    # ASCII code 65-90
'A': ['shift', 'a'],
'B': ['shift', 'b'],
'C': ['shift', 'c'],
'D': ['shift', 'd'],
'E': ['shift', 'e'],
'F': ['shift', 'f'],
'G': ['shift', 'g'],
'H': ['shift', 'h'],
'I': ['shift', 'i'],
'J': ['shift', 'j'],
'K': ['shift', 'k'],
'L': ['shift', 'l'],
'M': ['shift', 'm'],
'N': ['shift', 'n'],
'O': ['shift', 'o'],
'P': ['shift', 'p'],
'Q': ['shift', 'q'],
'R': ['shift', 'r'],
'S': ['shift', 's'],
'T': ['shift', 't'],
'U': ['shift', 'u'],
'V': ['shift', 'v'],
'W': ['shift', 'w'],
'X': ['shift', 'x'],
'Y': ['shift', 'y'],
'Z': ['shift', 'z'],
# ASCII code 91-96
'[': ['['],
'\\': ['\\'],
']': [']'],
'^': ['shift', '6'],
'_': ['shift', '-'],
'`': ['`'],
# ASCII code 97-122
'a': ['a'],
'b': ['b'],
'c': ['c'],
'd': ['d'],
'e': ['e'],
'f': ['f'],
'g': ['g'],
'h': ['h'],
'i': ['i'],
'j': ['j'],
'k': ['k'],
'l': ['l'],
'm': ['m'],
'n': ['n'],
'o': ['o'],
'p': ['p'],
'q': ['q'],
'r': ['r'],
's': ['s'],
't': ['t'],
'u': ['u'],
'v': ['v'],
'w': ['w'],
'x': ['x'],
'y': ['y'],
'z': ['z'],
# ASCII code 123-127
'{': ['shift', '['],
'|': ['shift', '\\'],
'}': ['shift', ']'],
'~': ['shift', '`'],
'': ['backspace'],
}

# Loop through each character in the code and type it as a keystroke
for char in code:
    if char in special_chars:
        # Type special character using keyboard combinations
        combo = special_chars[char]
        if isinstance(combo, str):
            keyboard.press(combo)
            keyboard.release(combo)
        else:
            for key in combo:
                keyboard.press(key)
            for key in reversed(combo):
                keyboard.release(key)
    else:
        # Type regular character
        keyboard.press(char)
        keyboard.release(char)
    time.sleep(0.05) # Delay between keystrokes
