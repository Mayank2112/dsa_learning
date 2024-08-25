# A
# B B
# C C C
# D D D D
# E E E E E


noOfRows = int(input("Enter number of rows: "))
char = 'A'
for row in range(1, noOfRows + 1):
  print((char + " ") * row)
  char = chr(ord(char) + 1)
