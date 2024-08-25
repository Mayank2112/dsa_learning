# * * * * *
# *       *
# *       *
# *       *
# * * * * *

noOfRows = int(input("Enter number of rows: "))

boundary = "* " * noOfRows
middle = "* " + "  " * (noOfRows - 2) + "* "

for i in range(noOfRows):
  if i == 0 or i == noOfRows - 1:
    print(boundary)
  else:
    print(middle)
