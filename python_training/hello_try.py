\"\"\" Try do download a page from the internet when I say hi \"\"\"


import urllib.request

try:
webpage =  urllib.request.urlopen('http://www.google.com')
except:
    print('could not reach website in question')
else:
    for line in webpage:
        print(line)


