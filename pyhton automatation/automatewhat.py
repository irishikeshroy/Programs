import time
import schedule
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Download and install ChromeDriver: https://sites.google.com/a/chromium.org/chromedriver/downloads

# Launch Chrome and navigate to WhatsApp Web
driver = webdriver.Chrome()
driver.get('https://web.whatsapp.com/')
input('Scan the QR code and then press Enter to continue: ')

# Define function to select a group chat by name and enter the chat window
def select_chat(name):
    search = driver.find_element_by_xpath('//div[contains(@class,"copyable-text selectable-text")]')
    search.click()
    search.send_keys(name)
    search.send_keys(Keys.ENTER)
    time.sleep(5)

# Define function to type a particular message into the chat input field and send it
def send_message(message):
    message_box = driver.find_element_by_xpath('//div[contains(@class,"copyable-text selectable-text")]')
    message_box.send_keys(message)
    message_box.send_keys(Keys.ENTER)
    time.sleep(2)

# Define list of group chat names and messages
group_chats = ['Group Chat 1', 'Group Chat 2']
message = 'Hello, this is an automated message.'

# Define loop to iterate over list of group chat names and send message to each one
def send_messages():
    for chat in group_chats:
        select_chat(chat)
        send_message(message)

# Schedule loop to run every day at 9:00 AM
schedule.every().day.at('09:00').do(send_messages)

# Run the scheduled loop continuously
while True:
    schedule.run_pending()
    time.sleep(1)
