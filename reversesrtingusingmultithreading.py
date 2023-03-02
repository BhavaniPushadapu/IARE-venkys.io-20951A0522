import threading

def reverse_string(string):
    return string[::-1]

def threaded_reverse(strings):
    threads = []
    for string in strings:
        t = threading.Thread(target=reverse_string, args=(string,))
        threads.append(t)
        t.start()
    for thread in threads:
        thread.join()

strings = ["A changing magnetic field will induce a changing electric field and vice versa the two are linked. These changing fields form electromagnetic waves. Electromagnetic waves differ from mechanical waves in that they do not require a medium to propagate.
"]
threaded_reverse(strings)
print(strings)
