import pyautogui
import time

# Delay before typing starts (in seconds)
start_delay = 5

# Text to type as keystrokes
code = '''# Check if the keyword is'''

# Wait for start delay
time.sleep(start_delay)

# Type the code string
pyautogui.typewrite(code, interval=0.05)
