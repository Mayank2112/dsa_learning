# A B C D E
# A B C D 
# A B C 
# A B
# A

noOfRows = int(input("Enter number of rows: "))

def printPattern(curr, val, char):
  if curr >= noOfRows:
    return val
  nextChar = chr(ord(char) + 1)
  val += nextChar + " "
  printPattern(curr + 1, val, nextChar)
  print(val)
  return char

if noOfRows > 0:
  print(printPattern(1, 'A ', 'A'))
