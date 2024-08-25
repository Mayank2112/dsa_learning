# *
# * *
# * * *
# * * * *
# * * * * *
# * * * *
# * * *
# * *
# *

iNum = int(input("Enter a number: "))

def printForward(num):
  if (num <= 0):
    return
  printForward(num - 1)
  print("* " * num)
  
def printBackward(num):
  if (num <= 0):
    return
  print("* " * num)
  printBackward(num - 1)

printForward(iNum)
printBackward(iNum - 1)
