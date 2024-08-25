#         A
#       A B A
#     A B C B A
#   A B C D C B A
# A B C D E D C B A

noOfRows = int(input("Enter number of rows: "))

def generateWords(num, char):
  if num <= 1:
    return char
  return char + " " + generateWords(num - 1, chr(ord(char) + 1)) + " " + char

for row in range(1, noOfRows + 1):
  print(" " * (noOfRows - row) * 2, generateWords(row, 'A'))
  
