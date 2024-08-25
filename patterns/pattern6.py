# 1 2 3 4 5
# 1 2 3 4
# 1 2 3
# 1 2
# 1

noOfRows = int(input("Enter number of rows: "))

def getRow(num):
  if (num == 0):
    return ""
  return getRow(num - 1) + " "+ str(num)

for row in range(noOfRows, 0, -1):
  print(getRow(row))
