# A
# A B
# A B C 
# A B C D 
# A B C D E

noOfRows = int(input("Enter number of rows: "))

def printPattern(num):
  val = 'A '
  currChar = 'A'

  if num < 1:
    return

  print(val)
  for row in range(1, num):
    currChar = chr(ord(currChar) + 1)
    val += currChar + " "
    print(val)

printPattern(noOfRows)
