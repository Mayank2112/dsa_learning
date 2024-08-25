# E
# D E
# C D E
# B C D E
# A B C D E

noOfRows = int(input("Enter number of rows: "))

def printPattern(num):
  if num < 1:
    return

  val = ""
  char = chr(ord('A') + num)
  for row in range(num):
    char = chr(ord(char) - 1)
    val = char + " " + val
    print(val)

printPattern(noOfRows)
