def reverse(string):
  l=len(string)
  if l==0:
    return
  else:
    retrun reverse(string[1:])+string[0]
string=input("")
print(reverse(string))
