import requests
from bs4 import BeautifulSoup
import urllib.parse

def search_google(query):
    results = []
    
    for page in range(1, 11):  # Searching on pages 1 to 10 of Google
        url = f"https://www.google.com/search?q={query}&start={str((page - 1) * 10)}"
        headers = {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
        }
        
        response = requests.get(url, headers=headers)
        soup = BeautifulSoup(response.text, "html.parser")
        
        search_results = soup.find_all("a")
      
      
             






        
        for result in search_results:
            link = result.get("href")
            if link and link.startswith("/url?q="):
                link = link[7:]  # Remove '/url?q=' from the start of the link
                if "prepinsta.com" in link:
                    decoded_link = urllib.parse.unquote(link)  # Decode URL-encoded characters
                    link_text = result.get_text()
                    results.append((decoded_link, link_text, page))
    
    return results

# Example usage:
query_text = "prepinsta"  # Replace with your desired search query
search_results = search_google(query_text)

if search_results:
    print(f"Search results for '{query_text}':")
    for result in search_results:
        print(f"Website: {result[0]} (Found on page: {result[2]})")
        print(f"Link Text: {result[1]}")
        print()
else:
    print(f"No results found for '{query_text}' on the first 10 pages of Google.")
